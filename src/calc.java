import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class calc implements MouseListener{
	
	CashReg bill=new CashReg();
	JFrame area=new JFrame("Login");
	JTextField name=new JTextField(20);
	JPasswordField pass=new JPasswordField(20);
	JButton pay= new JButton("Enter Amount");
	Scanner scan=new Scanner(System.in);
	
	public void calc(){
		
		area.setSize(300, 150);
		area.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		area.setLayout(new FlowLayout());
		area.add(name);
	
		area.add(pay);
		pay.addMouseListener(this);
		
		area.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==pay){
		//	String Pays= name.
			//double lpay=Pays;
			//bill.setPayment(Pays);
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
}