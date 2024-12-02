import java.util.Scanner;

public class PrestasiMahasiswa {
    static String[][] prestasi = new String[10][5];
    static int jumlahPrestasi = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== PENCATATAN PRESTASI MAHASISWA ===");
            System.out.println("1. Tambah Data Prestasi");
            System.out.println("2. Tampilkan Semua Prestasi");
            System.out.println("3. Analisis Prestasi Berdasarkan Jenis");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            String pilihan = sc.nextLine();

            if (pilihan.equals("1")) {
                tambahPrestasi(sc);
            } else if (pilihan.equals("2")) {
                tampilkanPrestasi();
            } else if (pilihan.equals("3")) {
                analisisPrestasi(sc);
            } else if (pilihan.equals("4")) {
                System.out.println("Keluar dari program. Terima kasih!");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    static void tambahPrestasi(Scanner sc) {
        if (prestasi.length == 0) {
            System.out.println("Belum ada data prestasi.");
            return;
        }

        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = sc.nextLine();

        System.out.print("Masukkan NIM Mahasiswa: ");
        String nim = sc.nextLine();

        System.out.print("Masukkan Jenis Prestasi: ");
        String jenis = sc.nextLine();

        String tingkat;
        while (true) {
            System.out.print("Masukkan Tingkat Prestasi (Lokal/Nasional/Internasional): ");
            tingkat = sc.nextLine();
            if (tingkat.equalsIgnoreCase("Lokal") ||
                tingkat.equalsIgnoreCase("Nasional") ||
                tingkat.equalsIgnoreCase("Internasional")) {
                break;
            } else {
                System.out.println("Input tidak valid. Coba lagi.");
            }
        }

        int tahun = 0;
        while (true) {
            System.out.print("Masukkan Tahun Prestasi (2010 - 2024): ");
            if (sc.hasNextInt()) {
                tahun = sc.nextInt();
                sc.nextLine(); 
                if (tahun >= 2010 && tahun <= 2024) {
                    break;
                } else {
                    System.out.println("Tahun tidak valid. Coba lagi.");
                }
            } else {
                System.out.println("Input tahun harus berupa angka. Coba lagi.");
                sc.nextLine(); 
            }
        }

        prestasi[jumlahPrestasi][0] = nama;
        prestasi[jumlahPrestasi][1] = nim;
        prestasi[jumlahPrestasi][2] = jenis;
        prestasi[jumlahPrestasi][3] = tingkat;
        prestasi[jumlahPrestasi][4] = String.valueOf(tahun);
        jumlahPrestasi++;
        System.out.println("Data prestasi berhasil ditambahkan.");
    }

    static void tampilkanPrestasi() {
        System.out.println("\n=== DAFTAR SEMUA PRESTASI ===");
        if (jumlahPrestasi == 0) {
            System.out.println("Belum ada data prestasi.");
        } else {
            for (int i = 0; i < jumlahPrestasi; i++) {
                System.out.println("Nama: " + prestasi[i][0] + " | NIM: " + prestasi[i][1] + " | Jenis" + prestasi[i][2] + " | Tingkat: " + prestasi[i][3] + " | Tahun: " + prestasi[i][4]);
            }
        }
    }

    static void analisisPrestasi(Scanner sc) {
        System.out.print("\nMasukkan Jenis Prestasi yang akan dianalisis: ");
        String jenisCari = sc.nextLine();

        System.out.println("\n=== ANALISIS PRESTASI ===");
        for (int i = 0; i < jumlahPrestasi; i++) {
            if (prestasi[i][2].equalsIgnoreCase(jenisCari)) {
                System.out.println("Nama: " + prestasi[i][0] + " | NIM: " + prestasi[i][1] + " | Tingkat: " + prestasi[i][3] + " | Tahun: " + prestasi[i][4]);
            }
        }
    }
}
