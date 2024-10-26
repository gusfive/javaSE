package V_NetworkProgramming;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server_UDP {
    public static void main(String[] args) throws Exception{
        System.out.println("sevice start");
        //1.创建服务端对象(注册端口)
        DatagramSocket service = new DatagramSocket(6666);
        DatagramPacket packet = null;

        while (true) {
            //2.创建数据包以接收数据
            byte[] buffer = new byte[1024 * 64];//一包数据不超过64kb
            packet = new DatagramPacket(buffer,buffer.length);

            //3.正式接收数据
            service.receive(packet);

            //4.查看数据
            System.out.println(packet.getAddress().getHostAddress() + ":" + new String(buffer,0,packet.getLength()));//接收多少写出多少
        }

//        System.out.println(packet.getAddress().getHostAddress());//拿到客户端的地址
//        System.out.println(packet.getPort());//拿到客户端的端口
//        service.close();//释放资源
    }
}
