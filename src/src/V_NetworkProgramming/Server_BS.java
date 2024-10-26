package V_NetworkProgramming;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server_BS {
    public static void main(String[] args) throws Exception{
        System.out.println("------start successfully");
        //1.创建ServerSocket对象，同时为服务端注册端口
        ServerSocket serverSocket = new ServerSocket(8080);

//        while (true) {
//            //2.使用serverSocket对象，调用一个accept方法，等待客户端的连接请求
//            Socket socket = serverSocket.accept();//阻塞等待客户端的连接请求，一旦与某个客户端成功连接，则返回服务端这边的Socket对象。
//            System.out.println(socket.getRemoteSocketAddress()+"上线了");
//
//            //3.把客户端对应的socket通信管道，交给一个独立的线程负责处理。
//            new BSServerReaderThread(socket).start();
//        }

        //创建一个线程池，负责处理通信管道的任务。
        ThreadPoolExecutor pool = new ThreadPoolExecutor(16 * 2,16 * 2,0, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(8), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        while (true){
            //2.使用serverSocket对象，调用一个accept方法，等待客户端的连接请求
            Socket socket = serverSocket.accept();//阻塞等待客户端的连接请求，一旦与某个客户端成功连接，则返回服务端这边的Socket对象。
            pool.execute(new BSServerReaderRunnable(socket));
        }

    }
}
