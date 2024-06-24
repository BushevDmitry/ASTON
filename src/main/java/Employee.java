public class Employee {

        private  String fullName;
        private  String position;
        private  String email;
        private  String number;
        private  int salary;
        private  int age;

        public Employee(String fullName, String position,String email, String number,int salary, int age){
            this.fullName=fullName;
            this.position=position;
            this.email=email;
            this.number=number;
            this.salary=salary;
            this.age=age;
        }

        public void employeeInfo(){
            System.out.println("ФИО: " + fullName, "Должность: " + position, "Email: "+ email, "Номер телефона: " +number, "Зарплата: "+salary, "Возраст: "+ age);
        }




}
