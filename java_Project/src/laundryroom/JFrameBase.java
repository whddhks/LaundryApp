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
	JTextField tfID=new JTextField();
	JTextField tfname=new JTextField();
	JTextField tfaddr=new JTextField();
	JTextField tfphone=new JTextField();
	JTextField tfemail=new JTextField();
	JTextField tfeaddr=new JTextField();
	JPasswordField tfPassword=new JPasswordField();
	JLabel lb,lb2,lb3,lb4,lb5,lb6,lb7;
	JButton sdb,dcb,bdb;
	JButton b1,b2,b3,b4,b5,b6;
	public void AccountFrame() {
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
		
	}
	static JPanel pN2=new JPanel() {
		Image background=new ImageIcon("cloth.jpeg").getImage();
		public void paint(Graphics g) {
			g.drawImage(background, 0, 0, null);
		}
	};
	
	public void joinFrame() {
		add(p);
		p.setLayout(null);
		p.setBackground(Color.white);
		pN3.setLayout(null);
		pN3.setBackground(Color.cyan);
		pN3.setBounds(0, 200, 435, 295);
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
		pN2.setLayout(null);
		pN2.setBounds(0,0,450,200); // 위치 크기순
		p.add(pN2);
		
	}
	
	public void LaundryFrame() {
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
		
		
		sdb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}
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
		

	}
	public void Bedding() {
		add(p);
		p.setLayout(null);
		p.add(pN);
		pN.setLayout(null);
		pN.setBackground(Color.orange);
		pN.setBounds(0, 0, 435, 495);
		lb=new JLabel("이불빨래를 선택하셨습니다!!");
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
		

	}
	public void DryCleaning() {
		add(p);
		p.setLayout(null);
		p.add(pN);
		pN.setLayout(null);
		pN.setBackground(Color.orange);
		pN.setBounds(0, 0, 435, 495);
		lb=new JLabel("드라이클리닝를 선택하셨습니다!!");
		lb.setFont(lb.getFont().deriveFont(28f));
		lb.setBounds(20,40,420,50);
		
		lb2=new JLabel("옷수를 적어주세요");
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

	}
	public void MypageFrame() {
		
	}
	public void HomeFrame() {
		
	}
	
}
