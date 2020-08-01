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
public class btvn2_3 {
    public static void main(String[] args) {
        //        Nhập vào 1 mảng 10 phần tử, những phần tử đều tự nhập từ bàn phím:
//in ra những phần tử ở vị trí chẵn trong mảng đó
//in ra những phần tử lở vị trí lẻ trong mảng
//in ra những phần tử chia hết cho 2
//in ra những phần tử chia cho 5 dư 1
//in ra tổng những phần tử chẵn của mảng
          Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Phan tu thu " + (i + 1) + " la:");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i = i + 2) {
            System.out.print(arr[i]);           
        }
        System.out.println(" ");
        for (int i = 1; i < 10; i = i+2) {
            System.out.print(arr[i]);           
        }
        System.out.println(" ");
        for (int i = 0; i < 10; i++) {
            if (arr[i]%2==0) {
                System.out.println(arr[i]);                
            }           
        }
        for (int i = 0; i < 10; i++) {
            if (arr[i]%5==1) {
                System.out.println(arr[i]);               
            }            
        }
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i]%2==0) {
            sum = sum + arr[i];          
            }
        }
         System.out.println("Tong cac so chan la: " + sum ); 
    }
}