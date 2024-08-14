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
public class bai5 {
     public static void main(String[] args) {
        double sokm,dongia;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao so km:");
        sokm=sc.nextDouble();
        if(sokm==1){
            System.out.println("15000d");
        }else if(sokm>=2&&sokm<=5){
            dongia=sokm*13500;
            System.out.print(dongia);
        }else if(sokm>6){
            dongia=sokm*11000;
            System.out.print(dongia);
        }else if(sokm>120){
            dongia=sokm*11000*0.1;
            System.out.print(dongia);
        }
        else{
            System.out.print("khong hop le");}
    }
}
