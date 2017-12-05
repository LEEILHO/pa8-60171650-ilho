
public class Bear implements Drawable {//Bear는 Drawbable구현
	double x,y,c;
 public Bear(double x, double y, double c ) {
	 this.x = x;
	 this.y = y;
	 this.c = c;
 }
public void draw() {//Bear얼굴을 만들기 위한 코드이다.
	// TODO Auto-generated method stub
	System.out.println("Bear");
	Shape[] shapess = new Shape[3];
	shapess[0] = new Square(x,y,c);
	shapess[1] = new Circle(x,y+20,c/2);
	shapess[2] = new Circle(x+20,y+20,c/2);
	for(int i=0;i<3;i++) {
		shapess[i].draw();
	}
	
	}
}
