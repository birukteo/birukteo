public class App {
    public static void main(String[] args) throws Exception {
        quadrilateral quad = new rectangle(-2, 4, -2, 12, 4, 12, 4, 4);
        System.out.println(quad.getArea());

        quad = new square(10, 10, 20, 10, 20, 20, 10, 20);
        System.out.println(quad.getArea());

        quad = new parallelogram(10, 10, 30, 10, 20, 20, 0, 20, 0);
        System.out.println(quad.getArea());

        quad = new trapezoid(6, 7, 53, 7, 12, 28, 34, 28, 21);
        System.out.println(quad.getArea());

    }
}
