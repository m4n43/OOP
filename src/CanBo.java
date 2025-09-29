package src;

class CanBo {
    protected String hoTen;
    protected int namSinh;
    protected String gioiTinh;
    protected String diaChi;
    protected double heSoLuong;
    
    public CanBo() {
        
    }

    public CanBo(String hoTen, int namSinh, String gioiTinh, String diaChi, double heSoLuong) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.heSoLuong = heSoLuong;
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

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double tinhLuong() {
        return 0;
    }

    public void hienThi() {
        System.out.println("Ho ten: "+hoTen);
        System.out.println("Nam sinh: "+namSinh);
        System.out.println("Gioi tinh: "+gioiTinh);
        System.out.println("Dia chi: "+diaChi);
        System.out.println("He so luong: "+heSoLuong);
    }
}
