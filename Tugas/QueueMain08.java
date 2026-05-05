package Tugas;

import java.util.Scanner;

public class QueueMain08 {
    static Scanner sc = new Scanner(System.in);
    static QueueLinkedList08 queue = new QueueLinkedList08();

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("========================================");
            System.out.println("  MENU LAYANAN KEMAHASISWAAN");
            System.out.println("========================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian (Dequeue)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Paling Akhir");
            System.out.println("6. Cek Antrian Kosong");
            System.out.println("7. Cek Antrian Penuh");
            System.out.println("8. Jumlah Mahasiswa Mengantri");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = Integer.parseInt(sc.nextLine());
            System.out.println();

            switch (pilihan) {
                case 1:
                    daftarMahasiswa();
                    break;
                case 2:
                    MahasiswaQueue08 dipanggil = queue.dequeue();
                    if (dipanggil != null) {
                        System.out.println("Data mahasiswa yang dipanggil:");
                        dipanggil.tampilInformasi();
                    }
                    break;
                case 3:
                    queue.tampilAntrian();
                    break;
                case 4:
                    queue.peekFront();
                    break;
                case 5:
                    queue.peekRear();
                    break;
                case 6:
                    System.out.println("Antrian kosong: " + queue.isEmpty());
                    break;
                case 7:
                    System.out.println("Antrian penuh: " + queue.isFull());
                    break;
                case 8:
                    System.out.println("Jumlah mahasiswa mengantri: " + queue.jumlahAntrian());
                    break;
                case 9:
                    queue.clear();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
            System.out.println();
        } while (pilihan != 0);

        sc.close();
    }

    static void daftarMahasiswa() {
        System.out.println("--- Pendaftaran Antrian ---");
        System.out.print("NIM    : "); String nim   = sc.nextLine();
        System.out.print("Nama   : "); String nama  = sc.nextLine();
        System.out.print("Kelas  : "); String kelas = sc.nextLine();
        System.out.print("IPK    : "); double ipk   = Double.parseDouble(sc.nextLine());
        queue.enqueue(new MahasiswaQueue08(nim, nama, kelas, ipk));
    }
}