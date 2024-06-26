public class Circle implements Figure  {

    private double radius; // радиус
    private String fillColor; // цвет фона
    private String borderColor; // цвет границ
    private final double Pi=3.18;

    public Circle (double radius, String fillColor, String borderColor){
        this.radius=radius;
        this.fillColor=fillColor;
        this.borderColor=borderColor;
    }



    @Override
    public double calculatePerimeter() {
        return 2*Pi*radius;
    } // расчёт периметра

    @Override
    public double calculateArea() {
        return Pi*(radius*radius);
    } // расчёт площади

    @Override
    public String getFillColor() {

        return fillColor; // заполнение фонового
    }

    @Override
    public String getBorderColor() {
        return borderColor; // заполнение цвета границ
    }
}
