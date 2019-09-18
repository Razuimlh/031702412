package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ghghgj {
    public static void main(String args[]) {
        int b = 0;
        FileInputStream in = null;
        try {
            in = new FileInputStream("C:\\temp\\1.txt");
        } catch (FileNotFoundException e) {
            System.out.println("系统找不到指定文件！");
            System.exit(-1);
        }
        long num = 0;
        try {
            while ((b = in.read()) != -1) {
                System.out.print((char) b);
                num++;
            }
            in.close();
            System.out.println();
        } catch (IOException e1) {
            System.out.println("文件读取错误！");
        }
    }
}
