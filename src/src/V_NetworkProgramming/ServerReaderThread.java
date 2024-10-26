package V_NetworkProgramming;

import java.io.*;
import java.net.Socket;

public class ServerReaderThread extends Thread{
    private Socket socket;
    public ServerReaderThread(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run(){
        //3.从socket通信管道中得到一个字节输入流
        try {
            InputStream is = socket.getInputStream();
            //4.把原始的字节输入流包装成数据输入流
            DataInputStream dis = new DataInputStream(is);
            //如果客户端的通信管道关闭，则会报异常
            //5.使用数据输入流读取客户端发送过来的消息
            while (true) {
                try {
                    String rs = dis.readUTF();//要和客户端一一对应
                    System.out.println(socket.getRemoteSocketAddress() + ":" + rs);
                    //把接收到的消息发给所有客户端接收
                    sendMsgToAll(socket.getRemoteSocketAddress() + ":" + rs);
                } catch (Exception e) {
                    System.out.println(socket.getRemoteSocketAddress() + "下线了");
                    Server_TCP.onLineSocket.remove(socket);
                    dis.close();
                    socket.close();
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void sendMsgToAll(String rs) throws Exception {
        //发送给全部在线的socket对象接收
        for (Socket socket1 : Server_TCP.onLineSocket) {
            OutputStream os = socket1.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF(rs);
            dos.flush();//刷新防止数据没有被发送出去
        }
    }
}
