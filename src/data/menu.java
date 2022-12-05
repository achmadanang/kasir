package data;
import java.util.Scanner;

public class menu {
    Scanner input = new Scanner(System.in);
    data_barang dataBarang = new data_barang();

    public void menu(){
        String pilih;
        do {
            System.out.println("""          
                    1. Tambah Barang
                    2. Tampilkan Semua Barang
                    3. Edit Nama Barang
                    4. Hapus
                    5. Keluar""");
            System.out.print("INPUT : ");
            pilih = input.nextLine();

            switch (pilih) {
                case "1" -> dataBarang.tambahBarang();
                case "2" -> dataBarang.view();
                case "3" -> dataBarang.update();
                case "4" -> dataBarang.delete();
                case "5" -> dataBarang.exit();
                default -> dataBarang.warning();
            }
        }while(!pilih.equals("5"));
    }
}
