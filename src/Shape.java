//ShapeŬ������ �߻�ȭ��Ű�� Drawable�� �����Ѵ�.
public abstract  class Shape implements Drawable,Movable {
	double Area;
	double Length;
	double x,y,c,d;
	public Shape(double x,double y) {//Shape �� constructor ����
		this.x=x;
		this.y=y;
		this.c=c;
		this.d=d;
	}
	double getArea() {//Area�� ����������ϴ� getArea method ����
		return this.Area;
	}
	double getLength() {//Length�� ��������ε��´� getLength method����
		return this.Length;
	}
}
