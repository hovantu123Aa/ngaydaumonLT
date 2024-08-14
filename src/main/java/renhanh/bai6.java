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
public class bai6 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc=new Scanner(System.in);
        System.out.println(" vui long nhap so nguyen thu nhat");
        System.out.println(" vui long nhap so nguyen thu hai    ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("vui long nhap phép toán +,-,*,/:");
        int kq=0;
        switch(kq){
             case '+':
            System.out.print("ket qua cua phep cong"+(a+b));
            break;
            case '-':
            System.out.print("ket qua cua phep tru " +(a-b));
              case '*':
            System.out.print("ket qua cua phep nhan" +(a*b));
            case '/':
            if(b!=0){
                System.out.println("ket qua cua phep nha"+((double)b/a));
            }else{
              System.out.print("không chia het :");
            }
            break;
            default: 
                break;
        }    
    }
}