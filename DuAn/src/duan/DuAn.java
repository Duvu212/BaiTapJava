package duan;
public class DuAn {
    private String maDuAn;
    private String tenDuAn;
    private double kinhPhi;
    private MyDate ngayBatDau;
    private MyDate ngayKetThuc;

    public DuAn(String maDuAn, String tenDuAn, double kinhPhi, MyDate ngayBatDau, MyDate ngayKetThuc) {
        if (kinhPhi < 0) {
            throw new IllegalArgumentException("Kinh phi khong duoc am!");
        }
        if (!kiemTraThoiGian(ngayBatDau, ngayKetThuc)) {
            throw new IllegalArgumentException("Ngay ket thuc phai sau hoac bang ngay bat dau!");
        }
        this.maDuAn = maDuAn;
        this.tenDuAn = tenDuAn;
        this.kinhPhi = kinhPhi;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getMaDuAn() {
        return maDuAn;
    }

    public void setMaDuAn(String maDuAn) {
        this.maDuAn = maDuAn;
    }

    public String getTenDuAn() {
        return tenDuAn;
    }

    public void setTenDuAn(String tenDuAn) {
        this.tenDuAn = tenDuAn;
    }

    public double getKinhPhi() {
        return kinhPhi;
    }

    public void setKinhPhi(double kinhPhi) {
        if (kinhPhi >= 0) {
            this.kinhPhi = kinhPhi;
        } else {
            throw new IllegalArgumentException("Kinh phi khong duoc am!");
        }
    }

    public MyDate getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(MyDate ngayBatDau) {
        if (kiemTraThoiGian(ngayBatDau, this.ngayKetThuc)) {
            this.ngayBatDau = ngayBatDau;
        } else {
            throw new IllegalArgumentException("Ngay bat dau khong duoc lon hon ngay ket thuc!");
        }
    }

    public MyDate getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(MyDate ngayKetThuc) {
        if (kiemTraThoiGian(this.ngayBatDau, ngayKetThuc)) {
            this.ngayKetThuc = ngayKetThuc;
        } else {
            throw new IllegalArgumentException("Ngay ket thuc khong duoc nho hon ngay bat dau!");
        }
    }

    protected boolean kiemTraThoiGian(MyDate batDau, MyDate ketThuc) {
        if (batDau == null || ketThuc == null) {
            return false;
        }
        return batDau.compareTo(ketThuc) <= 0;
    }

    public double tinhTongChiPhi() {
        return kinhPhi;
    }

    @Override
    public String toString() {
        return "DuAn{" +
                "maDuAn='" + maDuAn + '\'' +
                ", tenDuAn='" + tenDuAn + '\'' +
                ", kinhPhi=" + kinhPhi +
                ", ngayBatDau=" + ngayBatDau +
                ", ngayKetThuc=" + ngayKetThuc +
                '}';
    }
}
