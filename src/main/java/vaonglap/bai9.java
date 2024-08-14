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
public class bai9 {
     public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong N: ");
        N = sc.nextInt();
        if (N <= 0) {
            System.out.println("N la so nguyen duong > 0");
        } else {
            int a = 0;
            for (int i = 1; i <= N; i++) {
                if (N % i == 0) {
                    a++;
                }
            }
            System.out.println("Uoc cua so " + N + " la: " + a);
        }
    }
}
