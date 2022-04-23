import java.io.*;
import javax.servlet.*;
public class Demo extends GenericServlet
{
    private String name,addrs,roll,fee;
    public void init()
    {
        name="java technocrat";
        addrs="A/54, saheed Namar";
        roll="JT201901";
        fee="10000.90";
    }
    public void service(ServletRequest req,ServletResponse res)throws IOException,ServletException
    {
        res.setContentType("text/xml");
        PrintWriter pw=res.getWriter();
        pw.println("<student><name>"+name+"</name>");
        pw.println("<address>"+addrs+"</address>");
        pw.println("<roll-no>"+roll+"</roll-no>");
        pw.println("<fee>"+fee+"</fee></student>");
    }
}