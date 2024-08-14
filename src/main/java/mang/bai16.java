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
public class bai16 {
    public static void main(String[] args) {
        int[] a;
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("cho biet gia tri cua mang a[" + i + "]:");
            a[i] = sc.nextInt();
        } 
        System.out.println("mang a");
        int tong = tinhTong(a);
        System.out.print("Tong gia tri mang:" + tong);

        int dem_duong_le = demDuongLe(a);
        System.out.print("So duong le co trong mang:" + dem_duong_le);
        int max = TimMax(a);
        System.out.print("Phan tu lon nhat:" + max);
    }
    public static void nhapMang(int[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Cho biet gia tri a[" + i + "]:");
            a[i] = sc.nextInt();
        }
    }
    public static void xuatMang(int[] a) {
        for (int x : a) {
            System.out.print(x + " ");
        }
    }
    public static int tinhTong(int[] a) {
        int sum = 0;
        for (int x : a) {
            sum += x; 
        }
        return sum;
    }
    public static int demDuongLe(int[] a) {
        int dem_duong_le = 0;
        for (int x : a) {
            if (x > 0 && x % 2 != 0) {
                dem_duong_le++;
            }
        }
        return dem_duong_le;
    }
    public static int TimMax(int[] a) {
        int max = a[0];
        for (int x : a) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }
}
