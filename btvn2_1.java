/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn;
import java.util.Scanner;


/**
 *
 * @author HCT
 */
public class btvn2_1 {
    public static void main(String[] args) {
         //B1: Yeu cau nguoi dung nhap vao 1 so nguyen duong n
        // B2: Tao ra 1 mang int co do dai = so nguyen duong nguoi dung nhap
        // B3: Yeu cau nguoi dung nhap vao n lan so tu nhien
        // B4: In ra: 
        // tat ca cac phan tu cua mang 
        // tong cac phan tu trong mang do
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so n: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + (i+1) + ":");
            arr [i] = sc.nextInt();   
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]); 
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
            System.out.println("Tong la: " + sum);
    }
}
