public class Triangle implements Comparable<Triangle> {

    private String name;
    private int side1;
    private int side2;
    private int side3;
    private double square;

    public Triangle(String name, int side1, int side2, int side3) {
        this.name = name;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
       // this.square = square;
    }

    public double getSquare() { //lazy realisacia
        if(square == 0) {
            double area = (side1 + side2 + side3) / 2.0d;
            square = Math.sqrt(area * (area - side1) * (area - side2) * (area - side3));
        }
        return square;
    }

    public int compareTo(Triangle o) {
        if(this.getSquare() > o.getSquare()) {
            return 1;
        }
       else if(this.getSquare() < o.getSquare()) {
            return -1;
        }
       return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "name='" + name + '\'' +
                ", square=" + square +
                '}';
    }
}
