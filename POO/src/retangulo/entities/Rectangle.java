package retangulo.entities;

public class Rectangle {
    public double width;
    public double height;
    public double area;
    public double perimeter;
    public double diagonal;

    public double area(double width, double height) {
        return this.area = width * height;
    }

    public double perimeter(double width, double height) {
        return this.perimeter = 2 * (width + height);
    }

    public double diagonal(double width, double height) {
        return this.diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }
}
