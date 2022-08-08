package laundryroom;
import java.awt.*;
import javax.swing.*;
import java.util.*;

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
	JButton sdb,dcb,bdb;
	JButton b5;
	public Test2() {
		add(p);
		p.setLayout(null);
		p.setBackground(Color.white);
		pN3.setLayout(null);
		pN3.setBackground(Color.PINK);
		pN3.setBounds(0, 0, 435, 495);
		p.add(pN3);
		lb=new JLabel("빨래 종류를 선택하세요");
		lb.setFont(lb.getFont().deriveFont(30f));
		lb.setBounds(50, 50, 340,30);
		sdb=new JButton("표준 빨래");
		sdb.setBounds(50, 130, 340, 90);
		dcb=new JButton("드라이클리닝");
		dcb.setBounds(50, 230, 340, 90);
		bdb=new JButton("이불 빨래");
		bdb.setBounds(50, 330, 340, 90);
		pN3.add(lb);
		pN3.add(sdb);
		pN3.add(dcb);
		pN3.add(bdb);
		
		
		
		this.setSize(450,600);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Test2();
	}

}
