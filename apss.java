
import java.util.Scanner;
public class apss {
    public static void main(String[] args) throws Exception {
        Scanner masukan = new Scanner (System.in);

        int jam_kerja,total,total2,total3,total4,total5;
        
        System.out.println("==============>Program Hitung Gaji Perminggu<============== \n");
        System.out.println("Keterangan Perhitungan Gaji : \n");
        System.out.println("Jika Gaji Di Bawah 50 Jam/Minggu Maka Ada Potongan Sebesar 2500/Jam");
        System.out.println("Jika Gaji Di Antara 50 Jam/Minggu Dan 60/Minggu Maka Hitungannya  5000/Jam");
        System.out.println("Jika Gaji Di Atas 60 Jam/Minggu Maka Mendapatkan Bonus 2500/Jam Jadi 7500/Jam \n");
        System.out.print("Jam Kerja Kamu : ");
        jam_kerja = masukan.nextInt();
        total = (jam_kerja - 50) * 2500;
        total5 = (jam_kerja * 5000) + total;
        total3 = (jam_kerja * 5000);
        total4 = (jam_kerja - 60) * 2500;
        total2 = (jam_kerja * 5000) + total4;
        if(jam_kerja < 50){
            /*Jika Nilainya Kurang Dari 50*/
            System.out.println("Gaji Kamu      : Rp. " + total5 + "\n");
        } else if(jam_kerja == 50 || jam_kerja <= 60) {
            /*Jika Jam Kerja Nilainya 50 Atau Jam Kerja Nilainya Kurang Dari 60*/
            System.out.println("Gaji Kamu      : Rp. " + total3 + "\n"); 
        } else if(jam_kerja == 60 || jam_kerja <= 70){
            /*Jika Jam Kerja Nilainya Lebih Dari Sama Dengan 60*/
            System.out.println("Gaji Kamu      : Rp.  " + total2 + "\n"); 
        }
        else{
            System.out.println("Strees Deck Terlalu Mengejar Duniawi"); 
        }
        System.out.println("==============>Akhir Program Hitung Gaji Perminggu<============== \n");
    }
}
