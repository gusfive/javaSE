package V_NetworkProgramming;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Cilent_TCP {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        //1.创建Socket对象，并同时请求与服务端程序的连接
        Socket socket = new Socket("127.0.0.1",8888);
        new ClientReaderThread(socket).start();

        //2.从socket通信管道中得到一个字节输出流用来发送数据给服务端
        OutputStream os = socket.getOutputStream();

        //3.把低级的字节输出流包装成数据输出流
        DataOutputStream dos = new DataOutputStream(os);

        while (true) {
            System.out.println("请输入");
            String msg = sc.nextLine();
            if(msg.equals("exit")){
                System.out.println("退出成功");
                dos.close();
                socket.close();
                break;
            }
            //4.开始写数据出去
            dos.writeUTF(msg);
        }

//        dos.close();
//        socket.close();

    }
}
