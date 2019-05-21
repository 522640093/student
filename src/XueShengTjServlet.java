
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XueShengTjServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        XueSheng xueSheng=new XueSheng();

        xueSheng.setXsname(req.getParameter("xsname"));
        xueSheng.setXsage(Integer.parseInt(req.getParameter("xsage")));
        xueSheng.setXsnianji(req.getParameter("xsnianji"));

        String xk[]=req.getParameterValues("xk");
        List xklist=new ArrayList();
        String xueke[]={"语文","数学","英语","物理","音乐","体育"};
        for(int i=0;i<xk.length;i++){
            xk[i]=xueke[i];
            xklist.add(xk[i]);
        }
        xueSheng.setXueke(xklist);

        XueShengGuanLi xueShengGuanLi=new XueShengGuanLiImp();
        xueShengGuanLi.add(xueSheng);

        req.getRequestDispatcher("/xsresult.jsp").forward(req,resp);

    }
}
