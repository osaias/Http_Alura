import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Autenticar")
public class Autenticar extends HttpServlet {

	public Autenticar() {
        super();
    }
 
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        // Mostra pagina HTML
        response.setContentType("text/html");
 
        PrintWriter html = response.getWriter();
 
        html.println("<html>");
        html.println("<body>");
        html.println("<h1>Desenvolvimento Aberto</h1>");
        html.println("<h2>Login: </h2>");
 
        // Formulário processa este mesmo Servlet e o método DoPost
        html.println("<form action='Autenticar' method='post'>");
 
        html.println("Nome  : <input type='text' name='nome' size ='40' /> <br>");
        html.println("Senha : <input type='password' name='senha' size ='40' /> ");
        html.println("<input type='submit' name='login' value='Login'/> <br>");
 
        html.println("</form>");
        html.println("</body>");
        html.println("</html>");
 
    }
 
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
 
        String usuario = request.getParameter("nome");
        String senha = request.getParameter("senha");
 
        // Verifica usuario e senha
        // provavelmente você utilizará um banco de dados
        // Neste exemplo utilizaremos valores fixos
 
        if (usuario.equals("Teste") && senha.equals("1234")) {
            request.getSession().setAttribute("usuario", usuario);
            response.sendRedirect("AreaComunidade");
        } 
        else {
            response.sendRedirect("Autenticar");
        }
 
    }
}
