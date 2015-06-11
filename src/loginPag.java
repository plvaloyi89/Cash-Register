

/*import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class loginPag implements MouseListener {

	JFrame area=new JFrame("Login");
	JTextField name=new JTextField(20);
	JPasswordField pass=new JPasswordField(20);
	JButton login= new JButton("Login");
	databasAuth value=new databasAuth();
	
	public loginPag(){
		
		area.setSize(300, 150);
		area.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		area.setLayout(new FlowLayout());
		area.add(name);
		area.add(pass);
		area.add(login);
		login.addMouseListener(this);
		
		area.setVisible(true);
	}



	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
			try {
				if(e.getSource()==login){
					String lvalue=name.getText();
					value.setName(lvalue);
					String lpass=pass.getText();
					value.setPass(lpass);
					System.out.print("Success");
					DatabaseCon on=new DatabaseCon();
				on.DatabaseCon();
				
				}else{
					System.out.print("fail");
				}
			} catch (SQLException | ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
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
*/