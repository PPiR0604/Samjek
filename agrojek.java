//author
//M. Fahrezel Ravie Iskandar 235150200111026
//M. Naufal Al Farizki 235150207111032
//Muzhaffar Ammar 235150200111033
package pemdas;

import java.util.Scanner;

public class agrojek {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int menu = 1;
        while (menu != 0) {
            int kendaraan, jarak, metode, berat, total = 0, diskon = 0;
            System.out.println("========================================");
            System.out.println("Menu pelayanan :");
            System.out.println("1. Samjek");
            System.out.println("2. Samsend");
            System.out.println("3. Masukkan nama driver");
            System.out.println("0. Keluar");
            System.out.print("Pilihan anda : ");
            menu = input.nextInt();
            input.nextLine();
            System.out.println("========================================");
            if (menu == 1) {
                System.out.printf("Pilih kendaraan\t:\n(1)mobil\n(2)motor\nPilihan anda : ");
                kendaraan = input.nextInt();
                System.out.print("Berapa jarak yang ditempuh : ");
                jarak = input.nextInt();
                if (kendaraan == 1) {
                    if (jarak <= 2) {
                        total = 25000;
                    }
                    if (jarak <= 5 && jarak > 2) {
                        total = 40000;
                    }
                    if (jarak <= 10 && jarak > 5) {
                        total = 65000;
                    }
                    if (jarak > 10) {
                        total = jarak * 15000;
                    }
                } else {
                    if (jarak <= 2) {
                        total = 15000;
                    }
                    if (jarak <= 5 && jarak > 2) {
                        total = 20000;
                    }
                    if (jarak <= 10 && jarak > 5) {
                        total = 30000;
                    }
                    if (jarak > 10) {
                        total = jarak * 8000;
                    }
                }
                System.out.println("========================================");
            }
            if (menu == 2) {
                System.out.print("Berapa jarak pengiriman : ");
                jarak = input.nextInt();
                System.out.print("Berapa berat benda : ");
                berat = input.nextInt();
                total = jarak * berat * 1000;
                System.out.println("========================================");
            }
            if (menu == 3) {
                System.out.println("Berapa banyak driver yang ingin anda input? ");
                int d = input.nextInt();
                input.nextLine();
                String[] nama = new String[d];
                for (int i = 0; i < d; i++) {
                    System.out.printf("Masukkan nama driver ke-%d: ", i+1);
                    nama[i] = input.nextLine();
                }
                System.out.println("========================================");
                System.out.print("Nama-nama drivernya adalah : ");
                for (int j = 0; j < nama.length; j++) {
                    System.out.print(nama[j] + ", ");
                }
                System.out.println();
            }
            if (menu > 3) {
                System.out.println("Pilihan anda tidak ada!");

            }

            if (menu == 0) {
                System.out.println("Sampai jumpa lagi!");
                break;
            }

            if (total != 0) {
                System.out.println("total ongkos yang harus dibayar adalah Rp" + total);
                System.out.printf("Pilih metode pembayaran\t:\n(1)Sampay\n(2)Ova\n(3)tunai\n");
                metode = input.nextInt();
                System.out.println("========================================");
                if (metode == 1) {
                    diskon = 10;
                }
                if (metode == 2) {
                    diskon = 5;
                }
                diskon = total * diskon / 100;
                total = total - diskon;
                System.out.println("anda mendapatkan diskon sebesar Rp" + diskon);
                System.out.println("total pembayaran Rp" + total);
                System.out.println("========================================");
            }
        }
    }

}
