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
public class bai2 {
    public static void main(String[] args) {
       double toan,van,anh;
       double dtb;
       Scanner sc=new Scanner(System.in);
        System.out.print("diem mon toan:");
        toan=sc.nextDouble();
        System.out.print("diem mon van:");
        van=sc.nextDouble();
        System.out.print("diem mon anh:");
        anh=sc.nextDouble();
        dtb=(toan+van+anh)/3;
        String kq="";
        if(dtb<=4){
            kq="hoc luc yeu ";
        }else if(dtb<=6.5){
            kq="hoc luc trung binh  ";
        }else if(dtb<=8){
            kq="hoc luc kha ";
        }else{
            kq="hoc luc gioi ";
        }
        System.out.println("DTB:" + dtb +kq);
    }
}
