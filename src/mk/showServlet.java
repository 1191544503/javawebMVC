package mk;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "showServlet",urlPatterns="/show.action")
public class showServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDAO dao=UserDAOFactory.getUserDAOInstance();
        List<UserBean> list = dao.getAll();
        System.out.println(list);
        request.setAttribute("list", list);
        request.getRequestDispatcher("/show.jsp")
                .forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        }

    }

