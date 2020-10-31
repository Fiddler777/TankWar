import java.awt.Graphics;
import java.awt.event.KeyEvent;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

public class Tank {
	private int x, y;
	private Dir dir;
	private boolean bL, bU, bR, bD;
	
	public static final int SPEED = 5;
	
	public Tank(int x, int y, Dir dir) {
		this.x = x;
		this.y = y;
		this.dir = dir;
	}
	public void paint(Graphics g) { //系统传给我的一个“画笔”
		g.fillRect(x, y, 50, 50); 
		move();
	}
	public void keyPressed(KeyEvent e) { //键盘按下上下左右键，坦克的方向分别改变
		int key = e.getKeyCode(); 
		switch (key) {
			case KeyEvent.VK_LEFT :
				bL = true;
				break;
			case KeyEvent.VK_UP :
				bU = true;
				break;
			case KeyEvent.VK_RIGHT :
				bR = true;
				break;
			case KeyEvent.VK_DOWN :
				bD = true; 
				break;
		}
		
		setMainDir();
		
	}
	
	private void setMainDir() {
		if(!bL && !bU && !bR && !bD)
			dir = Dir.STOP;
		if(bL && !bU && !bR && !bD)
			dir = Dir.L;
		if(!bL && bU && !bR && !bD)
			dir = Dir.U;
		if(!bL && !bU && bR && !bD)
			dir = Dir.R;
		if(!bL && !bU && !bR && bD)
			dir = Dir.D;
	}
	
	private void move() { //键盘按下上下左右键，坦克的x和y分别改变
		switch (dir) {
			case L:
				x -=SPEED;
				break;
			case U:
				y -=SPEED;
				break;
			case R:
				x +=SPEED;
				break;
			case D:
				y +=SPEED;
				break;
		}
	}
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode(); 
		switch (key) {
			case KeyEvent.VK_LEFT :
				bL = false;
				break;
			case KeyEvent.VK_UP :
				bU = false;
				break;
			case KeyEvent.VK_RIGHT :
				bR = false;
				break;
			case KeyEvent.VK_DOWN :
				bD = false; 
				break;
		}
		
		setMainDir();
	}
}