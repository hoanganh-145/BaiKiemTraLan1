package de_02;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        QLCauThu quanLy = new QLCauThu();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Them cau thu moi");
            System.out.println("2. Xuat thong tin danh sach cau thu");
            System.out.println("3. Tim cau thu co luong thap nhat");
            System.out.println("4. Sap xep danh sach theo luong giam dan");
            System.out.println("5. Tinh tuoi trung binh cua cau thu");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhap thong tin cau thu moi:");
                    System.out.print("So ao: ");
                    int soAo = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Ho ten: ");
                    String hoTen = scanner.nextLine();
                    System.out.print("Nam sinh: ");
                    int namSinh = scanner.nextInt();
                    System.out.print("Luong cung: ");
                    double luongCung = scanner.nextDouble();
                    System.out.print("Tien thuong: ");
                    double tienThuong = scanner.nextDouble();
                    System.out.print("Tien phat: ");
                    double tienPhat = scanner.nextDouble();

                    CauThu cauThuMoi = new CauThu(soAo, hoTen, namSinh, luongCung, tienThuong, tienPhat);
                    quanLy.themCauThu(cauThuMoi);
                    break;
                case 2:
                    quanLy.xuatThongTin();
                    break;
                case 3:
                    quanLy.timCauThuLuongThapNhat();
                    break;
//               case 4:
//                    quanLy.sapXepTheoLuong();
//                    quanLy.xuatThongTin();
//                    break;
//                case 5:
//                    System.out.println("Tuoi trung binh cua cac cau thu: " + quanLy.tinhTuoiTrungBinh());
//                    break;
                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}

