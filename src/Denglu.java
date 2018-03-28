import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet(name = "Denglu",urlPatterns = "/deng")
public class Denglu extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/NO1";
            try
            {
                Connection connection= DriverManager.getConnection(url,"root","gzx2540");
                Statement statement=connection.createStatement();
                String chaxun="SELECT password FROM usermessage WHERE ni='"+request.getParameter("yonghuming")+"'";
                ResultSet password=statement.executeQuery(chaxun);

                password.next();
                int mima=password.getInt(1);

                if(String.valueOf(mima).equals(request.getParameter("mima")))
                {
                    RequestDispatcher view=request.getRequestDispatcher("new.jsp");
                    view.forward(request,response);
                }
                else
                {
                    RequestDispatcher view=request.getRequestDispatcher("new.jsp");
                    view.forward(request,response);
                }
                password.close();
                statement.close();
                connection.close();
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
