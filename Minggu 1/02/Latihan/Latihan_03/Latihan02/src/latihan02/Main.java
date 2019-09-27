package latihan02;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int NIM,loker;
        String nama,namabarang,jurusan;
        System.out.println("======================================================");
        System.out.println("               Input data penjualan                   ");
        System.out.println("======================================================");
        System.out.print("Id Mahasiswa : ");
        NIM = input.nextInt();
        nama = input.nextLine();
        System.out.print("Nama Mahasiswa : ");
        nama = input.nextLine();        
        System.out.print("Jurusan : ");
        jurusan = input.nextLine();
        System.out.print("No Loker : ");
        loker = input.nextInt();
        
    }
}
