package Studentmain;
import stuBean.StudentBean;

import java.sql.SQLException;

import StudentInsertion.StudentInsertion;
public class studentmain 
{
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		StudentBean st=new StudentBean();
		st.setId(1152);
		st.setName("Sathi");
		st.setEmail("satish@");
		StudentInsertion si=new StudentInsertion();
		si.StudentInsert(st);
	}

}
