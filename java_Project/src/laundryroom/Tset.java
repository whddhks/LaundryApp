package laundryroom;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class Tset extends JFrame{
	UserRegister ur=new UserRegister();
	JPanel p=new JPanel();
	JPanel pN=new JPanel();
	JPanel pN3=new JPanel();
	
	JTextArea ta=new JTextArea();
	JTextField tfID=new JTextField();
	JPasswordField tfPassword=new JPasswordField();
	JLabel lb,lb2;
	
	JButton b1,b2,b3,b4,b5,b6;
	ImageIcon door, home, key, my, laundry;
	ImageIcon redoor,rehome,rekey,remy,relaundry;
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
		tfID.selectAll();
		lb2=new JLabel("비 밀 번 호");
		lb2.setBounds(50, 130, 60, 20);
		tfPassword.setBounds(170, 130, 180, 20);
		tfPassword.selectAll();
		tfPassword.setEchoChar('*');
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
		key=new ImageIcon("열쇠.PNG");
		Image keyimage=key.getImage();
		Image changekeyimage=keyimage.getScaledInstance(85, 70, Image.SCALE_SMOOTH);
		ImageIcon changekey=new ImageIcon(changekeyimage);
		home=new ImageIcon("집.PNG");
		Image homeimage=home.getImage();
		Image changehomeimage=homeimage.getScaledInstance(85, 70, Image.SCALE_SMOOTH);
		ImageIcon changehome=new ImageIcon(changehomeimage);
		door=new ImageIcon("문.PNG");
		Image doorimage=door.getImage();
		Image changedoorimage=doorimage.getScaledInstance(85, 70, Image.SCALE_SMOOTH);
		ImageIcon changedoor=new ImageIcon(changedoorimage);
		my=new ImageIcon("전체.PNG");
		Image myimage=my.getImage();
		Image changemyimage=myimage.getScaledInstance(85, 70, Image.SCALE_SMOOTH);
		ImageIcon changemy=new ImageIcon(changemyimage);
		laundry=new ImageIcon("세탁물.PNG");
		Image laundryimage=laundry.getImage();
		Image changelaundryimage=laundryimage.getScaledInstance(85, 70, Image.SCALE_SMOOTH);
		ImageIcon changelaundry=new ImageIcon(changelaundryimage);
		
		rehome=new ImageIcon("집반전.PNG");
		Image rehomeimage=rehome.getImage();
		Image changerehomeimage=rehomeimage.getScaledInstance(85, 70, Image.SCALE_SMOOTH);
		ImageIcon changerehome=new ImageIcon(changerehomeimage);
		redoor=new ImageIcon("문 반전.PNG");
		Image redoorimage=redoor.getImage();
		Image changeredoorimage=redoorimage.getScaledInstance(85, 70, Image.SCALE_SMOOTH);
		ImageIcon changeredoor=new ImageIcon(changeredoorimage);
		remy=new ImageIcon("전체 반전.PNG");
		Image remyimage=remy.getImage();
		Image changeremyimage=remyimage.getScaledInstance(85, 70, Image.SCALE_SMOOTH);
		ImageIcon changeremy=new ImageIcon(changeremyimage);
		relaundry=new ImageIcon("세탁물 반전.PNG");
		Image relaundryimage=relaundry.getImage();
		Image changerelaundryimage=relaundryimage.getScaledInstance(85, 70, Image.SCALE_SMOOTH);
		ImageIcon changerelaundry=new ImageIcon(changerelaundryimage);
		rekey=new ImageIcon("열쇠 반전.PNG");
		Image rekeyimage=rekey.getImage();
		Image changerekeyimage=rekeyimage.getScaledInstance(85, 70, Image.SCALE_SMOOTH);
		ImageIcon changerekey=new ImageIcon(changerekeyimage);
		
		
		
		b1=new JButton(changekey);
		b2=new JButton(changedoor);
		b3=new JButton(changelaundry);
		b4=new JButton(changemy);
		b6=new JButton(changehome);
		
		b1.setPressedIcon(changerekey);
		b2.setPressedIcon(changeredoor);
		b3.setPressedIcon(changerelaundry);
		b4.setPressedIcon(changeremy);
		b6.setPressedIcon(changerehome);
		
		pN.add(b1);
		//b1.setPreferredSize(new Dimension(80,50)); 자바버튼 크기 조절
		pN.add(b2);
		pN.add(b6);
		pN.add(b3);
		pN.add(b4);
		MyEventHandler handler =new MyEventHandler();
		b5.addActionListener(handler);
		tfID.addActionListener(handler);
		tfPassword.addActionListener(handler);
		b2.addActionListener(handler);
		//this.setResizable(false); 창크기 고정하기
		
	}
	
	class ChangePage implements ActionListener{
		public void actionPerformed(ActionEvent e){
			Object obj=e.getSource();
			if (obj==b2) {
				
			}
			
		}
	}
	class MyEventHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Object obj=e.getSource();
			if (obj==b5 || obj==tfID ||obj==tfPassword) {
				String id=tfID.getText();
				id=id.trim();
				String pwd=tfPassword.getText();
				pwd=pwd.trim();
				
				ur.Join();
				
			}
		}
	}

	public static void main(String[] args) {
		new Tset();
		
	}

}
