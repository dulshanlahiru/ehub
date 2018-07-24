/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eh.servelt.event;

import eh.bean.event.EventBean;
import eh.bean.user.UserBean;
import eh.businesslogic.event.EventLogic;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author grdul
 */
public class AddEventServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            System.out.println("servlet->AddEventServlet");
            RequestDispatcher rd = null;

            HttpSession session = request.getSession(false);
            UserBean login = (UserBean) session.getAttribute("currentuser");
            
            
            
            System.out.println("uni_org_id:"+login.getUni_org_id());

            //collect the input from page
            EventBean eventBean = new EventBean();
            //insert into database `eh_event_calender``eh_event_calender`
            eventBean.setEvent_name(request.getParameter("event_name"));
            eventBean.setEnvent_id(Integer.parseInt(request.getParameter("envent_id")));
            eventBean.setEvent_datetime(request.getParameter("event_datetime"));
            eventBean.setComment(request.getParameter("comment"));
            eventBean.setUni_org_id(login.getUni_org_id());
            
            new EventLogic().setEvent(eventBean);

            request.setAttribute("msg", "<p class=\"bg-success\">New Event Created</p>");

            rd = request.getRequestDispatcher("/add-event.jsp");
            rd.forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(AddEventServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
