import java.util.Scanner;

public class GVCoHuu extends GiangVien{
	private Double luongCoBan,phuCap;
	private int heSoLuong,thamNien;
	public GVCoHuu(String hoTen, String diaChi, String loaiGiangVien, Double luongCoBan, Double phuCap,
			 int heSoLuong, int thamNien) {
		super(hoTen, diaChi, loaiGiangVien);
		this.luongCoBan = luongCoBan;
		this.phuCap = phuCap;
		this.heSoLuong = heSoLuong;
		this.thamNien = thamNien;
	}
	public GVCoHuu() {
	}
	
	public Double getLuongCoBan() {
		return luongCoBan;
	}
	public void setLuongCoBan(Double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}
	public Double getPhuCap() {
		return phuCap;
	}
	public void setPhuCap(Double phuCap) {
		this.phuCap = phuCap;
	}
	public int getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(int heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	public int getThamNien() {
		return thamNien;
	}
	public void setThamNien(int thamNien) {
		this.thamNien = thamNien;
	}
	public void nhapThongTin() {
		Scanner sc= new Scanner(System.in);
		super.nhapThongTin();
		System.out.println("Nhap luong co ban: ");
		luongCoBan=sc.nextDouble();
		System.out.println("Nhap he so luong: ");
		heSoLuong=sc.nextInt();
		System.out.println("Nhap tham nien: ");
		thamNien=sc.nextInt();
	}
	@Override
	public void tinhLuong() {
		if(thamNien<5) {
			phuCap=(double) 0;
		}else {
			phuCap=thamNien*luongCoBan/100;
		}
		System.out.println("Luong thang = "+(luongCoBan*heSoLuong+phuCap));
	}
	

}
