package V_NetworkProgramming;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPDemo {
    public static void main(String[] args) throws Exception {
        //TCP通信
        //  特点：面向连接、可靠通信
        //  通信双方事先会采用”三次握手“方式建立可靠连接，实现端到端的通信；底层能保证数据成功传给服务端。
        //  Java提供了一个java.net.Socket类来实现TCP通信。

        //客户端开发
        //  客户端程序通过java.net包下的Socket类来实现的

        //  构造器：socket，第一个参数为string，指定服务器的ip。第二个参数为int port，端口号。
        Socket service = new Socket(InetAddress.getLocalHost().getHostAddress(),8888);
        //  方法：
        OutputStream os = service.getOutputStream();//获得字节输出流对象，用来发送数据给服务端
        InputStream is =service.getInputStream();//获得字节输入流对象，用来接收服务端数据

        //服务端开发
        //  服务端程序通过java.net包下的ServerSocket类来实现的。

        //  注册端口
        ServerSocket socket = new ServerSocket(8888);

        //  方法
        Socket socketService = socket.accept();//阻塞等待客户端的连接请求，一旦与某个客户端成功连接，则返回服务端这边的Socket对象。

        //与多个客户端同时保持通信
        //    不可以。因为服务端现在只有一个主线程，只能处理一个客户端的消息。
        //    要利用多线程。

        //TCP通信-端口转发

    }
}
