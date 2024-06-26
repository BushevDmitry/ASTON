public class Main {
    public static void main (String[] args){

        Circle circle = new Circle(10.5, "Red", "Blue");
        System.out.println("Периметр круга: "+ circle.calculatePerimeter()+"\n" +  "Площадь круга: "+circle.calculateArea()+"\n" + "Цвет фона круга: " + circle.getFillColor()+"\n"+"Цвет границы круга: "+ circle.getBorderColor());

        System.out.println(" "); // сделал таким образом абзац м/у вызовами методов

        Rectangle rectangle = new Rectangle( 10.5, 20.5, "Orange", "Black");
        System.out.println("Периметр прямоугольника: "+ rectangle.calculatePerimeter()+"\n" +  "Площадь прямоугольника: "+rectangle.calculateArea()+"\n" + "Цвет фона прямоугольника: " + rectangle.getFillColor()+"\n"+"Цвет границы прямоугольника: "+ rectangle.getBorderColor());

        System.out.println(" ");

        Triangle triangle = new Triangle( 10.5 ,20.5, 30.5 , "Pink", "Yellow");
        System.out.println("Периметр треугольника: "+ triangle.calculatePerimeter()+"\n" +  "Площадь треугольника: "+triangle.calculateArea()+"\n" + "Цвет фона треугольника: " + triangle.getFillColor()+"\n"+"Цвет границы треугольника: "+ triangle.getBorderColor());
    }
}
