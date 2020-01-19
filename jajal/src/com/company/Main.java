package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
// array
//        int[] bil = {6,5,9,10,22,3,4};

        int[] bil = new int[8];
        int k = 1;
        for (int i=0;i < 8;i++) {
            bil[i] = (3 * k) + 2;
            k++;
        }
        int nilaiTertingi = bil[0];

//menampilkan array
        System.out.print("array yang di tampilkan : ");
        int total = 0;
        for (int i = 0; i < bil.length; i++) {
            total = total + bil[i];
            System.out.print(bil[i] + ",");

        }
        System.out.println(" ");
//   rata-rata
        int rerata = total / bil.length;
        System.out.println("rata-rata = " + rerata);
//        nilai tertinggi
        for (int i = 0; i < bil.length; i++) {
            if (nilaiTertingi < bil[i]) {
                nilaiTertingi = bil[i];
            }
        }
        System.out.println("Nilai tertingginya : " + nilaiTertingi);


//pengurutan terbesar ke terkecil
        pengurutan(bil);
            for (int a = 0; a < bil.length; a++) {
                System.out.print(bil[a] + " ");
            }
        }

//    pengurutan
    public static void pengurutan(int[]angka){
        for(int i = 0; i < angka.length; i++){
            for(int j = angka.length-1; j>i; j--){
                if(angka[j]>angka[j-1]){
                    int tempat= angka [j];
                    angka[j]=angka[j-1];
                    angka[j-1] = tempat;
                }
            }
        }

    }

}
