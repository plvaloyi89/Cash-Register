import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class databasAuth {
	
	String name;
	String pass;
	
	public databasAuth(String Uname,String Upass){
		
		name=Uname;
		pass=Upass;
		
	}
	
	public databasAuth() {
		// TODO Auto-generated constructor stub
	}

	public void setName(String lvalue){
		
		name=lvalue;
	}

	public String getName(){
		return name;
	}
	
	public void setPass( String lpass){
		pass=lpass;
	}
	
	public String getPass(){
		
		return pass;
	}
	public void es(){
		
	System.out.print(getName())	;
	System.out.println(getPass());	
	}
}
