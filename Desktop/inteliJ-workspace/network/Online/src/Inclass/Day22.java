//package Inclass;
//
//import java.net.DatagramSocket;
//import java.net.InetSocketAddress;
//import java.nio.channels.ServerSocketChannel;
//import java.nio.channels.SocketChannel;
//import java.util.Date;
//
//import static java.lang.System.currentTimeMillis;
//
//public class Day22 {
//    public static void main(String[] args) {
//        System.out.println("NIO 타임 서버");
//        DatagramSocket serverSocket = null ;
//        try{
//            ServerSocketChannel ssc = ServerSocketChannel.open();
//            ServerSocketChannel.socket().bind(new InetSocketAddress(20000));
//            while (true) {
//                System.out.println("Waiting for request");
//                SocketChannel socketChannel = ServerSocketChannel.accept();
//                String dt;
//                if (ssc != null) {
//                    dt = "날짜" +   +  new Date(currentTimeMillis());
//                }
//        }
