
package de101;

public class NhanVien extends CanBo{
    private String nganhDaoTao;

    public NhanVien() {
    }

    public NhanVien(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return super.toString()+", Nganh dao tao: "+nganhDaoTao+", Luong: "+tinhLuong(); 
    }
    public float tinhLuong() {
        return heSoLuong*LUONG_CO_BAN;
    }
}
