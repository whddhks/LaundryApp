package laundryroom;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class Tset extends JFrame{
	JPanel p=new JPanel();
	JPanel pN=new JPanel();
	JPanel pN3=new JPanel();
	
	JTextArea ta=new JTextArea();
	JTextField tfID=new JTextField();
	JTextField tfPassword=new JTextField();
	JLabel lb,lb2;
	
	JButton b1,b2,b3,b4,b5,b6;
	Icon icon1;
	
	static JPanel pN2=new JPanel() {
		Image background=new ImageIcon("cloth.jpeg").getImage();
		public void paint(Graphics g) {
			g.drawImage(background, 0, 0, null);
		}
	};
	
	public Tset() {
		
		super(":::세탁소:::");
		add(p,"Center");
		p.setLayout(null);
		p.setBackground(Color.white);
		pN.setLayout(new GridLayout());
		pN.setBounds(0,490, 435, 70);
		pN3.setLayout(null);
		pN3.setBackground(Color.cyan);
		pN3.setBounds(0, 200, 435, 295);
		p.add(pN);
		p.add(pN3);
		lb=new JLabel("아 이 디");
		lb.setBounds(50, 50, 50,20);
		tfID.setBounds(170,50,180,20);
		lb2=new JLabel("비 밀 번 호");
		lb2.setBounds(50, 130, 60, 20);
		tfPassword.setBounds(170, 130, 180, 20);
		b5= new JButton("로   그   인");
		b5.setBounds(150,210,120,20);
		pN3.add(lb);
		pN3.add(lb2);
		pN3.add(tfID);
		pN3.add(tfPassword);
		pN3.add(b5);
		//p.add(ta);
		pN2.setLayout(null);
		pN2.setBounds(0,0,450,200); // 위치 크기순
		p.add(pN2);
		b1=new JButton("로그인");
		b2=new JButton("회원가입");
		b3=new JButton("세탁물 등록");
		b4=new JButton("마이 페이지");
		b6=new JButton("홈");
		
		pN.add(b1);
		//b1.setPreferredSize(new Dimension(80,50)); 자바버튼 크기 조절
		pN.add(b2);
		pN.add(b6);
		pN.add(b3);
		pN.add(b4);
		//b5=new JButton("");
		this.setSize(450,600);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Tset();

	}

}
