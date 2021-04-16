package BasicTextBasedGame;

import java.util.Random;

public class Word {
    Random random = new Random();
    public String getWord(){
        String[] wordList={"number","which","their","follow","change","picture",
                "animal","mother","world","place","round","through","sentence",
                "would","number","country","school","between","science","mountain",
                "together","children","example","always","second","family"};
        int randNumber= random.nextInt(wordList.length);
        return wordList[randNumber];

    }

}
