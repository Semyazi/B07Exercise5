public class Trapezoid {
    Point A;
    Point B;
    Point C;
    Point D;

    //No-Argument Constructor
    public Trapezoid() {
        this.A = new Point(0,0);
        this.B = new Point(2,0);
        this.C = new Point(0,1);
        this.D = new Point(1,1);
    }

    //4-Point Constructor
    public Trapezoid(Point A, Point B, Point C, Point D) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }

    // Trapezoid must have exactly one pair of parallel lines (bases)
    public boolean isTrapezoid() {
        Line a = new Line(this.A, this.B);
        Line b = new Line(this.C, this.D);
        Line c = new Line(this.A, this.C);
        Line d = new Line(this.B, this.D);

        return a.isParallel(b) ^  c.isParallel(d);
    }

    // Standardizes trapezoids so that parallel lines (bases) are horizontal and must have Line a (bottom left point to bottom right point) be the longer base
    public Trapezoid standardize(){
        Line a = new Line(this.A, this.B);
        Line b = new Line(this.C, this.D);
        Line c = new Line(this.A, this.C);
        Line d = new Line(this.B, this.D);

        if(a.isParallel(b) && (this.A.distance(this.B) >= this.C.distance(this.D))) {
            return this;
        }

        else if(a.isParallel(b) && (this.C.distance(this.D) >= this.A.distance(this.B))) {
            return new Trapezoid(this.C, this.D, this.A, this.B);
        }

        else if(c.isParallel(d) && (this.A.distance(this.C) >= this.B.distance(this.D))) {
            return new Trapezoid(this.A, this.C, this.B, this.D);
        } 

        else if(c.isParallel(d) && (this.B.distance(this.D) >= this.A.distance(this.C))) {
            return new Trapezoid(this.B, this.D, this.A, this.C);
        }   
    }

    //Find height using scalar projection and Pythagorean theorem
    public double getHeight() { 

        Trapezoid stand = this.standardize();

        double baseX = stand.B.x - stand.A.x;
        double baseY = stand.B.y - stand.A.y;
        
        double legX = stand.C.x - stand.A.x;
        double legY = stand.C.y - stand.A.y;

        double baseLen = Math.sqrt(baseX * baseX + baseY * baseY);
        double legLen = Math.sqrt(legX * legX + legY * legY); 
        double proj = (legX * baseX + legY * baseY) / baseLen;

        return Math.sqrt(legLen * legLen - proj * proj);
    }

    public double perimeter() {
        return A.distance(B) + B.distance(C) + C.distance(D) + D.distance(A);
    }

    public double area() {
        Trapezoid stand = this.standardize();

        double h = stand.getHeight();
        double dAB = stand.A.distance(stand.B);
        double dCD = stand.C.distance(stand.D);

        return (dAB + dCD) * h / 2;

    }
}
