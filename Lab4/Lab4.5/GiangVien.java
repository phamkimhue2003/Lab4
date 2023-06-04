import java.util.Scanner;

public abstract class GiangVien {
	private String hoTen,diaChi,loaiGiangVien;
	public GiangVien(String hoTen, String diaChi, String loaiGiangVien) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiGiangVien = loaiGiangVien;
	}
	public GiangVien() {
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getLoaiGiangVien() {
		return loaiGiangVien;
	}
	public void setLoaiGiangVien(String loaiGiangVien) {
		this.loaiGiangVien = loaiGiangVien;
	}
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho ten: ");
		hoTen=sc.nextLine();
		System.out.println("Nhap dia chi: ");
		diaChi=sc.nextLine();
		System.out.println("Nhap loai giao vien: ");
		loaiGiangVien=sc.nextLine();
	}
	public abstract void tinhLuong();
	public void inThongTin() {
		System.out.println("Ho ten : "+hoTen);
		System.out.println("Dia chi: "+diaChi);
		System.out.println("Loai giao vien: "+loaiGiangVien);
	}
}
