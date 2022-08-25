package net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class WriteServer {
//    public static int serverPore = 998;
//    public static int clientPort = 999;
//    public static int buffer_size = 10242;
//    public static DatagramSocket ds;
//    public static byte buffer[] = new byte[buffer_size];

    public static void TheServer() throws Exception {
//        int pos = 0;
//        while (true) {
//            int c = System.in.read();
//            switch (c) {
//                case -1:
//                    System.out.println("Сервер завершает сеанс.");
//                    ds.close();
//                    return;
//                case '\r':
//                    break;
//                case '\n':
//                    ds.send(new DatagramPacket(buffer, pos, InetAddress.getLocalHost(), clientPort));
//                    pos = 0;
//                    break;
//                default:
//                    buffer[pos++] = (byte) c;
//            }
//        }
    }


    public static void TheClient() throws Exception {
//        while (true) {
//            DatagramPacket p = new DatagramPacket(buffer, buffer.length);
//            ds.receive(p);
//            System.out.println(new String(p.getData(), 0, p.getLength()));
//        }
    }

    public static void main(String[] args) throws Exception {
//        if (args.length == 1) {
//            ds = new DatagramSocket(serverPore);
//            TheServer();
//        } else {
//            ds = new DatagramSocket(clientPort);
//            TheClient();
//        }
    }

}
