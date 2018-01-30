package mk;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet(name = "Servlet",urlPatterns="/deal.action")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String actionurl = request.getServletPath();
        UserDAO dao=UserDAOFactory.getUserDAOInstance();
            System.out.println(request.getParameter("piao"));
            boolean count = dao.updateUser(request.getParameter("piao"));
            request.getRequestDispatcher("/success.jsp").forward(request,
                    response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
