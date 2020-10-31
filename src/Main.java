import java.awt.Frame;
import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String[] args) {
		TankFrame tf = new TankFrame();	
		tf.setVisible(true);
		
		for (;;) {
			try {
			Thread.sleep(25); //25毫秒，相当于一秒40帧
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		tf.repaint(); //每25毫秒就调用一次repaint,再用repaint调用paint
		}
	}
}