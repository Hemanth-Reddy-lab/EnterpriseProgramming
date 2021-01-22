package klmain;

import java.sql.SQLException;
public class Studentmain {
	public static void main(String[]args) throws ClassNotFoundException, SQLException {
		StudentBean sb=new StudentBean();
		sb.setReg_no(3520);
		sb.setName("Hensikki");
		sb.setEmail("mintu@gmail.com");
		StudentInsertion si =new StudentInsertion();
		int i=si.StudentInsert(sb);
		if(i>0)
		{
			System.out.println("Insertion successful");
		}
		else
		{
			System.out.println("Insertion failed");
		}
	}
}