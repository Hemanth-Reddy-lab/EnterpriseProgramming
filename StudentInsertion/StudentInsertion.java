package StudentInsertion;
import DBUnit.DBUnit;
import stuBean.StudentBean;
import java.sql.*;
public class StudentInsertion{
	public int StudentInsert(StudentBean student) throws ClassNotFoundException,SQLException
	{
		DBUnit db=new DBUnit();
		Connection con=db.DBConnection();
		PreparedStatement ps=con.prepareStatement("insert into student values");
		ps.setInt(1,student.getId());
		ps.setString(2,student.getName());
		ps.setString(3,student.getEmail());
		ps.execute();
		con.close();
		return 0;
	}
}
