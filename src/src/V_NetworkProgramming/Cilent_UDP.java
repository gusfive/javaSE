package V_NetworkProgramming;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Cilent_UDP {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
           //1.创建客户端对象
                DatagramSocket socket = new DatagramSocket();
        try
        {
        //2.创建数据包，封装要发出去的数据
        while (true) {
            System.out.println("请输入");
            String msg = sc.nextLine();
            if (msg.equals("exit")){
                System.out.println("即将退出");
                socket.close();
                break;
            }
            byte[] bytes = msg.getBytes(StandardCharsets.UTF_8);
            DatagramPacket packet = new DatagramPacket(bytes,bytes.length, InetAddress.getLocalHost(),6666);

            //3.正式发送这个数据包的数据出去了
            socket.send(packet);
        }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
                    System.out.println("send successfully");
                    socket.close();//释放服务器资源
        }


        //多开服务器需要右上角重新设置允许多开，此外端口要做出更改

    }
}
