//Circle class는 Shape class를 상속받는다
public class Circle extends Shape {
	public Circle(double x,double y,double c) {//생성자 생성
		super(x,y);//Shape의 생성자를 불러와서 값지정.
		this.c= c;
	}
	public void draw() {//draw method를 오버라이드한다.
		// TODO Auto-generated method stub
		System.out.println("Circle center"+"("+x+","+y+")"+"-"+"radius"+"("+c+")");
		
	}
	double getArea() {//getArea메소드를 오버라이드한다.
		this.Area = c*c*3.14;
		return this.Area;//계산된 Area값 리턴
	}
	double getLength() {//getLength메소드를 오버라이드한다.
		this.Length= 2*c*3.14;
		return this.Length;
	}
	@Override
	public void move(double dx, double dy) {//circle을 x축으로dx만큼 y 축으로 dy만큼 이동
		this.x = x+dx;
		this.y = y+dy;
		
	}
}