public class Line {
    Point A;
    Point B;

    //No-Argument Constructor
    public Line() {
        this.A = new Point(0,0);
        this.B = new Point(1,0);
    }

    //2-point Constructor
    public Line(Point A, Point B) {
        this.A = A;
        this.B = B;
    }

    //Checks if two lines are parallel using cross-product 
    public boolean isParallel(Line other) {
        double ux = this.B.x - this.A.x;
        double uy = this.B.y - this.A.y;

        double vx = other.B.x - other.A.x; 
        double vy = other.B.y - other.A.y;

        return ux * vy - uy * vx == 0;
    }
}