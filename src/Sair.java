import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Sair")
public class Sair extends HttpServlet {

	public Sair() {
        super();
    }
 
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
 
        // Invalida sessão e redireciona para login
        request.getSession().invalidate();
        response.sendRedirect("Autenticar");
    }
 
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
    }
}
