public class Main {
    public static void main(String[] args) {
        Shape shape = new Rectangle(4, 3);
        AreaCalculator2 areaCalculator2 = new AreaCalculator2();
        System.out.println("Area = '" + areaCalculator2.calculateArea(shape) + "'");
    }
}
