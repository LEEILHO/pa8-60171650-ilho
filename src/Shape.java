//Shape클래스는 추상화시키고 Drawable을 구현한다.
public abstract  class Shape implements Drawable,Movable {
	double Area;
	double Length;
	double x,y,c,d;
	public Shape(double x,double y) {//Shape 의 constructor 생성
		this.x=x;
		this.y=y;
		this.c=c;
		this.d=d;
	}
	double getArea() {//Area를 결과값으로하는 getArea method 생성
		return this.Area;
	}
	double getLength() {//Length를 결과값으로돌렺는 getLength method생성
		return this.Length;
	}
}
