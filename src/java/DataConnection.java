import java.sql.*;
import java.util.ArrayList;

public class DataConnection {
    public static Connection getConnect() 
    {
        Connection con = null;
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
        }
        catch(Exception ex)
        {
           ex.printStackTrace();
        }
        return con;
    }
    public int dataInsert(Student s)
    {
        Connection con=DataConnection.getConnect();
        int result=0;
        String insertQuery="insert into student values(?,?,?,?,?)";
        try {
            PreparedStatement ps=con.prepareStatement(insertQuery);
            ps.setInt(1,s.getId());
            ps.setString(2,s.getName());
            ps.setString(3,s.getMobnum());
            ps.setString(4,s.getEmail());
            ps.setString(5,s.getCourse());
            result=ps.executeUpdate();
        } catch (SQLException ex) {
               System.err.println("sql exception");
        }
        return result;
    }
    public ArrayList<Student> dataView()
    {
        Connection con=DataConnection.getConnect();
        ArrayList<Student> list=new ArrayList<>();
        String selectQuery="select * from student";
        try {
            Statement ps2=con.createStatement();
            ResultSet rs=ps2.executeQuery(selectQuery);
            while(rs.next())
            {
                Student s=new Student();
                s.setId(rs.getInt("stuid"));
                s.setName(rs.getString("stuname"));
                s.setMobnum(rs.getString("mobnum"));
                s.setEmail(rs.getString("email"));
                s.setCourse(rs.getString("course"));
                 list.add(s);
            }
        } catch (SQLException ex) {
               System.err.println("sql exception");
        }
       
        return list;
    }
    
}
