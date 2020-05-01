// mengimpor Scanner ke program
import java.util.Scanner;

public class DataMahasiswa {

    public static void main(String[] args) {
        // deklarasi variabel
        String nama, alamat, jurusan;
        int semester;

        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        // Tampilkan output ke user
        System.out.println("### Pendataan Mahasiswa Politeknik Negeri Madiun ###");
        System.out.print("Nama : ");
        // menggunakan scanner dan menyimpan apa yang diketik di variabel nama
        nama = keyboard.nextLine();
        // Tampilkan outpu lagi
        System.out.print("Alamat: ");
        // menggunakan scanner lagi
        alamat = keyboard.nextLine();

        System.out.print("Jurusan: ");
        jurusan = keyboard.nextLine();

        System.out.print("Semester: ");
        semester = keyboard.nextInt();


        // Menampilkan apa yang sudah simpan di variabel
        System.out.println("--------------------");
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Semester: " + semester);
    }

}
