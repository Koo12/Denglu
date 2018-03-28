import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet(name = "zhuce",urlPatterns = "/zhu")
public class zhuce extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/NO1";
            try
            {
                Connection connection= DriverManager.getConnection(url,"root","gzx2540");
                Statement statement=connection.createStatement();
                String charu="INSERT usermessage value ('"+request.getParameter("nicheng")+"',"+request.getParameter("mima")+",'"+request.getParameter("xingming")+"',"+request.getParameter("nianling")+",'"+request.getParameter("dan")+"','"+request.getParameter("qianming")+"')";
                statement.executeUpdate(charu);
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

        RequestDispatcher view=request.getRequestDispatcher("index.jsp");
        view.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
