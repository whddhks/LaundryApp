package laundryroom;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

class Joinframe extends JFrame{ 
	JPanel p=new JPanel();
	JPanel pN=new JPanel();
	JPanel pN3=new JPanel();
	
	JTextArea ta=new JTextArea();
	JTextField tfID=new JTextField();
	JTextField tfname=new JTextField();
	JTextField tfaddr=new JTextField();
	JTextField tfphone=new JTextField();
	JTextField tfemail=new JTextField();
	JTextField tfeaddr=new JTextField();
	JPasswordField tfPassword=new JPasswordField();
	JLabel lb,lb2,lb3,lb4,lb5,lb6,lb7;
	JButton update,delete, cancel, info ;
	JButton btn;
	JPanel joinFm=new JPanel();
	JPanel loginFm=new JPanel();
	static JPanel pN2=new JPanel() {
		Image background=new ImageIcon("cloth.jpeg").getImage();
		public void paint(Graphics g) {
			g.drawImage(background, 0, 0, null);
		}
	};
	public void Joinframe() {
		add(joinFm);
		joinFm.add(loginFm);
		loginFm.setLayout(null);
		loginFm.setBackground(Color.red);
		loginFm.setBounds(0, 200, 435, 295);
		joinFm.add(loginFm);
		lb=new JLabel("아 이 디");
		lb.setBounds(50, 50, 50,20);
		tfID.setBounds(170,50,180,20);
		tfID.selectAll();
		lb2=new JLabel("비 밀 번 호");
		lb2.setBounds(50, 130, 60, 20);
		tfPassword.setBounds(170, 130, 180, 20);
		tfPassword.selectAll();
		tfPassword.setEchoChar('*');
		btn= new JButton("로   그   인");
		btn.setBounds(150,210,120,20);
		loginFm.add(lb);
		loginFm.add(lb2);
		loginFm.add(tfID);
		loginFm.add(tfPassword);
		loginFm.add(btn);
		pN2.setLayout(null);
		pN2.setBounds(0,0,450,200); // 위치 크기순
		loginFm.add(pN2);
		this.setVisible(true);
	}
}

public class Test2 extends JFrame{
	JPanel p=new JPanel();
	JPanel pN=new JPanel();
	JPanel pN3=new JPanel();
	
	JTextArea ta=new JTextArea();
	JTextField tfID=new JTextField();
	JTextField tfname=new JTextField();
	JTextField tfaddr=new JTextField();
	JTextField tfphone=new JTextField();
	JTextField tfemail=new JTextField();
	JTextField tfeaddr=new JTextField();
	JPasswordField tfPassword=new JPasswordField();
	JLabel lb,lb2,lb3,lb4,lb5,lb6,lb7;
	JButton update,delete, cancel, info ;
	JButton b5;
	
	public Test2() {
		add(p);
		p.setLayout(null);
		p.setBackground(Color.cyan);
		pN.setLayout(null);
		pN.setBounds(0,0,450,200);
		pN.setBackground(Color.red);
		p.add(pN);
		JButton btn=new JButton("눌러");
		btn.setBounds(100,400,100,50);
		p.add(btn);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		this.setSize(450,600);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		new Test2();
		new Joinframe();
		
	}

}
