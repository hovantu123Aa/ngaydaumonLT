/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mang;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai17 {
    public static void main(String[] args) {
        Double[] a;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println(" cgo biet so phan tu cua mang a:");
        n = sc.nextInt();
        a = new Double[n];
        nhapMang(a, sc);
        System.out.println("---Mang a la so thuc---");
        xuatMang(a);
        Double tb = tinhtb(a);
        System.out.println("trung binh cua mang" + tb);
        Double min = timMin(a);
        System.out.println("gia tri nho nhat cua mang" + min);
    }

    public static void nhapMang(Double[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("cho biet gia tri cua mang a[" + i + "]:");
            a[i] = sc.nextDouble();
        }
    }

    public static void xuatMang(Double[] a) {
        for (Double inpout : a) {
            System.out.print(inpout + " ");
        }
    }

    public static Double tinhtb(Double[] a) {
       return null;
        
    }

    public static Double timMin(Double[] a) {
        Double min = a[0];
        for (Double x : a) {
            if (x < min) {
                min = x;
            }
        }
        return min;

    }
}
