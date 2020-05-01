import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataAkun {

    public static void main(String[] args) throws IOException {

        String namaAkun;

        // Membuat objek inputstream
        InputStreamReader isr = new InputStreamReader(System.in);

        // membuat objek bufferreader
        BufferedReader br = new BufferedReader(isr);

        // Mengisi varibel nama dengan Bufferreader
        System.out.print("Inputkan nama akun: ");
        namaAkun = br.readLine();

        // tampilkan output isi variabel nama
        System.out.println("Nama Akun : " + namaAkun);

    }

}