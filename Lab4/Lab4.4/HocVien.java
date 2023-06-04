import java.util.Scanner;

public abstract class HocVien {
	private String hoTen,diaChi,loaiChuongTrinh;
	private int loaiUuTien;
	private Double hocPhi;
	public HocVien(String hoTen, String diaChi, String loaiChuongTrinh, int loaiUuTien, Double hocPhi) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiChuongTrinh = loaiChuongTrinh;
		this.loaiUuTien = loaiUuTien;
		this.hocPhi = hocPhi;
	}
	public HocVien() {
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
	public String getLoaiChuongTrinh() {
		return loaiChuongTrinh;
	}
	public void setLoaiChuongTrinh(String loaiChuongTrinh) {
		this.loaiChuongTrinh=loaiChuongTrinh;
	}
	public int getLoaiUuTien() {
		return loaiUuTien;
	}
	public void setLoaiUuTien(int loaiUuTien) {
		this.loaiUuTien=loaiUuTien;
	}
	public Double getHocPhi() {
		return hocPhi;
	}
	public void setHocPhi(Double hocPhi) {
		this.hocPhi=hocPhi;
	}
	public void nhapThongTin() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap ho ten: ");
		hoTen=sc.nextLine();
		System.out.println("Nhap dia chi: ");
		diaChi=sc.nextLine();
		System.out.println("Nhap loai chuong trinh: ");
		loaiChuongTrinh=sc.nextLine();
		System.out.println("Nhap loai uu tien: ");
		loaiUuTien=sc.nextInt();
	}
	public abstract void hocPhi();
	public void inThongTin() {
		System.out.println("Ho ten: "+hoTen);
		System.out.println("Dia chi: "+diaChi);
		System.out.println("Loai uu tien: "+loaiUuTien);
		System.out.println("Loai chuong trinh dang ki: "+loaiChuongTrinh);
	}
	
	
}
