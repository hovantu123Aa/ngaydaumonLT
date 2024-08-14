/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package renhanh;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class bai1 {
     public static void main(String[] args) {
        double a,b;
        String kq="";
        Scanner sc=new Scanner(System.in);
        System.out.println("===Giai phuong trinh bac 1===");
        System.out.print("Cho biet he so a:");
        a=sc.nextDouble();
        System.out.print("Cho biet he so b:");
        b=sc.nextDouble();
        if (a==0) {
            if(b==0){
                kq="Phuong trinh vo so nghiem ";
            }else{
                kq="phuong trinh vo nghiem ";
            }
        }else{
            kq="phuong trinh có ngiem x= " + (-b/a);
        }
        System.out.printf(kq);  
    }    
}
