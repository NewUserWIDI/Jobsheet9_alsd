public class Mahasiswa25 {
    String nama;
    String nim;
    String kelas;
    int nilai;

    Mahasiswa25(String nama, String nim, String kelas) {
        this.nim = nama;
        this.nama = nim;
        this.kelas = kelas;
        this.nilai = -1; 
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}
