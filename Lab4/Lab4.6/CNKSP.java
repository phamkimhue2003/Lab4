import java.util.Scanner;

public class CNKSP extends CongNhan {
	private int soSanPham;
	private double donGiaSanPham,thuong;
	
	private long luongThang;
	
	public CNKSP(String hoTen, String diaChi, String loaiCongNhan, String ngaySinh, int soSanPham, double donGiaSanPham,
			double thuong) {
		super(hoTen, diaChi, loaiCongNhan, ngaySinh);
		this.soSanPham = soSanPham;
		this.donGiaSanPham = donGiaSanPham;
		this.thuong = thuong;
	}
	
	public CNKSP() {
	}
	
	
	public int getSoSanPham() {
		return soSanPham;
	}

	public void setSoSanPham(int soSanPham) {
		this.soSanPham = soSanPham;
	}

	public double getDonGiaSanPham() {
		return donGiaSanPham;
	}

	public void setDonGiaSanPham(double donGiaSanPham) {
		this.donGiaSanPham = donGiaSanPham;
	}

	public double getThuong() {
		return thuong;
	}

	public void setThuong(double thuong) {
		this.thuong = thuong;
	}
	public void nhapThongTin() {
		Scanner sc= new Scanner(System.in);
		super.nhapThongTin();
		System.out.println("Nhap so san pham: ");
		soSanPham=sc.nextInt();
		System.out.println("Nhap don gia sp: ");
		donGiaSanPham=sc.nextDouble();
	}
	@Override
	public void tinhLuong() {
		if(soSanPham<=1000) {
			thuong=0;
		}else if(soSanPham<=1150) {
			thuong=1000000;
		}else {
			thuong=1500000;
		}
		luongThang=(long) (soSanPham*donGiaSanPham+thuong);
		System.out.println("Luong thang: "+luongThang);
	}

}
