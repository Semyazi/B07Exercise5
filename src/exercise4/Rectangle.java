package exercise4;

public class Rectangle {
	Point TL;
	Point TR;
	Point BL;
    Point BR;
	
	public Rectangle(Point TL, Point TR, Point BL, Point BR) {
		this.TL = TL;
		this.TR = TR;
		this.BL = BL;
		this.BR = BR;
	}
	
	public double perimeter() {
		return TL.distance(TR) + TR.distance(BR) + BR.distance(BL) + BL.distance(TL);
	}

	public double area() {
		double dTLTR = TL.distance(TR);
		double dTRBR = TR.distance(BR);
		return dTLTR * dTRBR;
	}
	
	public boolean isSquare() {
        double dTLTR = TL.distance(TR);
        double dTRBR = TR.distance(BR);
        double dBRBL = BR.distance(BL);
        double dBLTL = BL.distance(TL);
        if(dTLTR==dTRBR && dTRBR==dBRBL && dBRBL==dBLTL && dBLTL==dTLTR)
            return true;
        else
            return false;
    }
}
