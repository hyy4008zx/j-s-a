package datastructure;

import java.io.File;
import java.io.FileFilter;

/**
 * @Author: huyanyang
 * @Date: 2022/02/09/11:39
 * @Description:
 */
public class MyFile {
    public static void main(String[] args) {
        File file = new File("D:\\MyABC");
        //list filePath+fileName
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }
        //list fileName
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
        //filter fileName
        File[] s = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.toString().contains("s");
            }
        });
        for (File file1 : s) {
            System.out.println(file1);
        }

    }
}
