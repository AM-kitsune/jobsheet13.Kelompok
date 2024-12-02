import java.util.Scanner;
public class jenengetakganti{
    

    public static void Tambahdataprestasi(){

    }
       

    public static void printoutawalan(){
        
    }
    public static void main(String[] args) {
        int[][] NIMDANTINGKATTAHUN = new int[32][2];//NIM ITU 0 SEDANGKAN TAHUN IKU 1 MAKDUSNYA NIMDANTINGKATTAHUN[x][0] itu NIM,sedangkan NIMDANTINGKATTAHUN[X][1] ITU TAHUN
        String[][]  NAMADANJENIS = new String[32][3];
        Scanner mlebu = new Scanner(System.in);
        int masukanmenu =0;

        for (int x=0;x<=32;x++){
        System.out.println("=== PENCATATAN DATA PRESTASI MAHASIGMA ===");
        System.out.println("1.Tambah data prestasi");
        System.out.println("2.Tampilkan semua prestasi");
        System.out.println("3.Analisis prestasi berdasarkan jenis");
        System.out.println("4.keluar");
        System.out.print("pilih menu :");
        masukanmenu = mlebu.nextInt();

        if(masukanmenu==1){
            System.out.println("Masukan Nama mahasiswa :");
            NAMADANJENIS[x][0] =mlebu.next();
            System.out.println("Masukan NIM mahasiswa :");
            NIMDANTINGKATTAHUN[x][0] =mlebu.nextInt();
            mlebu.nextLine();
            System.out.println("Masukan Jenis prestasi :");
            NAMADANJENIS[x][1] =mlebu.next();
            mlebu.nextLine();
            System.out.println("Masukan Tingkat prestasi(Lokal/Nasional/Internasional) :");
            NAMADANJENIS[x][2] =mlebu.nextLine();
            System.out.println("Data prestasi berhasil ditambahkan");
           //System.out.println(NAMADANJENIS);
            }
        else if(masukanmenu==2){
            

            }
        else if(masukanmenu==3){
            
            }
        else if(masukanmenu==4){
            System.out.print("Terimakasih");
            System.exit(0);
            }
        }
        }




    }
