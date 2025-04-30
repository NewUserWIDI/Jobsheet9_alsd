public class Mahasiswa25 {
    String nama;
    String nim;
    String kelas;
    int nilai;

    public Mahasiswa25(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }

    public void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }

    public void tampil() {
        System.out.println("Nama   : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("Nilai : " + nilai);
    }
}