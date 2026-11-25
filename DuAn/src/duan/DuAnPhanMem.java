package duan;
public class DuAnPhanMem extends DuAn {
    private String congNgheChinh;
    private int soLuongDev;
    private double chiPhiLicense;

    public DuAnPhanMem(String maDuAn, String tenDuAn, double kinhPhi,
                       MyDate ngayBatDau, MyDate ngayKetThuc,
                       String congNgheChinh, int soLuongDev, double chiPhiLicense) {
        super(maDuAn, tenDuAn, kinhPhi, ngayBatDau, ngayKetThuc);
        setSoLuongDev(soLuongDev);
        setChiPhiLicense(chiPhiLicense);
        this.congNgheChinh = congNgheChinh;
    }

    public String getCongNgheChinh() {
        return congNgheChinh;
    }

    public void setCongNgheChinh(String congNgheChinh) {
        this.congNgheChinh = congNgheChinh;
    }

    public int getSoLuongDev() {
        return soLuongDev;
    }

    public void setSoLuongDev(int soLuongDev) {
        if (soLuongDev >= 0) {
            this.soLuongDev = soLuongDev;
        } else {
            throw new IllegalArgumentException("So luong lap trinh vien khong duoc am!");
        }
    }

    public double getChiPhiLicense() {
        return chiPhiLicense;
    }

    public void setChiPhiLicense(double chiPhiLicense) {
        if (chiPhiLicense >= 0) {
            this.chiPhiLicense = chiPhiLicense;
        } else {
            throw new IllegalArgumentException("Chi phi ban quyen khong duoc am!");
        }
    }

    @Override
    public double tinhTongChiPhi() {
        return getKinhPhi() + chiPhiLicense;
    }

    @Override
    public String toString() {
        return "DuAnPhanMem{" +
                "maDuAn='" + getMaDuAn() + '\'' +
                ", tenDuAn='" + getTenDuAn() + '\'' +
                ", kinhPhiCoBan=" + getKinhPhi() +
                ", chiPhiLicense=" + chiPhiLicense +
                ", tongChiPhi=" + tinhTongChiPhi() +
                ", congNgheChinh='" + congNgheChinh + '\'' +
                ", soLuongDev=" + soLuongDev +
                ", ngayBatDau=" + getNgayBatDau() +
                ", ngayKetThuc=" + getNgayKetThuc() +
                '}';
    }
}
