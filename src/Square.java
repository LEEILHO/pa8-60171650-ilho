public class Square extends Rectangle{//Square는 Rectangle상속받는다.
	double width;

	public Square(double x, double y , double width) {//생성자이다.
		super(x, y, width, width);
		this.width = width;
	}

	@Override
	public void draw() {//좌표위치를 출력하는 함수
		// TODO Auto-generated method stub
		System.out.println("Square"+"("+x+","+y+")"+"-"+"("+(x+width)+","+(y+width)+")");
	}
	public void move(double dx, double dy) {
		// TODO Auto-generated method stub
		
	}
	double getArea() {//getArea Override
		this.Area = width*width;
		return this.Area;

	}
	double getLenth() {//getLength Override
		this.Length = width*4;
		return this.Length;
	}
}