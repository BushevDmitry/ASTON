package Exercise1;

public class Bowl {

    private int amountFood;

    public Bowl (int foodAmount){
        this.amountFood=foodAmount;
    }

    public void addFood(int amount){
        if (amount <=0) {
            System.out.println("Нужно добавить корма");
        } else {
            amountFood +=amount;
        } //добавляем еду в миску
    }
}
