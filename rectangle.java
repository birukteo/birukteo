public class rectangle extends quadrilateral {
    rectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {

        super(x1, y1, x2, y2, x3, y3, x4, y4);

    }

    // @Override
    double getArea() {

        double dim1 = Math.sqrt(((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)));
        double dim2 = Math.sqrt(((x1 - x4) * (x1 - x4)) + ((y1 - y4) * (y1 - y4)));
        double area = Math.ceil(dim1 * dim2);
        return 0;
    }
}
