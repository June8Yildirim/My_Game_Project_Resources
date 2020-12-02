import java.util.Scanner;

public class GoFishGame
{
   public static Scanner input = new Scanner(System.in);
   private Deck stock;
   private Deck userHand;
   private Deck cpHand;
   private boolean win;
   private int userBooks, cpBooks;
   
   public GoFishGame()
   {
      stock = new Deck();
      stock.fillDeck();
      userHand = new Deck();
      cpHand = new Deck();
      win = false;
      userBooks = cpBooks = 0;
   }

   public void lobby()
   {
      System.out.println("\n\n[1] Play Go Fish\n[2] Rules of Go Fish");
      int lobby = input.nextInt();
      while(lobby > 2 || lobby < 1)
      {
         System.out.println("Invalid input, 1 or 2 Only!\nTry Again.");
         lobby = input.nextInt();
      }
      switch(lobby)
      {
         case 1:
            playGoFish();
            break;
         case 2:
            System.out.println("\n\nRULES:\n" +
                               "The User and the Oppent(Computer) both start with" +
                               " 7 cards. The user\nasks for a Card by entering the value" +
                               " as a number. Ace is 1 and Jack,\nQueen,King are 11,12,13." +
                               "If the card you've asked for is contained in\nthe deck of" +
                               " the oppent then you get all of their cards with that value.\n" +
                               "If guessed incorrectly the player must draw from the Table Deck." +
                               " If the\ncard drawn from the Table Deck then the player goes again." +
                               "The game ends\nif either the Table Deck, User Hand, or Computer" +
                               " Hand are empty. The \nplayer with the most Books, which are 4 cards" +
                               " of the same value, wins \nthe game.\n\t\tPress Enter to start the Game");
            input.nextLine();
            input.nextLine();
            playGoFish();
            break;
      }
      
   }
   public void playGoFish()
   {
      initializeStartingHands();
      checkBegginingDeal();
      
      do
      {
         userTurn();
         checkForGameOver();
         
         compTurn();
         checkForGameOver();
         
      }while(!win);
      
      System.out.println("Game Over!");
      displayWinner();
   }
   
   public void initializeStartingHands()
   {
      for(int i = 0; i<7; i++)
      {
         userHand.insertCard(stock.deleteAnyCard());
         cpHand.insertCard(stock.deleteAnyCard());
      }
   }
   
   public void checkBegginingDeal()
   {
      int userBegDeal = userHand.checkBookBegginingDeal();
      if(userBegDeal != 0)
      {
         System.out.println("Wow! You got extremely lucky and got a book " +
                            "on the deal of the value " + userBegDeal + 
                            "\nThat puts you at 1 Book already!");
         pause();
         userBooks++;
      }

      int cpBegDeal = cpHand.checkBookBegginingDeal();
      if(cpBegDeal != 0)
      {
         System.out.println("Wow! The computer got extremely lucky and got a " +
                            "book on the deal of the value " + cpBegDeal + 
                            "\nThat puts the computer at 1 Book already!");
         pause();
         cpBooks++;
      }
   }
   
   public void userTurn()
   {
      boolean retryUser = false;
      do
      {  
         retryUser = false;
         if(!win)
         {
            Card drawnCard = null;
            System.out.println(userHand);
            System.out.println("Which value would you like to ask for?");
            int value = input.nextInt();
            while(userHand.getCount(value) == 0)
            {
               System.out.println("That Value isnt already contained in your deck, " +
                                     "Please enter another value");
               value = input.nextInt();
            }
            int hits = cpHand.getCount(value);
            if(hits == 0)
            {
               System.out.println("Go Fish!");
               drawnCard = stock.deleteAnyCard();
               if(drawnCard.getValue() == value)
               {
                  userHand.insertCard(drawnCard);
                  retryUser = true;
                  System.out.println("Drawn Card: " + drawnCard);
                  System.out.println("Lucky Draw! Go again.");
                  pause();
               }else
               {
                 System.out.println("Drawn Card: " + drawnCard);
                 userHand.insertCard(drawnCard);
                 pause();
               }
               int countAfterGoFish = userHand.getCount(drawnCard.getValue());
               if(countAfterGoFish == 4)
               {
                  userBooks++;
                  System.out.println("With that Go Fish draw you've just completed a Book" +
                                     " with the value " + drawnCard.getValue() + "\n" +
                                     "You now have : " + userBooks + " Books\n" +
                                     "And the computer has : " + cpBooks + " Books");
                  pause();
                  for(int i = 0; i<4; i++)
                  {
                      userHand.deleteValue(drawnCard.getValue());
                  }
               }
               if(retryUser)
               {
                  checkForGameOver();
               } 
            }else if(!retryUser && hits >= 1)
            {
               for(int i = 0; i < hits; i++)
               {
                  userHand.insertCard(cpHand.deleteValue(value));
               }
               System.out.println("The Computer had " + hits + " of those cards");
               retryUser = false;
               pause();
               int countAfterSteal = userHand.getCount(value);
               if(countAfterSteal == 4)
               {
                  userBooks++;
                  System.out.println("You just got a book from stealing the computer's card(s)" +
                                     " with the value " + value + "\n" +
                                     "You now have : " + userBooks + " Books\n" +
                                     "The computer currently has : " + cpBooks + " Books");
                  pause();
                  for(int i = 0; i<4; i++)
                  {
                     userHand.deleteValue(value);
                  }
               }
   
            }
         }
      }while(retryUser);
   }
   
   public void compTurn()
   {
      boolean retryComp = false;
      do
      {
         retryComp = false;
         if(!win)
         {
            Card drawnCardCp = null;
            Card random = cpHand.deleteAnyCard(); //Randomly pulls asking card from computers hand
            cpHand.insertCard(random);
            int Value = random.getValue();
            int cpHits = userHand.getCount(Value);
            if(cpHits == 0) //GO FISH!
            {
               drawnCardCp = stock.deleteAnyCard();
               if(drawnCardCp.getValue() == Value)//Draw same card as asked from stock deck
               {
                  cpHand.insertCard(drawnCardCp);
                  retryComp = true;
                  System.out.println("Lucky draw for the computer!\n" +
                                     "They go again.");
                  pause();
               }else
               {
                  System.out.println("The computer guessed Wrong..\n" +
                                     "Your turn.");
                  cpHand.insertCard(drawnCardCp); 
                  pause();       
               }                                                             
               int cpCountAfterGoFish = cpHand.getCount(drawnCardCp.getValue());
               if(cpCountAfterGoFish == 4) //COMPLETED BOOK IN COMPUTER HAND
               {
                  cpBooks++;
                  System.out.println("The computer just got a book off a Go Fish draw" +
                                     " with the value " + drawnCardCp.getValue() + "\n" +
                                     "The computer now has : " + cpBooks + " Books\n" +
                                     "You currently have : " + userBooks + " Books");
                  pause();
                  for(int i = 0; i<4; i++)
                  {
                      cpHand.deleteValue(drawnCardCp.getValue());
                  }
               }
               if(retryComp)
               {
                  checkForGameOver();
               } 
            }else if(!retryComp && cpHits >= 1)
            {
               for(int i = 0; i < cpHits; i++)
               {
                  cpHand.insertCard(userHand.deleteValue(Value));
               }
               System.out.println("The computer took " + cpHits + " of your cards!");
               retryComp = false;
               pause();
               int cpCountAfterSteal = cpHand.getCount(Value);
               if(cpCountAfterSteal == 4)
               {
                  cpBooks++;
                  System.out.println("The computer just got a book from stealing your card(s)" +
                                     " with the value " + Value + "\n" +
                                     "The computer now has : " + cpBooks + " Books\n" +
                                     "You currently have : " + userBooks + " Books");
                  pause();
                  for(int i = 0; i<4; i++)
                  {
                      cpHand.deleteValue(Value);
                  }
                }
            }
         }
      }while(retryComp);
   }
   
   public void checkForGameOver()
   {
      win = (stock.getSize() == 0 || userHand.getSize() == 0
                        || cpHand.getSize() == 0);
   }
   
   public void displayWinner()
   {
      if(cpBooks > userBooks)
      {
         System.out.println("The computer Won!\n" +
                            "Computer Books : " + cpBooks +
                            "\nUser Books : " + userBooks);
      }else if(userBooks > cpBooks)
      {
         System.out.println("Congrats YOU Won!\n" +
                            "User Books : " + userBooks +
                            "\nComputer Books : " + cpBooks);
      }else if(userBooks == cpBooks)
      {
         System.out.println("The game was a tie!\n" +
                            "You both had " + userBooks + " books.");
      }
   }
   
   public String yesNo() 
   {
      String yesNo = new String();
         do 
         {
            yesNo = input.nextLine();
            if (!yesNo.equalsIgnoreCase("yes")
            	&& !yesNo.equalsIgnoreCase("no")) 
            {
               System.out.println("Yes or No only!  Try again");
            }
         }while (!yesNo.equalsIgnoreCase("yes")
         	&& !yesNo.equalsIgnoreCase("no"));
      
         return yesNo;
   }
   
   public static Scanner pauseScanner = new Scanner(System.in);
   public void pause()
   {
      System.out.println("Press Enter to continue..");
         pauseScanner.nextLine();
   }
  
}