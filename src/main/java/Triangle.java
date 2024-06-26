public class Triangle implements Figure {

    private double side1; // высота
    private double side2; //  основание
    private double side3; // гипотенуза
    private String fillColor; // цвет фона
    private String borderColor; // цвет границ

    public Triangle (double side1,double side2, double side3, String fillColor, String borderColor) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }


    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double calculateArea() {
        return side1*side2/2;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}
