//Drawbale interface를 구현하는 Text class 한다.
 public class Text implements Drawable {
	 String str;
	 public Text(String str) {//Constructor 생성
	   this.str = str;
		 
   }
@Override
public void draw() {//Draw method override한다.
	// TODO Auto-generated method stub
	 System.out.println(str);
}
}
