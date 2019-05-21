
import java.util.ArrayList;
import java.util.List;

public class XueShengGuanLiImp implements XueShengGuanLi {
    @Override
    public void add(XueSheng xueSheng) {

        List xkList=xueSheng.getXueke();
        String xk="";
        for(int i=0;i<xkList.size();i++){
            xk += xkList.get(i)+"#";
           // xk=xk+xkList.get(i)+"#";
        }
        String newcontext=xueSheng.getXsname()+"@"+xueSheng.getXsage()+"@"+xueSheng.getXsnianji()+"@"+xk+"%";
        String oldcontext=XsReadWriteFile.readFile("G:\\学生.txt");
        XsReadWriteFile.writeFile("G:\\学生.txt",oldcontext+newcontext);
    }

    @Override
    public List query() {

        String context=XsReadWriteFile.readFile("G:\\学生.txt");
        String xsarray[]=context.split("%");
        List xsList=new ArrayList();

        for(int x=0;x<xsarray.length;x++){
            XueSheng  xueSheng=new XueSheng();

            String xssx[]=xsarray[x].split("@");

            xueSheng.setXsname(xssx[0]);
            xueSheng.setXsage(Integer.parseInt(xssx[1]));
            xueSheng.setXsnianji(xssx[2]);

            String xkarray[]=xssx[3].split("#");
            List xuekeList=new ArrayList();
            for(int y=0;y<xkarray.length;y++){
                xuekeList.add(xkarray[y]);
            }
            xueSheng.setXueke(xuekeList);

            xsList.add(xueSheng);
        }
        return xsList;
    }
}
