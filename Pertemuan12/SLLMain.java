package Pertemuan12;

import java.util.Scanner;

public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList08 sll = new SingleLinkedList08();

        Mahasiswa08 mhs1 = new Mahasiswa08("210001", "Dirga", "Sistem Informasi", "SI-1");
        Mahasiswa08 mhs2 = new Mahasiswa08("210002", "Bimon", "Sistem Informasi", "SI-1");
        Mahasiswa08 mhs3 = new Mahasiswa08("210003", "Rizky", "Sistem Informasi", "SI-1");
        Mahasiswa08 mhs4 = new Mahasiswa08("210004", "Dina", "Sistem Informasi", "SI-1");
       
        // PRAKTIKUM 2.1 
        sll.print();                        // Linked list kosong

        sll.addFirst(mhs4);
        sll.print();

        sll.addLast(mhs1);
        sll.print();

        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        // PRAKTIKUM 2.2 
        System.out.println("data index 1 : ");
        sll.getData(1);
        System.out.println();

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();

        sll.removeAt(0);
        sll.print();

        // Memodifikasi: Input dari Keyboard (Pertanyaan 2.1 no.3) 
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Tambah Data dari Keyboard ===");
        System.out.print("NIM    : "); String nim   = sc.nextLine();
        System.out.print("Nama   : "); String nama  = sc.nextLine();
        System.out.print("Prodi  : "); String prodi = sc.nextLine();
        System.out.print("Kelas  : "); String kelas = sc.nextLine();

        Mahasiswa08 mhsBaru = new Mahasiswa08(nim, nama, prodi, kelas);
        sll.addLast(mhsBaru);
        sll.print();
        sc.close();
    }
}