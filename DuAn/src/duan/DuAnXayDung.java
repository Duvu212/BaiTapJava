package duan;
public class DuAnXayDung extends DuAn {
    private String diaDiemThiCong;
    private double dienTichM2;
    private double phiVatLieu;

    public DuAnXayDung(String maDuAn, String tenDuAn, double kinhPhi,
                        MyDate ngayBatDau, MyDate ngayKetThuc,
                        String diaDiemThiCong, double dienTichM2, double phiVatLieu) {
        super(maDuAn, tenDuAn, kinhPhi, ngayBatDau, ngayKetThuc);
        setDienTichM2(dienTichM2);
        setPhiVatLieu(phiVatLieu);
        this.diaDiemThiCong = diaDiemThiCong;
    }

    public String getDiaDiemThiCong() {
        return diaDiemThiCong;
    }

    public void setDiaDiemThiCong(String diaDiemThiCong) {
        this.diaDiemThiCong = diaDiemThiCong;
    }

    public double getDienTichM2() {
        return dienTichM2;
    }

    public void setDienTichM2(double dienTichM2) {
        if (dienTichM2 > 0) {
            this.dienTichM2 = dienTichM2;
        } else {
            throw new IllegalArgumentException("Dien tich phai lon hon 0!");
        }
    }

    public double getPhiVatLieu() {
        return phiVatLieu;
    }

    public void setPhiVatLieu(double phiVatLieu) {
        if (phiVatLieu >= 0) {
            this.phiVatLieu = phiVatLieu;
        } else {
            throw new IllegalArgumentException("Phi vat lieu khong duoc am!");
        }
    }

    @Override
    public double tinhTongChiPhi() {
        return getKinhPhi() + phiVatLieu;
    }

    @Override
    public String toString() {
        return "DuAnXayDung{" +
                "maDuAn='" + getMaDuAn() + '\'' +
                ", tenDuAn='" + getTenDuAn() + '\'' +
                ", kinhPhiCoBan=" + getKinhPhi() +
                ", phiVatLieu=" + phiVatLieu +
                ", tongChiPhi=" + tinhTongChiPhi() +
                ", diaDiemThiCong='" + diaDiemThiCong + '\'' +
                ", dienTichM2=" + dienTichM2 +
                ", ngayBatDau=" + getNgayBatDau() +
                ", ngayKetThuc=" + getNgayKetThuc() +
                '}';
    }
}
