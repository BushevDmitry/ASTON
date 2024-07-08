public class Factorial {

    public Factorial() {
    }

    public int factorialCalculate(int a) {

        if (a < 0) {
            throw new IllegalArgumentException("Необходимо ввести положительное число");
        } else if (a == 0 || a == 1) {
            return 1;
        } else {
            return a * factorialCalculate(a - 1);
        }
    }

}
