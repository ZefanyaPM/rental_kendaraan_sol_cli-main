package view;

import java.util.List;
import model.Kendaraan;
import model.Penyewaan;

//[SRP] Satu tanggung jawab: interaksi teks dengan pengguna
//dengan hanya menampilkan menu/daftar dan membaca input, tidak ada logika bisnis. 
public interface RentalView {
        String tampilMenu();
        void tampilDaftarKendaraan(List<Kendaraan> daftar);
        void tampilRiwayat(List<Penyewaan> daftar);
        String bacaTeks(String label);
        long bacaAngka(String label);
        void tampilPesan(String pesan);
        boolean konfirmasiUangJaminan(long nominal);
}
