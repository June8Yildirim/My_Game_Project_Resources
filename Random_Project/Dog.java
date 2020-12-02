public class Dog {
    String name;

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Bart";
        dog1.bark();
        Dog[] mydog = new Dog[3];
        mydog[0] = new Dog();
        mydog[1] = new Dog();
        mydog[2] = new Dog();
        mydog[0].name = "les";
        mydog[1].name = "rex";
        mydog[2].name = dog1.name;
        System.out.println(mydog[0].name + " " +
                mydog[1].name + " " +
                mydog[2].name);
        System.out.print("Your dog's name are ");
        for (int i = 0; i < mydog.length; i++) {
            System.out.print(mydog[i].name);
            mydog[i].bark();
        }
    }

    public void bark() {
        System.out.println(" says ruff.");
    }

}
class testArrays{
    public static void main(String[]args){
        String[] islands = new String[4];
        int[] index = new int[4];
        islands[0]="Bermuda";
        islands[1]="Fiji";
        islands[2]="Azores";
        islands[3]="Cozumel";
        index[0]=1;
        index[1]=3;
        index[2]=0;
        index[3]=2;
        int ref;
        int y=0;
        while (y<4){
            ref = index[y];
            System.out.print("Islands= ");
            System.out.println(islands[ref]);
            y+=1;
        }


    }
}