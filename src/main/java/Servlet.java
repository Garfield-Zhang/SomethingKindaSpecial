import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns ={ "/patients","/doctors","/programming"},loadOnStartup = 1)
public class Servlet extends HttpServlet {

    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException, java.io.IOException {
        resp.getWriter().println(req.getServletPath()+" is fun (KILL ME)");
    }
    @Override
    protected void doPost(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException, java.io.IOException {
        resp.getWriter().println("Meow Meow");
    }
}

