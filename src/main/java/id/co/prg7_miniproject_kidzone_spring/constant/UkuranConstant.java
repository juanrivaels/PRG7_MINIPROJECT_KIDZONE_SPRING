package id.co.prg7_miniproject_kidzone_spring.constant;

public class UkuranConstant {
    public static final String mDuplicateUkuran = "Ukuran sudah ada";
    public static final String mNotFound = "Ukuran tidak ditemukan";
    public static final String mEmptyData = "Tidak ada data";
    public static final String mCreateSuccess = "Berhasil membuat ukuran!";
    public static final String mCreateFailed = "Gagal membuat ukuran!";
    public static final String mUpdateSuccess = "Berhasil memperbarui ukuran!";
    public static final String mUpdateFailed = "Gagal memperbarui ukuran!";
    public static final String mDeleteSuccess = "Berhasil menghapus ukuran!";
    public static final String mDeleteFailed = "Gagal menghapus ukuran!";
    public static final String qAllDataActive = "SELECT * FROM ms_ukuran WHERE ukr_status = ?1";
}
