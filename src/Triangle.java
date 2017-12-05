public class Triangle extends Shape {//Triangel�� shape���
    double width;
    double bottom;

    public Triangle(double x, double y, double width, double bottom) {
        super(x, y);
        this.width = width;
        this.bottom = bottom;
    }
    double getArea() {//Area�� ���ؼ� ������
    	this.Area = width*bottom;
    	return this.Area;
    }
    double getLength() {//Length�� ���ؼ� ������
    	double side;
    	side = width*width+(bottom/2)*(bottom/2);
    	
    	this.Length =bottom+2*Math.sqrt(side);
    	return this.Length;
    }
    @Override
    public void draw() {//draw��  �̵�ﰢ���� ������ 3�� ���
    	System.out.println("Triangle"+"("+x+","+y+")"+"-"+"("+(x-bottom/2)+","+(y-width)+")"+"-"+"("+(x+bottom/2)+","+(y+width)+")");
        
    }
    @Override
    public void move(double dx, double dy) {

    }
}
