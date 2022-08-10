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
	
	public Test2() {
		
		
	
	
	
		this.setSize(450,600);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Test2();
		
	}

}
