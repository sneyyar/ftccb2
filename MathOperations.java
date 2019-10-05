package com.company;

public class MathOperations {
    public static void main(String[]args){
        int a = 6;
        int b = 4;
        int c = subtract(a, b);
        System.out.println(c);

        c = subtract( 7 , 4);
        System.out.println( c);

        c = add( 6,7);
        System.out.println( c);
        c = multiply( 3,7);
        System.out.println( c);
    }

    public static int subtract (int x , int y){
        int sub = x - y;
        return sub;
    }

    public static int add(int x , int y) {
        int add = x - y;
        return add;
    }
    public static int multiply(int x , int y){
            int multiply = x *y;
            return multiply;

    }


}
