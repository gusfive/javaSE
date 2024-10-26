package V_NetworkProgramming;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server_TCP {
    public static List<Socket> onLineSocket = new ArrayList<>();
    public static void main(String[] args) throws Exception{
        System.out.println("------start successfully");
        //1.创建ServerSocket对象，同时为服务端注册端口
        ServerSocket serverSocket = new ServerSocket(8888);

        while (true) {
            //2.使用serverSocket对象，调用一个accept方法，等待客户端的连接请求
            Socket socket = serverSocket.accept();//阻塞等待客户端的连接请求，一旦与某个客户端成功连接，则返回服务端这边的Socket对象。
            System.out.println(socket.getRemoteSocketAddress()+"上线了");
            onLineSocket.add(socket);

            //3.把客户端对应的socket通信管道，交给一个独立的线程负责处理。
            new ServerReaderThread(socket).start();
        }

//        System.out.println(socket.getRemoteSocketAddress());//获得客户端的ip地址
//
//        dis.close();
//        socket.close();

    }
}
