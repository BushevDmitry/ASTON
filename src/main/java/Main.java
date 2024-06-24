public class Main {
    public static void main(String[] args) {


        Employee[] person = new Employee[5];
        person[0] = new Employee("Иванов Иван Иванович", "Engineer", "Ivanov@mail.ru", "+79998887766", 90000, 30);
        person[1] = new Employee("Богданов Богдан Богданович", "Doctor", "Bogdanov@mail.ru", "+79887776655", 80000, 29);
        person[2] = new Employee("Павлов Павел Павлович", "Policeman", "Pavlov@mail.ru", "+79776665544", 70000, 28);
        person[3] = new Employee("Степанов Степан Степанович", "fireman", "Stepanov@mail.ru", "+79665554433", 60000, 27);
        person[4] = new Employee("Егоров Егор Егорович", "Driver", "Egorov@mail.ru", "+79554443322", 50000, 26);

        for (Employee persons : person){
            persons.employeeInfo();
        }


        Park disneyLand = new Park();
        Park.Attraction attraction1 = disneyLand.new Attraction ("Американские горки","9:00", 10.5);
        attraction1.attractionInfo();
    }

}
