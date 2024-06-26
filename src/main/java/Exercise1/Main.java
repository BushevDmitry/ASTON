package Exercise1;

public class Main {
    public static void main (String[] args) {

        Cat[] cats = new Cat[3];
        for (int i =0; i<cats.length; i++){
            cats[i]=new Cat();
        }

        Bowl bowl = new Bowl(15);

        for (Cat cat : cats) {
            cat.eat(15);
        }





    }
    }
