package Tugas;

public class MahasiswaQueue08 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public MahasiswaQueue08() {}

    public MahasiswaQueue08(String nim, String nama, String kelas, double ipk) {
        this.nim   = nim;
        this.nama  = nama;
        this.kelas = kelas;
        this.ipk   = ipk;
    }

    public void tampilInformasi() {
        System.out.printf("%-15s %-12s %-5s %.1f%n", nama, nim, kelas, ipk);
    }
}