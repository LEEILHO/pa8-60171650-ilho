//Rectangle class�� Shape class�� ��ӹ޴´�.
public class Rectangle extends Shape{
public Rectangle(double x,double y ,double c ,double d ) {//Rectangle ������ ����
	super(x,y);
	this.c=c;
	this.d=d;
	}

public void draw() {//draw method override
	// TODO Auto-generated method stub

	System.out.println("Rectangle"+"("+x+","+y+")"+"-"+"("+(x+c)+","+(y+d)+")");
	
	}
double getArea() {//getArea Override
	this.Area = c*d;
	return this.Area;
}
double getLength() {//getLength Override
	this.Length= 2*c+2*d;
	return this.Length;
}

@Override
public void move(double dx, double dy) {
	// TODO Auto-generated method stub
	
}
}