public class Triangle extends Shape {//Triangel은 shape상속
    double width;
    double bottom;

    public Triangle(double x, double y, double width, double bottom) {
        super(x, y);
        this.width = width;
        this.bottom = bottom;
    }
    double getArea() {//Area를 구해서 리턴함
    	this.Area = width*bottom;
    	return this.Area;
    }
    double getLength() {//Length를 구해서 리턴함
    	double side;
    	side = width*width+(bottom/2)*(bottom/2);
    	
    	this.Length =bottom+2*Math.sqrt(side);
    	return this.Length;
    }
    @Override
    public void draw() {//draw는  이등변삼각형의 꼭짓점 3개 출력
    	System.out.println("Triangle"+"("+x+","+y+")"+"-"+"("+(x-bottom/2)+","+(y-width)+")"+"-"+"("+(x+bottom/2)+","+(y+width)+")");
        
    }
    @Override
    public void move(double dx, double dy) {

    }
}
