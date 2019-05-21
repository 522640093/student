
import java.io.*;

public class XsReadWriteFile {
    /**
     * 读文件系统
     * @param  filepath
     * @return
     */
    public static String readFile(String filepath){
        File file=new File(filepath);
        StringBuffer str=new StringBuffer();
        try {
            FileInputStream fis=new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            int b;
            while((b=isr.read())!=-1){
                str.append((char) b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str.toString();
    }

    /**
     * 写文件方法
     * @param filepath 文件路径
     * @param context  文件内容
     */
    public static void writeFile(String filepath,String context){
        File file=new File(filepath);
        try {
            FileOutputStream fos=new FileOutputStream(file);
            fos.write(context.getBytes("UTF-8"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
