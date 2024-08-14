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
public class bai4 {
        public static void main(String[] args) {
        int n;
        String chuoi="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap So nguyen: ");
        n=sc.nextInt();
        if(n%2==0){
            chuoi="so chan";
        }else{
            chuoi="so le";
        }
        System.out.println(chuoi);
    }
}
