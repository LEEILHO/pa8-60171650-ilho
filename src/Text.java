//Drawbale interface�� �����ϴ� Text class �Ѵ�.
 public class Text implements Drawable {
	 String str;
	 public Text(String str) {//Constructor ����
	   this.str = str;
		 
   }
@Override
public void draw() {//Draw method override�Ѵ�.
	// TODO Auto-generated method stub
	 System.out.println(str);
}
}
