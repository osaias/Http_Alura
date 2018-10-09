import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AreaComunidade")
public class AreaComunidade extends HttpServlet {

	public AreaComunidade() {
        super();
    }
 
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
 
        // Mostra pagina HTML
        response.setContentType("text/html");
 
        PrintWriter html = response.getWriter();
 
        String usuario = (String) request.getSession().getAttribute("usuario");
 
        if (usuario != null) {
            html.println("<html>");
            html.println("<body>");
            html.println("<h1>Desenvolvimento Aberto</h1>");
            html.println("<h2>Area da Comunidade - Java  </h2>");
            html.println("<h3>Bem-vindo: " + usuario + "</h3>");
            html.println("<p><a href='Sair'>Sair</a></p>");
            html.println("<h4>ID Sess�o: " + request.getRequestedSessionId() + "</h4>");
            html.println("<h4>URI: " + request.getRequestURI() + "</h4>");
            html.println("<h4>URL: " + request.getRequestURL() + "</h4>");
            html.println("<h4>Contexto da Sevlet: " + request.getServletContext() + "</h4>");
            html.println("<h4>Locale: " + request.getLocale() + "</h4>");
            html.println("<h4>Nome Da Servlet: " + this.getServletName() + "</h4>");
            html.println("<h4>Config. Servlet: " + this.getServletConfig() + "</h4>");
            
            html.println("</body>");
            html.println("</html>");
        }
        else
        {
            response.sendRedirect("Autenticar");
        }
  
    }
 
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
    }
    
    protected void testarService(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
    	this.service(request,response);
    }
}
