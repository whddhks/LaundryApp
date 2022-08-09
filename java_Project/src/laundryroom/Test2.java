package laundryroom;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

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
	
//	public Test2() {
//		add(p);
//		p.setLayout(null);
//		p.setBackground(Color.white);
//		pN3.setLayout(null);
//		pN3.setBackground(Color.PINK);
//		pN3.setBounds(0, 0, 435, 495);
//		p.add(pN3);
//		lb=new JLabel("빨래 종류를 선택하세요");
//		lb.setFont(lb.getFont().deriveFont(30f));
//		lb.setBounds(50, 50, 340,30);
//		sdb=new JButton("표준 빨래");
//		sdb.setBounds(50, 130, 340, 90);
//		dcb=new JButton("드라이클리닝");
//		dcb.setBounds(50, 230, 340, 90);
//		bdb=new JButton("이불 빨래");
//		bdb.setBounds(50, 330, 340, 90);
//		pN3.add(lb);
//		pN3.add(sdb);
//		pN3.add(dcb);
//		pN3.add(bdb);
//		
//		
//		sdb.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//			}
//		});
//		
//		
//		
//		this.setSize(450,600);
//		this.setVisible(true);
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
	public void Standard() {
		add(p);
		p.setLayout(null);
		p.add(pN);
		pN.setLayout(null);
		pN.setBackground(Color.orange);
		pN.setBounds(0, 0, 435, 495);
		lb=new JLabel("표준빨래를 선택하셨습니다!!");
		lb.setFont(lb.getFont().deriveFont(30f));
		lb.setBounds(20,40,420,50);
		
		lb2=new JLabel("무게를 적어주세요");
		lb2.setBounds(70, 150, 100, 30);
		
		lb3=new JLabel("내셔야할 가격은");
		lb3.setBounds(70,250,200, 30);
		
		lb4=new JLabel(" 원 입니다");
		lb4.setBounds(270, 370, 200, 30);
		
		b5=new JButton("등록하기");
		b5.setBounds(150, 410, 120, 40);
		b5.setFont(b5.getFont().deriveFont(20f));
		JTextField weight= new JTextField();
		
		weight.setBounds(110, 190, 200, 50);
		weight.setFont(weight.getFont().deriveFont(20f));
		JTextArea price=new JTextArea();
		price.setFont(price.getFont().deriveFont(40f));
		price.setBounds(90,290, 250, 60);
		
		JLabel[] arr= {lb,lb2,lb3,lb4};
		for(int i=0;i<arr.length;i++) {
			pN.add(arr[i]);
		}
		
		pN.add(weight);
		pN.add(price);
		pN.add(b5);
		this.setSize(450,600);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		//new Test2();
		Test2 ts=new Test2();
		ts.Standard();
	}

}
