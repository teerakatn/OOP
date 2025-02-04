public class Cicle extends Shape {

    private double radius;
    public Cicle(double radius) {
        super("Circle"); // เรียกใช ้ constructor ของ Shape และก าหนดประเภทเป็ น "Circle"
        this.radius = radius;
    }
    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius: " + radius);
    }
    @Override
    public double area() {

        return Math.PI * radius * radius;
    }

}
