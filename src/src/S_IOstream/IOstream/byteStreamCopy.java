package S_IOstream.IOstream;

import java.io.*;

public class byteStreamCopy {
    public static void main(String[] args) throws Exception {
        File organ = new File("D:\\test\\ba.txt");
        try (
                InputStream read = new FileInputStream(organ);
                OutputStream copy = new FileOutputStream("D:\\test\\ba-copy.txt");
                ){
            byte[] butter = new byte[1024];
            int len;
            while ((len = read.read(butter)) != -1){
                copy.write(butter,0,len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
