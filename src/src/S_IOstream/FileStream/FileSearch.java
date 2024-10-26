package S_IOstream.FileStream;

import java.io.File;

public class FileSearch {
    public static void main(String[] args) {
//        File f1 = new File("D:");
//        String result = searchFile(f1);
//        if (result != null) {
//            System.out.println("找到文件: " + result);
//        } else {
//            System.out.println("文件未找到。");
//        }
//        sf(new File("D:"),"QQ.exe");
        Delete(new File("D:\\Test1"));
    }

    //搜索指定文件1
    public static String searchFile(File f) {
        if (f.isDirectory()) {
            File[] files = f.listFiles();
            if (files != null) {
                for (File file : files) {
                    String found = searchFile(file);
                    if (found != null) {
                        return found;
                    }
                }
            }
        } else if (f.getName().equals("QQ.exe")) {
            return f.getAbsolutePath();
        }
        return null;
    }

    //搜索指定文件2
    public static void sf(File dir,String filename){
        if (dir == null || !dir.exists() || dir.isFile()){
            return;
        }
        File[] files = dir.listFiles();
        if (files != null && files.length >0){
            for (File file : files) {
                if (file.isFile()){
                    if (file.getName().equals(filename)){
                        System.out.println(file.getAbsolutePath());
                        System.exit(0);
                    }
                }else {
                    sf(file,filename);
                }
            }
        }
    }

    //删除全部文件
    public static void Delete(File file){
        if (file == null || !file.exists()){
            return;
        }
        if(file.isFile()){
            file.delete();
            return;
        }
        File[] files = file.listFiles();
        if (files == null){
            return;
        }
        for (File f : files) {
            if (f.isFile()){
                f.delete();
            }else{
                Delete(f);
            }
        }
        file.delete();
    }
}
