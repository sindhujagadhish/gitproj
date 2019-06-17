package helloPjt;

public class HelloDemo 
{
public static void main (String args[])
{
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("modified");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
