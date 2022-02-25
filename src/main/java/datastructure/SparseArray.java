package datastructure;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: huyanyang
 * @Date: 2022/02/08/11:03
 * @Description:
 */
public class SparseArray {
    public static void main(String[] args) throws IOException {
        int a[][] = new int[11][11];
        a[1][2]=1;
        a[3][4]=2;
        int sum=0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if(a[i][j]!=0){
                    sum++;
                }
//                System.out.printf("%d\t",a[i][j]);
            }
//            System.out.println();
        }

        int sparseArray[][]=new int[sum+1][3];
        sparseArray[0][0]=a.length;
        sparseArray[0][1]=a[0].length;
        sparseArray[0][2]=sum;
        int count=0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if(a[i][j]!=0){
                    count++;
                   sparseArray[count][0]=i;
                   sparseArray[count][1]=j;
                   sparseArray[count][2]=a[i][j];
                }
            }
        }

/*        System.out.println("NormalArray To SparseArray");
        for (int[] ints : sparseArray) {
            for (int i : ints) {
                System.out.printf("%d\t",i);
            }
            System.out.println();
        }*/

        System.out.println("Save NormalArray To SparseArray in disk");
//        FileOutputStream fos=null;
//        BufferedOutputStream bos =null;
//        try {
//             fos = new FileOutputStream(new File("D:/MyABC/data"));
//             bos=new BufferedOutputStream(fos);
//            for (int[] ints : sparseArray) {
//                for (int i : ints) {
//                    String s = new Integer(i).toString();
//                    byte[] bytes = s.concat("\r\n").getBytes();
//                    fos.write(bytes);
//                }
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            fos.close();
//        }

        FileReader fr = new FileReader("D:\\MyABC\\data");
        BufferedReader br = new BufferedReader(fr);
        String line =null;
        List<String> s =new ArrayList<String>();
        StringBuilder ss = new StringBuilder();
        while((line=br.readLine())!=null){

            System.out.println(line);
            s.add(line);
            ss.append(line+",");
        }
        String[]  aaaa = new String(ss).split(",");
        for (int i = 0; i < sparseArray.length; i++) {
            for (int j = 0; j < sparseArray[0].length; j++) {
//               a[i][j]= Integer.parseInt(s.get(i*3+j));
                a[i][j]= Integer.parseInt(aaaa[i*3+j]);
                System.out.printf("%d\t",a[i][j]);
            }
            System.out.println();
        }
        br.close();


//        int[][] b = new int[sparseArray[0][0]][sparseArray[0][1]];
//        int tmp = sparseArray[0][2];
//        for (int i = 0; i < tmp; i++) {
//            b[sparseArray[i+1][0]][sparseArray[i+1][1]]=sparseArray[i+1][2];
//        }
//        System.out.println("SparseArray To NormalArray");
//        for (int[] ints : b) {
//            for (int i : ints) {
//                System.out.printf("%d\t",i);
//            }
//            System.out.println();
//        }
//
//        int c[][]=new int[2][2];
//        for (int[] ints : c) {
//            for (int i : ints) {
//                System.out.printf("%d\t",i);
//            }
//            System.out.println();
//        }
//
//        String s[][]=new String[2][2];
//        for (String[] strings : s) {
//            for (String string : strings) {
//                System.out.printf("%s\t",string);
//            }
//            System.out.println();
//        }

    }
 }
