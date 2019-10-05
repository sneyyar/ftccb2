package com.company;
import java.io.*;
public class Readfile2 {
    public static void main(String[]args) {
        String str = null;
        try {
            FileReader fr = new FileReader("C:\\Abinav\\mysecondfile.txt");
            BufferedReader br = new BufferedReader(fr);
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        }catch(IOException e){

        }
    }
}
