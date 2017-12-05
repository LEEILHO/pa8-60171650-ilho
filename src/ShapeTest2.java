//60171650 이일호 
public class ShapeTest2 {//test를 하기위한 class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shapes = new Shape[3];//3개의 Shape객체 선언
		shapes[0] = new Rectangle(10, 20, 30, 40);//객체 상태 지정
		shapes[1] = new Rectangle(30, 30, 10, 10);
		shapes[2] = new Circle(50,20,30);
		for(Shape s:shapes) {//Shape객체의 갯수만큼 for문 돈다.
			System.out.printf("Area: %.1f\n", s.getArea());//getArea 출력
			System.out.printf("Length: %.1f\n", s.getLength());//getLength 출력
			}
		Drawable[] drawables = new Drawable[5];//5개의Drawable 객체 선언
		for(int i =0;i< shapes.length;i++) {
			drawables[i] = (Drawable) shapes[i];
		}
		drawables[3] = new Text("Sample Text");
		drawables[4] = new Bear(100,100,20);
		
		for(Drawable d: drawables) {
			d.draw();
		}
		System.out.println("원을 10번 x축으로 10  y축으로 10 이동");
		Circle circle  = new Circle(100,100,20);//circle을 10번 이동시키기 위한 코드들이다.
		for(int i=0;i<11;i++) {
			circle.move(10,10);
			circle.draw();
		}
				
		
		
	}

}