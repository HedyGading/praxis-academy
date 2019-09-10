package Latiiih;

//Interface digunakan saat parent tidak memiliki apa-apa, hanya metode,
//namun metode tersebut harus di implementasikan[harus ada] pada kelas child.
//contoh class interface :

public interface Barang {
        //method interface
        public void setBarang(int kodeBarang, String namaBarang, float harga);
}