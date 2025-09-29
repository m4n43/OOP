package src;

class NhanVien extends CanBo {
    private String nganhDaoTao;
    public static final double LUONG_CO_BAN = 2000000;

    public NhanVien(String hoTen, int namSinh, String gioiTinh, String diaChi, double heSoLuong, String nganhDaoTao) {
        super(hoTen, namSinh, gioiTinh, diaChi, heSoLuong);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public double tinhLuong() {
        return heSoLuong * LUONG_CO_BAN;
    }

    public NhanVien() {
    }

    @Override
    public void hienThi() {
        super.hienThi(); 
        System.out.println("Nganh dao tao: "+nganhDaoTao);
    }
    
}
