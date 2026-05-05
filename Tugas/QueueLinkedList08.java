package Tugas;

public class QueueLinkedList08 {
    private NodeQueue08 head; // front of queue
    private NodeQueue08 tail; // back of queue
    private int size;
    private final int MAX_SIZE = 10; // kapasitas maksimum antrian

    public QueueLinkedList08() {
        head = null;
        tail = null;
        size = 0;
    }

    // untuk mengecek antrian kosong
    public boolean isEmpty() {
        return head == null;
    }

    // untuk mengecek antrian penuh
    public boolean isFull() {
        return size >= MAX_SIZE;
    }

    // Untuk mengosongkan antrian
    public void clear() {
        head = null;
        tail = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    // Menambahkan antrian (enqueue) - masuk dari belakang
    public void enqueue(MahasiswaQueue08 input) {
        if (isFull()) {
            System.out.println("Antrian penuh! Tidak dapat menambah antrian.");
            return;
        }
        NodeQueue08 newNode = new NodeQueue08(input, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        System.out.println("Mahasiswa " + input.nama + " berhasil ditambahkan ke antrian.");
    }

    // Memanggil antrian (dequeue) - keluar dari depan
    public MahasiswaQueue08 dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada mahasiswa yang dapat dipanggil.");
            return null;
        }
        MahasiswaQueue08 data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        System.out.println("Memanggil antrian: " + data.nama);
        return data;
    }

    // Menampilkan antrian terdepan (peek front)
    public void peekFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian terdepan:");
            head.data.tampilInformasi();
        }
    }

    // Menampilkan antrian paling akhir (peek rear)
    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian paling akhir:");
            tail.data.tampilInformasi();
        }
    }

    // Menampilkan jumlah mahasiswa yang masih mengantri
    public int jumlahAntrian() {
        return size;
    }

    // Menampilkan seluruh isi antrian
    public void tampilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("=== Daftar Antrian (" + size + " mahasiswa) ===");
            NodeQueue08 tmp = head;
            int no = 1;
            while (tmp != null) {
                System.out.print(no + ". ");
                tmp.data.tampilInformasi();
                tmp = tmp.next;
                no++;
            }
            System.out.println();
        }
    }
}