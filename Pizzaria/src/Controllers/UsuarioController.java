/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.IOException;
import java.io.PrintWriter;
import model.bean.Usuario;

/**
 *
 * @author pedro
 */
@WebServlet(name = "UsuarioController", urlPatterns = {"/usucontroller.do"})
public class UsuarioController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private final Login login = new Login();

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UsuarioController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UsuarioController at " + request.getContextPath() + "</h1>");
            out.println("</body>"); 
            out.println("</html>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response){
        Usuario usuario = new Usuario();

        usuario.setNome(request.getParameter("txtnome"));
        usuario.setEmail(request.getParameter("txtemail"));
        usuario.setCpf(request.getParameter("txtcpf"));
        
        login.create(usuario);
        
    }

}
