package view;

import model.Penyewaan;
//[SRP] satu tanggung jawab: format tampilan struk sewa.
public interface StrukView {
        void cetak(Penyewaan p);
}
