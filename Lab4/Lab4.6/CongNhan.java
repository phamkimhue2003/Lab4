import java.util.Scanner;

public abstract class CongNhan {
	private String hoTen,diaChi,loaiCongNhan,ngaySinh;

	public CongNhan(String hoTen, String diaChi, String loaiCongNhan,String ngaySinh) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiCongNhan = loaiCongNhan;
		this.ngaySinh=ngaySinh;
	}

	public CongNhan() {
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen=hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi=diaChi;
	}
	public String getLoaiCongNhan() {
		return loaiCongNhan;
	}
	public void setLoaiCongNhan(String loaiCongNhan) {
		this.loaiCongNhan=loaiCongNhan;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh=ngaySinh;
	}
	public void nhapThongTin() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap ho ten: ");
		hoTen=sc.nextLine();
		System.out.println("Nhap dia chi: ");
		diaChi=sc.nextLine();
		System.out.println("Nhap ngay sinh: ");
		ngaySinh=sc.nextLine();
		System.out.println("Nhap loai cong nhan: ");
		loaiCongNhan=sc.nextLine();
	}
	public abstract void tinhLuong();
	public void inThongTin() {
		System.out.println("Ho ten: "+hoTen);
		System.out.println("Dia chi: "+diaChi);
		System.out.println("Nhao ngay sinh: "+ngaySinh);
		System.out.println("Nhap loai cong nhan: "+loaiCongNhan);
	}
}
