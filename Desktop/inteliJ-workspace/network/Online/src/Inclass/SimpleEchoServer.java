package Inclass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SimpleEchoServer implements Runnable{ // 다중 접속 에코 서버
    private static  Socket clientSocket;
    public SimpleEchoServer(Socket clientSocket) {
        this.clientSocket = clientSocket ;
    }
    public static void main(String[] args) {
        ExecutorService eService = Executors.newFixedThreadPool(2); // 2 threads limit
        System.out.println("다중 접속 에코 서버");

        try (ServerSocket serverSocket = new ServerSocket(20000)) {
            while (true) {
                System.out.println("클라이언트 접속 대기중 ......");
                clientSocket = serverSocket.accept();
                SimpleEchoServer tes = new SimpleEchoServer(clientSocket);
//                new Thread(tes).start();    // while문을 통해 무한 발급되던 코드
                eService.submit(tes);
            }
        } catch (IOException ex) {
            System.out.println("입출력 오류 발생");
        }
        System.out.println("다중 접속 에코 서버 종료");
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread() + "스레드 접속");
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)
        ) {
            String inputLine;
            while ((inputLine = br.readLine()) != null) {
                System.out.println(Thread.currentThread() + "클라이언트가 보낸 메세지 : " +  inputLine);
                 out.println(inputLine);
             }
              System.out.println(Thread.currentThread() + "클라이언트가 종료됨"); }
         catch (IOException ex) 
         {
         }
    }
}





//public class SimpleEchoServer {
//    public static void main(String[] args) {
//        System.out.println("에코 서버 시작됨");
//        try (ServerSocket serverSocket = new ServerSocket(9900)) {
//            System.out.println("클라이언트 접속 대기 중.....");
//            Socket clientSocket = serverSocket.accept();  // 접속 대기
//            System.out.println("클라이언트 접속됨.");
//
//            try {
//                BufferedReader br =
//                        new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
//                PrintWriter pw =
//                        new PrintWriter(clientSocket.getOutputStream(), true);
////                String line;
////                while ((line = br.readLine()) != null) {
////                    System.out.println("클라이언트로 부터 받은 메세지 : " + line);
////                    pw.println(line);  // 클라이언트로 송신
////                }
//                Supplier<String> socketIn = () -> {
//                    try {
//                        return br.readLine();
//                    } catch (IOException ex) {
//                        return null;
//                    }
//                };
//                Stream
//                        .generate(socketIn)
//                        .peek(text -> {
//                    System.out.println("클라이언트로부터 받은 메세지 : "+ text);
//                    pw.println(text);
//                        }).allMatch(Objects::nonNull);
//
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        catch (IOException ex) {
//            System.out.println("접속 실패!");
//        }
//    }
//}
