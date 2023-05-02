package myCharStream1;
//文件夹拷贝
import java.io.*;

public class Test1 {
    public static void main(String[] args) throws IOException {
        File scr=new File("C\\aaa\\scr");
        File dest=new File("C\\aaa\\dest");

        getCopydir(scr, dest);
    }

    private static void getCopydir(File scr, File dest) throws IOException {
        dest.mkdirs();
        File []files=scr.listFiles();
        for (File file : files) {
            if(file.isFile()){
                FileInputStream fis=new FileInputStream(file);
                FileOutputStream fos=new FileOutputStream(new File(dest,file.getName()));
                byte[]bytes=new byte[1024];
                int len;
                while ((len= fis.read(bytes))!=-1){
                    fos.write(bytes,0,len);
                }
                fos.close();
                fis.close();

            }else {
                getCopydir(file,new File(dest,file.getName()));
            }
        }
    }


}

