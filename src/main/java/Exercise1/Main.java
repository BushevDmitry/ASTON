package Exercise1;
    public class Main {
        public static void main(String[] args) {

            String[][] array = {
                    {"1", "2", "3", "4"},
                    {"5", "6", "7", "8"},
                    {"9", "10", "11", "12"},
                    {"13", "14", "15", "16"}
            };

            try {
                int sum = processAndSumArray(array);
                System.out.println("Сумма элементов массива: " + sum);
            } catch (MyArraySizeException | MyArrayDataException e) {
                System.out.println(e.getMessage());
            }
        }

        public static int processAndSumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
            if (array.length != 4) {
                throw new MyArraySizeException("Некорректное значение");
            }
            int sum =0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    try {
                        sum += Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException("Неверные данные в ячейке: [" + i + "][" + j + "]");
                    }
                }
            }

            return sum;
        }
    }







