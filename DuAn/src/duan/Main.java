package duan;
public class Main {
    public static void main(String[] args) {
        DuAn pm = new DuAnPhanMem(
                "PM01",
                "He thong Quan ly Benh vien",
                300000000,
                new MyDate(2026, 2, 1),
                new MyDate(2026, 10, 30),
                "Java Spring Boot & React",
                8,
                45000000
        );

        DuAn xd = new DuAnXayDung(
                "XD01",
                "Khu Nha o Xa hoi Ha Noi",
                1200000000,
                new MyDate(2026, 3, 15),
                new MyDate(2027, 6, 30),
                "Dong Anh, Ha Noi",
                4500.0,
                550000000
        );

        DuAn[] danhSachDuAn = { pm, xd };

        for (DuAn da : danhSachDuAn) {
            System.out.println(da);
            System.out.println("-> Tong chi phi du kien: " + String.format("%,.0f", da.tinhTongChiPhi()) + " VND\n");
        }
    }
}
