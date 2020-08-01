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
public class btvn2_2 {
    public static void main(String[] args) {
        //        Yêu cầu người dùng nhập vào 1 mảng số nguyên dương 1 chiều độ dài tùy ý
//        Chuyển mọi phần tử có giá trị lẻ trong mảng thành -1
//        In ra phần tử lớn nhất của mảng
//        Chuyển phần tử nhỏ nhất trong mảng thành -1
//        Nhập vào 1 số tự nhiên x, In ra mọi phần tử nhỏ hơn x ở trong mảng
//        Nhập vào 1 số tự nhiên x , in ra phần tử có giá trị gần với giá trị của x nhất ở trong mảng
//        Kiểm tra sự đối xứng của mảng , vd: 1 2 3 2 1 là 1 mảng đối xứng
          Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 1) {
                arr[i] = -1;
            }
        }
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (max < arr[i + 1]) {
                max = arr[i + 1];
            }
        }
        System.out.println("so lon nhat la " + max);
        
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (min > arr[i + 1]) {
                min = arr[i + 1];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i]==min) {
               arr[i]=-1; 
            }
        }
        int x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] < x) {
                System.out.println(arr[i]);
            }
        }
        boolean bool = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == arr[n - 1 - i]) {
                bool = true;
            } else {
                bool = false;
            }
            if (bool = true) {
                System.out.println("Day doi xung");
            } else {
                System.out.println("Day khong doi xung");
            }  
    }
    }
}
