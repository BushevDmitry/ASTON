package Exercise1;

public class Dog implements Animal {

    private static int countOfDogs; // кол-во собак
    private int maxRunDistance = 500; // максимальная дистанция бега
    private int maxSwimDistance = 10; // максимальная дистанция вплавь

    public Dog(){
        countOfDogs++; // кол-во собак увеличивается при создании новой собаки
    }

    @Override
    public void run(int distance){
        if (distance <= maxRunDistance){
            System.out.println("Собака пробежала " + distance + " м.");
        } else {
            System.out.println ("Собака не смогла пробежать: "+ distance + " м.");
        }
    }


    @Override
    public void swim(int distance) {
        if (distance <= maxSwimDistance){
            System.out.println("Собака проплыла: " + distance + " м.");
        } else {
            System.out.println ("Собака не смогла проплыть: " + distance + " м.");
        }
    }
}


