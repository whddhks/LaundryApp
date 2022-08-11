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
	JButton update,delete, cancel, info ;
	JButton b5;
	
	public Test2() {
		//수정,삭제, 취소 , 확인
		add(p);
		p.setLayout(null);
		p.add(pN);
		pN.setLayout(null);
		pN.setBackground(Color.orange);
		pN.setBounds(0, 0, 435, 495);
		p.add(pN);
		lb=new JLabel("회원정보수정");
		lb.setFont(lb.getFont().deriveFont(30f));
		lb.setBounds(135,30,420,50);
		update=new JButton("회원정보 수정");
		update.setBounds(50, 100, 340, 70);
		delete=new JButton("회원정보 삭제");
		delete.setBounds(50, 200, 340, 70);
		cancel=new JButton("세탁물 취소");
		cancel.setBounds(50, 300, 340, 70);
		info=new JButton("세탁물 정보");
		info.setBounds(50, 400, 340, 70);
		pN.add(lb);
		pN.add(update);
		pN.add(delete);
		pN.add(cancel);
		pN.add(info);
		
		this.setSize(450,600);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		new Test2();
		
	}

}
