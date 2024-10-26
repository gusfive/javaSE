package V_NetworkProgramming;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class BSServerReaderRunnable implements Runnable{
    private Socket socket;

    public BSServerReaderRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run(){
        try {
            OutputStream os = socket.getOutputStream();
            PrintStream ps = new PrintStream(os);
            ps.println("HTTP/1.1 200 OK");
            ps.println("Content-Type:text/html;charset=UTF-8");
            ps.println();//必须换行
            ps.println("gs0001");
            os.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
