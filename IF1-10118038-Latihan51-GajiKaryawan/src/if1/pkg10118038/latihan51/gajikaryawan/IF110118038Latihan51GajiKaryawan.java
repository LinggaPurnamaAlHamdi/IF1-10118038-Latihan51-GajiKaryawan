/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118038.latihan51.gajikaryawan;
import java.util.Scanner;
/**
 *
 * @author Lingga
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 * Deskripsi Program : program ini berisi program yang akan menampilkan Gaji Karyawan 
 */
public class IF110118038Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager();
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK  : ");manager.setNik(sc.next());
        sc.nextLine();
        System.out.print("Masukkan Nama : ");
        manager.setNama(sc.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : ");manager.setGolongan(sc.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");manager.setJabatan(sc.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");manager.setKehadiran(sc.nextInt());
        System.out.println("\n====Hasil Perhitungan====");
        System.out.println("NIK  : "+manager.getNik());
        System.out.println("NAMA : "+manager.getNama());
        System.out.println("GOLONGAN : "+manager.getGolongan());
        System.out.println("JABATAN  : "+manager.getJabatan()+"\n");
        System.out.println("TUNJANGAN GOLONGAN  : "+manager.tunjanganGolongan(manager.getGolongan()));
        System.out.println("TUNJANGAN JABATAN   : "+manager.tunjanganJabatan(manager.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN : "+manager.tunjanganKehadiran(manager.getKehadiran())+"\n");
        System.out.println("GAJI TOTAL : "+manager.gajiTotal());
    }
        
 }
    
