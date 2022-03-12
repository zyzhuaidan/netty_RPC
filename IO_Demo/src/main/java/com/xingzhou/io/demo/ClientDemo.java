package com.xingzhou.io.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author xingzhou
 * @version 1.0.0
 * @ClassName ClientDemo.java
 * @Description TODO
 * @createTime 2022年03月12日 16:00:00
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        while(true){
            //创建一个socket对象
            Socket socket = new Socket("127.0.0.1",9999);
            OutputStream outputStream = socket.getOutputStream();
            System.out.println("请输入：");
            Scanner scanner = new Scanner(System.in);
            String message = scanner.nextLine();
            outputStream.write(message.getBytes());
            //从连接中取出一个流
            InputStream inputStream = socket.getInputStream();
            byte[] bytes = new byte[1024];
            int read = inputStream.read(bytes);
            System.out.println("老板说：" + new String(bytes, 0, read).trim());
            //关闭
            socket.close();
//            System.out.println("关闭一次");
        }
    }
}
