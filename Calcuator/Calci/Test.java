package com.java8.java8features.test;

import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class TestL {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            if(s1.length() < 15){
                int len = s1.length(); // 3
                int space = 15-len;
                for(int x1=0;x1<space;x1++){
                    s1 = s1 + " ";
                }
                int length = String.valueOf(x).length();
                if(length == 3) {
                	System.out.println(s1+x);
                }else if(length == 2) {
                	System.out.println(s1+"0"+x);
                }else {
                	System.out.println(s1+"00"+x);
                }
            }
        }
        System.out.println("================================");

}
}
