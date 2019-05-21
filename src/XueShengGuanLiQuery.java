import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class XueShengGuanLiQuery extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        XueShengGuanLi xueShengGuanLi=new XueShengGuanLiImp();
        List xslist=xueShengGuanLi.query();
        req.setAttribute("xslist",xslist);
        req.getRequestDispatcher("/xslist.jsp").forward(req,resp);

    }
}
