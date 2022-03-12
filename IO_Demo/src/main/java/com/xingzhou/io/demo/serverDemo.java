package com.xingzhou.io.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author xingzhou
 * @version 1.0.0
 * @ClassName serverDemo.java
 * @Description TODO
 * @createTime 2022年03月12日 15:45:00
 */
public class serverDemo {
    public static void main(String[] args) throws IOException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务器已启动");
        while(true){
            final Socket accept = serverSocket.accept();
            System.out.println("有客户端连接");
            executorService.execute(new Runnable() {
                public void run() {
                    handle(accept);
                }
            });
        }
    }

    private static void handle(Socket socket) {
        System.out.println("线程ID:" + Thread.currentThread().getId()
        + "线程名称:" + Thread.currentThread().getName());
        //从连接中 取出 输入流 来接收消息
        try {
            InputStream inputStream = socket.getInputStream();
            byte[] bytes = new byte[1024];
            int read = inputStream.read(bytes);
            System.out.println("客户端:" + new String(bytes, 0, read));
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("没钱".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                //关闭连接
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
