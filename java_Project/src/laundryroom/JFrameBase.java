package laundryroom;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class JFrameBase extends JFrame implements JFrameInterface{
	UserRegister ur=new UserRegister();
	JPanel p=new JPanel();
	JPanel pN=new JPanel();
	JPanel pN3=new JPanel();
	JTextArea ta=new JTextArea();
	JTextField tf=new JTextField();
	JTextField tf2=new JTextField();
	JTextField tf3=new JTextField();
	JPasswordField tfPassword=new JPasswordField();
	JLabel lb,lb2;
	
	JButton b1,b2,b3,b4,b5,b6;
	public void AccountFrame() {
		
	}
	static JPanel pN2=new JPanel() {
		Image background=new ImageIcon("cloth.jpeg").getImage();
		public void paint(Graphics g) {
			g.drawImage(background, 0, 0, null);
		}
	};
	public void joinFrame() {
		p.setLayout(null);
		p.setBackground(Color.white);
		pN3.setLayout(null);
		pN3.setBackground(Color.cyan);
		pN3.setBounds(0, 200, 435, 295);
		p.add(pN3);
		lb=new JLabel("아 이 디");
		lb.setBounds(50, 50, 50,20);
		tf.setBounds(170,50,180,20);
		tf.selectAll();
		lb2=new JLabel("비 밀 번 호");
		lb2.setBounds(50, 130, 60, 20);
		tfPassword.setBounds(170, 130, 180, 20);
		tfPassword.selectAll();
		tfPassword.setEchoChar('*');
		b5= new JButton("로   그   인");
		b5.setBounds(150,210,120,20);
		pN3.add(lb);
		pN3.add(lb2);
		pN3.add(tf);
		pN3.add(tfPassword);
		pN3.add(b5);
		pN2.setLayout(null);
		pN2.setBounds(0,0,450,200); // 위치 크기순
		p.add(pN2);
	}
	
	public void LaundryFrame() {
		
	}
	public void MypageFrame() {
		
	}
	public void HomeFrame() {
		
	}
	
}
