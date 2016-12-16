
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created by Kuba on 2016-12-16.
 */
@WebServlet(name = "Hello Servlet" )
public class HelloServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws  ServletException, IOException {

    }
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws  ServletException, IOException {

    }
}
