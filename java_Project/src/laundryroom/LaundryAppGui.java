package laundryroom;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class LaundryAppGui extends JFrame {
	UserRegister ur=new UserRegister();
	JPanel p=new JPanel();
	JPanel pN=new JPanel();
	JPanel pN3=new JPanel();
	
	
	JButton b1,b2,b3,b4,b5,b6;
	ImageIcon door, home, key, my, laundry;
	ImageIcon redoor,rehome,rekey,remy,relaundry;
	/*
	public LaundryAppGui() {
		// 배열로 가능한가? 배열로 하면 반복코드 수가 줄거같다.
		//ImageIcon arric[]=new ImageIcon[10];
		add(p);
		p.setLayout(null);
		p.setBackground(Color.white);
		pN.setLayout(new GridLayout());
		pN.setBounds(0,490, 435, 70);
		p.add(pN);
		
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
		
		
		jfb.setVisible(false);
		
		b1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				jfb.setVisible(true);
			}
		});
		
		
	}
	
	*/
	public static void main(String[] args) {
		//new LaundryAppGui();
		JFrameBase jfb=new JFrameBase();
		jfb.MainFrame();
		
		
		
	}

}
