package V_NetworkProgramming;

public class UDPDemo {
    public static void main(String[] args) throws Exception {
        //UDP(User Datagram Protocol):用户数据协议
        //    特点：无连接，不可靠，通信效率高（语音通话、视频直播）
        //    不事先建立连接，数据按照包发，一包数据包含：自己的IP、程序端口、目的地IP、程序端口和数据（限制在64KB）等
        //    发送方不管对方是否在线，数据在中间丢失也不管，如果接收方收到数据也不返回确认，故是不可靠的
        //    JAVA提供了一个java.net.DatagramSocket类来实现UDP通信

//        //DatagramSocket:用于创建客户端、服务端
//        DatagramSocket user = new DatagramSocket();//创建客户端的Socket对象，系统会随机分配一个端口
//        DatagramSocket service = new DatagramSocket();//创建服务端的Socket对象，并指定端口号
//
//        user.send(new DatagramPacket());//发送数据包
//        service.receive(new DatagramPacket());//使用数据包接收数据
//
//        //DatagramPacket:创建数据包
//        //    参数1：字节数组，代表要传输的内容
//        //    参数2：发送出去的数据大小（字节个数）
//        //    参数3：服务端的IP地址（找到服务端主机）
//        //    参数4：服务端程序的端口
//
//        //getLength（）获取数据包，实际接收到的字节个数

    }
}
