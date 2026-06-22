package exercise4;

class Circle {
    Point centre;
    double radius;
    // Default constructor
    public Circle() {
        this.centre = new Point(0, 0);
        this.radius = 1;
    }
    // Constructor with params
    public Circle(Point centre, double radius) {
        this.centre = centre;
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
    public double getPerimeter() {
        return 2*Math.PI*this.radius;
    }
    public boolean isInCircle(Point p) {
        // lol on circle is now gonna be in circle
        return p.distance(this.centre) <= radius;
    }
    @Override
    public int hashCode() {
        return (int)(this.centre.hashCode() * radius);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Circle other = (Circle) obj;
        if (!this.centre.equals(other.centre) || this.radius != other.radius)
            return false;
        return true;
    }

}
