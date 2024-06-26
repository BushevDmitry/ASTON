package Exercise1;

public class Cat implements Animal {

    private int maxRunDistance = 200; // максимальная  дистанция, которую может пробежать
    private static int countOfCats; // кол-во кошек
    private boolean isFull; // сытость котов


    public Cat(){
        countOfCats++;
        isFull=false; // при создании котов, они голодны
    }



    @Override //переопределил метод бега
    public void run(int distance) {
        if (distance <= maxRunDistance){
            System.out.println("Кот больше не может бежать");
        }

    }
    @Override
    public void  swim (int distance){

    }

    void eat(int amountFood){
        if (amountFood <= 0) {
            System.out.println ("Нужно добавить корма в миску");
        } else {
            System.out.println ("Кот поел");
            isFull=true;
        }
    } //метод, при котором кот ест


}
