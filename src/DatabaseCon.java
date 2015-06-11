import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Stack;

import javax.swing.JComboBox;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;






import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;


import javax.swing.JTextArea;
import javax.swing.JTextField;


public class DatabaseCon implements ActionListener{
	Stack<String> content=new Stack<String>();
	calc cal=new calc();
	JFrame frame=new JFrame();
	JButton add=new JButton("add to list");
	JButton pay=new JButton("Payment");
	
	JTextArea text= new JTextArea(30,30);
		JComboBox box=new JComboBox();
			
		//loginPag value=new loginPag();
		Connection connection = null;
		ResultSet result;
		ResultSet users;
		databasAuth auth=new databasAuth();
		String name=auth.getName();
		String pass=auth.getPass();
		
		
		
		public void DatabaseCon() throws SQLException, ClassNotFoundException{
			
		try {
			
 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", "pvaloyi",
					"Kadoma89");
			
			Statement statement=connection.createStatement();
			result=statement.executeQuery("select Title,Price from Books ");
			
			
			while(result.next()){
			String title=result.getString("Title");
			 int price=result.getInt("Price");
		//		System.out.println("\n"+title+" "+price);
				
			box.addItem(result.getString("Title") + result.getInt("Price"));
				
			}
			
			
			
		} catch (ClassNotFoundException e) {
 
			System.out.println("Where is your Oracle JDBC Driver?");
			e.printStackTrace();
			return;
 
		}
 
		if (connection != null) {
			text.setText("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
		
		GUI();
	//	login();
	}
		public void GUI(){
			frame.setSize(500, 600);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setLayout(new FlowLayout());
			frame.add(box);
			
			frame.add(add);
			
			frame.add(pay);
			frame.add(text);
			add.addActionListener(this);
			pay.addActionListener(this);
			
		
			box.setMaximumRowCount(5);
			
			
			
			frame.setVisible(true);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==add){
			text.setText(box.getSelectedItem().toString());
			content.push(box.getSelectedItem().toString());
			text.setText(content.toString()+"\n");
			}
		}
		
		public void login() throws ClassNotFoundException, SQLException{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", "pvaloyi",
					"Kadoma89");
			
			Statement statement=connection.createStatement();
			result=statement.executeQuery("select from user where name= "+ name+" and "
					+ "password="+pass);
			
			if (result!=null){
				System.out.print("good");
			}else{
				System.out.print("fail");
			}
		}
		
		
		
		}
		
