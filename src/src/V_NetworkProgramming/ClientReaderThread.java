package V_NetworkProgramming;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class ClientReaderThread extends Thread{
    private Socket socket;
    public ClientReaderThread(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run(){
        try {
            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            while (true){
                try {
                    System.out.println(dis.readUTF());
                } catch (Exception e) {
                    System.out.println("本机已下线");
                    dis.close();
                    socket.close();
                    break;
                }
            }
        }catch (Exception e){

        }
    }

}
