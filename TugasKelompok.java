import java.util.Scanner;

public class TugasKelompok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] prestasi = new String[10][5]; 
        int jumlahPrestasi = 0;
        int tahunSekarang =  2024;

        while (true) {
            System.out.println("\n=== Sistem Akademik Prestasi Mahasiswa ===");
            System.out.println("1. Tambah Prestasi Mahasiswa");
            System.out.println("2. Tampilkan Semua Prestasi");
            System.out.println("3. Analisis Prestasi Berdasarkan Jenis dan Tahun");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            String pilihan = scanner.nextLine();

            if (pilihan.equals("1")) {
                System.out.println("\n=== Tambah Prestasi Mahasiswa ===");

                if (jumlahPrestasi == prestasi.length) {
            
                    String[][] prestasiBaru = new String[prestasi.length * 2][5];
                    for (int i = 0; i < prestasi.length; i++) {
                        for (int j = 0; j < prestasi[i].length; j++) {
                            prestasiBaru[i][j] = prestasi[i][j];
                        }
                    }
                    prestasi = prestasiBaru;
                }

                System.out.print("Masukkan Nama Mahasiswa: ");
                String nama = scanner.nextLine();

                System.out.print("Masukkan NIM Mahasiswa: ");
                String nim = scanner.nextLine();

                System.out.print("Masukkan Jenis Prestasi (misalnya Juara 1, Juara Harapan, dll): ");
                String jenis = scanner.nextLine();

                String tingkat;
                while (true) {
                    System.out.print("Masukkan Tingkat Prestasi (Lokal, Nasional, Internasional): ");
                    tingkat = scanner.nextLine();
                    if (tingkat.equalsIgnoreCase("Lokal") || 
                        tingkat.equalsIgnoreCase("Nasional") || 
                        tingkat.equalsIgnoreCase("Internasional")) {
                        break;
                    } else {
                        System.out.println("Tingkat prestasi hanya boleh 'Lokal', 'Nasional', atau 'Internasional'.");
                    }
                }

                int tahun;
                while (true) {
                    System.out.print("Masukkan Tahun Prestasi (2010-" + tahunSekarang + "): ");
                    try {
                        tahun = Integer.parseInt(scanner.nextLine());
                        if (tahun >= 2010 && tahun <= tahunSekarang) {
                            break;
                        } else {
                            System.out.println("Tahun harus antara 2010 hingga " + tahunSekarang + ".");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Harap masukkan angka yang valid.");
                    }
                }

             
                prestasi[jumlahPrestasi][0] = nama;
                prestasi[jumlahPrestasi][1] = nim;
                prestasi[jumlahPrestasi][2] = jenis;
                prestasi[jumlahPrestasi][3] = tingkat;
                prestasi[jumlahPrestasi][4] = String.valueOf(tahun);
                jumlahPrestasi++;

                System.out.println("Prestasi berhasil ditambahkan!");

            } else if (pilihan.equals("2")) {
                System.out.println("\n=== Daftar Prestasi Mahasiswa ===");
                if (jumlahPrestasi == 0) {
                    System.out.println("Belum ada prestasi yang dicatat.");
                } else {
                    for (int i = 0; i < jumlahPrestasi; i++) {
                        System.out.printf("%d. Nama: %s, NIM: %s, Jenis: %s, Tingkat: %s, Tahun: %s\n",
                                i + 1, prestasi[i][0], prestasi[i][1], prestasi[i][2], prestasi[i][3], prestasi[i][4]);
                    }
                }

            } else if (pilihan.equals("3")) {
                System.out.println("\n=== Analisis Prestasi Berdasarkan Jenis dan Tahun ===");
                if (jumlahPrestasi == 0) {
                    System.out.println("Belum ada prestasi yang dicatat.");
                    continue;
                }

                System.out.print("Masukkan Jenis Prestasi yang akan dianalisis: ");
                String jenisCari = scanner.nextLine();

                int tahunCari=2024;
                while (true) {
                    System.out.print("Masukkan Tahun Prestasi yang akan dianalisis: ");
                    tahunCari = scanner.nextInt();
                    if(tahunCari >=2010 && tahunCari<=2024){
                        break;
                    }
                }
                


                boolean ditemukan = false;

                for (int i = 0; i < jumlahPrestasi; i++) {
                    if (prestasi[i][2].equalsIgnoreCase(jenisCari) && 
                        Integer.parseInt(prestasi[i][4]) == tahunCari) {
                        ditemukan = true;
                        System.out.printf("Nama: %s, NIM: %s, Tingkat: %s, Tahun: %s\n",
                                prestasi[i][0], prestasi[i][1], prestasi[i][3], prestasi[i][4]);
                    }
                }

                if (!ditemukan) {
                    System.out.println("Tidak ditemukan prestasi dengan jenis '" + jenisCari + "' pada tahun " + tahunCari + ".");
                }

            } else if (pilihan.equals("4")) {
                System.out.println("Keluar dari program. Terima kasih!");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
