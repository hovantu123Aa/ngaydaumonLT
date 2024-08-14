/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vaonglap;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class bai8 {
      public static void main(String[] args) {
        int n;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        //b1 nhập hệ số a,b
        System.out.println("Cho biet he so n:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            sum +=i;
        }
        System.out.println("tong day so;"+sum);
    }
}
