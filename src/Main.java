import java.awt.Frame;
import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String[] args) {
		TankFrame tf = new TankFrame();	
		tf.setVisible(true);
		
		for (;;) {
			try {
			Thread.sleep(25); //25���룬�൱��һ��40֡
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		tf.repaint(); //ÿ25����͵���һ��repaint,����repaint����paint
		}
	}
}