package laundryroom;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class Tset extends JFrame{
	JPanel p=new JPanel();
	JPanel pN=new JPanel();
	
	JTextArea ta=new JTextArea();
	JLabel lb=new JLabel();
	JButton b1,b2,b3,b4,b5;
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
		p.setLayout(new BorderLayout());
		p.add(pN,"South");
		pN.setBackground(Color.cyan);
		pN.setLayout(new GridLayout());
		p.add(pN2);
		b1=new JButton("로그인");
		b2=new JButton("회원가입");
		b3=new JButton("세탁물등록");
		b4=new JButton("마이페이지");
		
		
		pN.add(b1);
		b1.setPreferredSize(new Dimension(80,50));
		pN.add(b2);
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
