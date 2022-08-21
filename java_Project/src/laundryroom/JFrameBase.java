package laundryroom;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class JFrameBase extends JFrame{
	UserRegister ur=new UserRegister();
	JPanel p=new JPanel();
	JPanel pN=new JPanel();
	JPanel pN3=new JPanel();
	JLabel lb,lb2,lb3,lb4,lb5,lb6,lb7;
	JButton b1,b2,b3,b4,b5,b6;

	static JPanel pN2=new JPanel() {
		Image background=new ImageIcon("cloth.jpeg").getImage();
		public void paint(Graphics g) {
			g.drawImage(background, 0, 0, null);
		}
	};
	static JPanel joinFm=new JPanel() { 
		public void joinFrame() {
			JTextField tfID=new JTextField();
			JPasswordField tfPassword=new JPasswordField();
			JPanel loginFm=new JPanel();
			JLabel lb,lb2;
			JButton btn=new JButton();
			//add(joinFm);
			joinFm.setLayout(null);
			joinFm.setBackground(Color.white);
			loginFm.setLayout(null);
			loginFm.setBackground(Color.cyan);
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
		}
	};
//	class joinFrame extends JFrame{
//	}
	public void AccountFrame() {
		JTextArea ta=new JTextArea();
		JTextField tfID=new JTextField();
		JTextField tfname=new JTextField();
		JTextField tfaddr=new JTextField();
		JTextField tfphone=new JTextField();
		JTextField tfemail=new JTextField();
		JTextField tfeaddr=new JTextField();
		JPasswordField tfPassword=new JPasswordField();
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
	
	

	
	
	public void LaundryFrame() {
		JButton sdb,dcb,bdb;
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
		JButton update,delete, cancel, info ;
		add(p);
		p.setLayout(null);
		p.add(pN);
		pN.setLayout(null);
		pN.setBackground(Color.orange);
		pN.setBounds(0, 0, 435, 495);
		p.add(pN);
		lb=new JLabel("마이페이지!");
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
		
	}
	
	public void MainFrame() {
		ImageIcon door, home, key, my, laundry;
		ImageIcon redoor,rehome,rekey,remy,relaundry;
		add(p);
		p.setLayout(null);
		p.setBackground(Color.white);
		pN.setLayout(new GridLayout());
		pN.setBounds(0,490, 435, 70);
		p.add(pN);
		
		pN3.setLayout(null);
		pN3.setBackground(Color.orange);
		pN3.setBounds(0, 0, 435, 495);
		p.add(pN3);
		lb=new JLabel("빨래 방에 오신것을");
		lb2=new JLabel("환영합니다.!!");
		
		
		lb.setFont(lb.getFont().deriveFont(30f));
		lb2.setFont(lb2.getFont().deriveFont(30f));
		
		lb.setBounds(90,30,420,50);
		lb2.setBounds(130,80,420,50);
		pN3.add(lb);
		pN3.add(lb2);
		
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
		pN.add(b2);
		pN.add(b6);
		pN.add(b3);
		pN.add(b4);
		
		JFrameBase jfb=new JFrameBase();
		
		
		b1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				pN3.setVisible(false);

			}
		});
		
		b2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		b3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		b4.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		b6.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		
		
		
		
		
		this.setSize(450,600);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	
	
}
