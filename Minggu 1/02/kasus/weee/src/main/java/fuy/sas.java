package fuy;
import java.util.Scanner;
public class sas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //var temporary
        int tempNoId = 0;
        String tempNama = "";
        String tempAlamat = "";
        int tempKodeBarang = 0;
                
        int tempHarga = 0;
        String tempNamaBarang = "";
        int tempKodeTransaksi = 0;
        int tempBanyak = 0;

        //Proses menerima masukan
        System.out.println("======================================================");
        System.out.println("               Input data penjualan                   ");
        System.out.println("======================================================");
        System.out.println("Id Pelanggan : ");
        tempNoId = sc.nextInt();
        
        sc.nextLine();
        System.out.println("Nama Pelanggan : ");
        tempNama = sc.nextLine();

        System.out.println("Alamat Pelanggan : ");
        tempAlamat = sc.nextLine();
        
        System.out.println("\nKode Barang : ");
        tempKodeBarang = sc.nextInt();
        
        tempNamaBarang = sc.nextLine();
        System.out.println("Nama Barang : ");
        tempNamaBarang = sc.nextLine();

        System.out.println("Harga Barang : ");
        tempHarga = sc.nextInt();

        System.out.println("\nKode Transaksi : ");
        tempKodeTransaksi = sc.nextInt();

        System.out.println("Banyak Barang : ");
        tempBanyak = sc.nextInt();

        //1
        
        Transaksi t = new Transaksi(tempNoId, tempNama, tempAlamat);
        t.setBarang(tempKodeBarang, tempNamaBarang, tempHarga);
        t.setTransaksi(tempKodeTransaksi, tempBanyak);

        //output hasil masukan dan mengeluarkan total belanja
        t.cetakStruk();
    }
}