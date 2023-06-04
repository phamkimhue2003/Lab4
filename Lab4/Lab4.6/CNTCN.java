import java.util.Scanner;

public class CNTCN extends CongNhan{
	private double luongCoBan,thuong;
	private int heSoLuong,soNgayCong;
	public CNTCN(String hoTen, String diaChi, String loaiCongNhan, String ngaySinh, double luongCoBan, double thuong,
			int heSoLuong, int soNgayCong) {
		super(hoTen, diaChi, loaiCongNhan, ngaySinh);
		this.luongCoBan = luongCoBan;
		this.thuong = thuong;
		this.heSoLuong = heSoLuong;
		this.soNgayCong = soNgayCong;
	}
	public CNTCN() {
	}
	public double getLuongCoBan() {
		return luongCoBan;
	}
	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}
	public double getThuong() {
		return thuong;
	}
	public void setThuong(double thuong) {
		this.thuong = thuong;
	}
	public int getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(int heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	public int getSoNgayCong() {
		return soNgayCong;
	}
	public void setSoNgayCong(int soNgayCong) {
		this.soNgayCong = soNgayCong;
	}
	public void nhapThongTin() {
		Scanner sc= new Scanner(System.in);
		super.nhapThongTin();
		System.out.println("Nhap luong co ban: ");
		luongCoBan=sc.nextDouble();
		System.out.println("Nhap he so luong: ");
		heSoLuong=sc.nextInt();
		System.out.println("Nhap so ngay cong: ");
		soNgayCong=sc.nextInt();
	}
	@Override
	public void tinhLuong() {
		if(soNgayCong<20) {
			thuong=0;
		}else {
			thuong=1.2*luongCoBan;
		}
		System.out.println("Luong thang = "+(luongCoBan*heSoLuong+thuong));
	}
	
	

}
