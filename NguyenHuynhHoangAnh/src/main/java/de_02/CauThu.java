package de_02;
public class CauThu {
    private int soAo;
    private String hoTen;
    private int namSinh;
    private double luongCung;
    private double tienThuong;
    private double tienPhat;


    public CauThu(int soAo, String hoTen, int namSinh, double luongCung, double tienThuong, double tienPhat) {
        this.soAo = soAo;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.luongCung = luongCung;
        this.tienThuong = tienThuong;
        this.tienPhat = tienPhat;
    }

    public int getSoAo() {
        return soAo;
    }

    public void setSoAo(int soAo) {
        this.soAo = soAo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }

    public double getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(double tienThuong) {
        this.tienThuong = tienThuong;
    }

    public double getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(double tienPhat) {
        this.tienPhat = tienPhat;
    }


    public double tinhLuongThucLanh() {
        return luongCung + tienThuong - tienPhat;
    }

    @Override
    public String toString() {
        return "CauThu [soAo=" + soAo + ", hoTen=" + hoTen + ", namSinh=" + namSinh + ", luongCung=" + luongCung
                + ", tienThuong=" + tienThuong + ", tienPhat=" + tienPhat + ", luongThucLanh=" + tinhLuongThucLanh() + "]";
    }
}

