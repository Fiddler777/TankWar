import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TankFrame extends Frame { //��main���̳й���
	private Tank myTank;
	private Tank enemy;
	
	public TankFrame () {
		this.setTitle("tank war");
		this.setLocation(400, 100);//���ô���λ��x,y
		this.setSize(800, 600);	//���ô��ڿ��
		
		this.addKeyListener(new TankKeyListener()); //��Ӽ��̼�������ʹ���ڲ��࣬���ھۣ������
		
		myTank = new Tank(100, 100, Dir.R);
		enemy = new Tank(200, 200, Dir.D);
	}
	public void paint(Graphics g) { //ϵͳ�����ҵ�һ�������ʡ�
		myTank.paint(g); //��һ���ķ��飬����������䣨x,y,��,��)
		enemy.paint(g);
	}
	private class TankKeyListener extends KeyAdapter{ //˽�еķ���������Ҫ���ⲿ����
		
		public void keyPressed(KeyEvent e) {
			
			myTank.keyPressed(e);

			}
		public void keyReleased(KeyEvent e) {
			
			myTank.keyReleased(e);
			
		}
	}
}