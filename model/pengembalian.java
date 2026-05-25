package model;

import java.time.LocalDate;

// class pengembalian
public class pengembalian {
    private String namaPeminjam;
    private int NIMPeminjam;
    private String namaBarang;
    private String kodeBarang;
    private int jumlahPinjam;
    private LocalDate tanggalPinjam;
    private LocalDate tanggalKembali;
    private String kondisiBarang;

    // constructor
    public pengembalian(String namaPeminjam, int NIMPeminjam, String namaBarang, String kodeBarang, int jumlahPinjam, LocalDate tanggalPinjam, LocalDate tanggalKembali, String kondisiBarang) {
        // parameter
        this.namaPeminjam = namaPeminjam;
        this.NIMPeminjam = NIMPeminjam;
        this.namaBarang = namaBarang;
        this.kodeBarang = kodeBarang;
        this.jumlahPinjam = jumlahPinjam;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
        this.kondisiBarang = kondisiBarang;
    }

    // getter
    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    public int getNIMPeminjam() {
        return NIMPeminjam;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public int getJumlahPinjam() {
        return jumlahPinjam;
    }

    public LocalDate getTanggalPinjam() {
        return tanggalPinjam;
    }

    public LocalDate getTanggalKembali() {
        return tanggalKembali;
    }

    public String getKondisiBarang() {
        return kondisiBarang;
    }
    
}
