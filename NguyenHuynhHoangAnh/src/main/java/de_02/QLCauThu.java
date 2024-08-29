package de_02;
import java.util.ArrayList;
public class QLCauThu {
    private ArrayList<CauThu> danhSachCauThu;
//a)Khoitaodscauthu
    public QLCauThu() {
        danhSachCauThu = new ArrayList<>();
        danhSachCauThu.add(new CauThu(01, "Nguyen Van Mot", 2000, 10000, 200, 50));
        danhSachCauThu.add(new CauThu(02, "Nguyen Van Hai", 2001, 11000, 300, 60));
        danhSachCauThu.add(new CauThu(03, "Nguyen Van Ba", 2002, 12000, 400, 70));
        danhSachCauThu.add(new CauThu(04, "Nguyen Van Bon", 2003, 13000, 500, 80));
        danhSachCauThu.add(new CauThu(05, "Nguyen Van Nam", 2004, 14000, 600, 90));
        danhSachCauThu.add(new CauThu(06, "Nguyen Van Sau", 2005, 15000, 700, 100));
        danhSachCauThu.add(new CauThu(07, "Nguyen Van Bay", 1999, 16000, 800, 110));
        danhSachCauThu.add(new CauThu(11, "Nguyen Van Tam", 1998, 17000, 900, 120));
        danhSachCauThu.add(new CauThu(12, "Nguyen Van Chin", 1997, 18000, 1000000, 130000));
        danhSachCauThu.add(new CauThu(13, "Nguyen Van Muoi", 1996, 19000, 1100000, 140000));
        danhSachCauThu.add(new CauThu(14, "Nguyen Van Muoi Mot", 1995, 20000, 1200000, 150000));
    }
    //b)Thêm mới cầu thủ
    public void themCauThu(CauThu cauThu) {
        for (CauThu ct : danhSachCauThu)
        {
            if (ct.getSoAo() == cauThu.getSoAo()) {
                System.out.println("So ao da ton tai.");
                return;
            }
        }
        danhSachCauThu.add(cauThu);
    }
//c)Xuất thông tin danh sách cầu thủ
    public void xuatThongTin() {
        double tongLuong = 0;
        for (CauThu ct : danhSachCauThu) {
            System.out.println(ct);
            tongLuong += ct.tinhLuongThucLanh();
        }
        System.out.println("Tong luong CLB phai tra: " + tongLuong);
    }
//d)Tìm kiếm các cầu thủ có lương thực lãnh thấp nhất.
    public void timCauThuLuongThapNhat() {
        if (danhSachCauThu.isEmpty()) return;

        double minLuong = danhSachCauThu.get(0).tinhLuongThucLanh();
        for (CauThu ct : danhSachCauThu) {
            if (ct.tinhLuongThucLanh() < minLuong) {
                minLuong = ct.tinhLuongThucLanh();
            }
        }

        for (CauThu ct : danhSachCauThu) {
            if (ct.tinhLuongThucLanh() == minLuong) {
                System.out.println(ct);
            }
        }
    }
}

