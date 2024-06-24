public class Park {

    public class Attraction {
        private String nameOfAttraction;
        private String timeOfWork;
        private double cost;

        public Attraction(String nameOfAttraction, String timeOfWork, double cost) {
            this.nameOfAttraction = nameOfAttraction;
            this.timeOfWork = timeOfWork;
            this.cost = cost;
        }


        public void attractionInfo() {
            System.out.println("Аттракцион 1: " + nameOfAttraction + ", Рабочее время с: " + timeOfWork + ", Цена входа: " + cost + " $");

        }
    }
}





