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
	JButton b5;
	public Test2() {
		add(p);
		p.setLayout(null);
		p.setBackground(Color.white);
		pN3.setLayout(null);
		pN3.setBackground(Color.LIGHT_GRAY);
		pN3.setBounds(0, 0, 435, 495);
		p.add(pN3);
		lb=new JLabel("아 이 디");
		lb.setBounds(50, 50, 50,20);
		tfID.setBounds(170,50,180,20);
		tfID.selectAll();
		
		lb2=new JLabel("비 밀 번 호");
		lb2.setBounds(50, 120, 60, 20);
		tfPassword.setBounds(170, 120, 180, 20);
		tfPassword.selectAll();
		tfPassword.setEchoChar('*');
		
		lb3=new JLabel("이  름");
		lb3.setBounds(50, 190, 50,20);
		tfname.setBounds(170,190,180,20);
		tfname.selectAll();
		
		lb4=new JLabel("주  소");
		lb4.setBounds(50, 260, 50,20);
		tfaddr.setBounds(170,260,180,20);
		tfaddr.selectAll();
		
		lb5=new JLabel("연 락 처");
		lb5.setBounds(50, 330, 50,20);
		tfphone.setBounds(170,330,180,20);
		tfphone.selectAll();
		
		lb6=new JLabel("이 메 일");
		lb6.setBounds(50, 400, 50,20);
		tfemail.setBounds(170,400,85,20);
		tfemail.selectAll();
		
		lb7=new JLabel("@");
		lb7.setBounds(260, 400, 50,20);
		tfeaddr.setBounds(280,400,100,20);
		tfeaddr.selectAll();
		
		b5=new JButton("회 원 가 입");
		b5.setBounds(150,450 , 120, 20);
		JLabel[] arr={lb,lb2,lb3,lb4,lb5,lb6,lb7};
		for(int i=0;i<arr.length;i++) {
			pN3.add(arr[i]);
		}
		JTextField[] arr2= {tfID,tfPassword,tfname,tfaddr,
				tfphone,tfemail,tfeaddr};
		for(int i=0;i<arr2.length;i++) {
			pN3.add(arr2[i]);
		}
		pN3.add(tfID);
		pN3.add(tfPassword);
		pN3.add(b5);
		
		
		
		
		
		
		
		
		this.setSize(450,600);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Test2();
	}

}
