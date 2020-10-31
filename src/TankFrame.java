import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TankFrame extends Frame { //从main处继承过来
	private Tank myTank;
	private Tank enemy;
	
	public TankFrame () {
		this.setTitle("tank war");
		this.setLocation(400, 100);//设置窗口位置x,y
		this.setSize(800, 600);	//设置窗口宽高
		
		this.addKeyListener(new TankKeyListener()); //添加键盘监听器，使用内部类，高内聚，低耦合
		
		myTank = new Tank(100, 100, Dir.R);
		enemy = new Tank(200, 200, Dir.D);
	}
	public void paint(Graphics g) { //系统传给我的一个“画笔”
		myTank.paint(g); //画一个四方块，在里面做填充（x,y,宽,高)
		enemy.paint(g);
	}
	private class TankKeyListener extends KeyAdapter{ //私有的方法，不需要被外部调用
		
		public void keyPressed(KeyEvent e) {
			
			myTank.keyPressed(e);

			}
		public void keyReleased(KeyEvent e) {
			
			myTank.keyReleased(e);
			
		}
	}
}