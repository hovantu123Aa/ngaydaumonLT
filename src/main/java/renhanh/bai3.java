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
public class bai3 {
     public static void main(String[] args) {
        int a,b,c;
        String tong="";
        Scanner sc=new Scanner(System.in);
        System.out.println("cho biet he so a:");
        a=sc.nextInt();
        System.out.println("cho biet he so b:");
        b=sc.nextInt();
        System.out.println("cho biet he so c:");
        c=sc.nextInt();
        if(a<b){
            tong="a la so nho nhat ";
        }else if(b<c){
            tong="b la so nho nhat " ;
        }else if (c<a){
            tong="c la so nho nhat";
        }
        System.out.println(tong);
    }
}
