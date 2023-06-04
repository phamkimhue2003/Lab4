import java.util.Scanner;

public class GVThinhGiang extends GiangVien {
	private int soTietDay;
	private Double donGia,thuNhap;
	public GVThinhGiang(String hoTen, String diaChi, String loaiGiangVien, int soTietDay, Double donGia,
			Double thuNhap) {
		super(hoTen, diaChi, loaiGiangVien);
		this.soTietDay = soTietDay;
		this.donGia = donGia;
		this.thuNhap = thuNhap;
	}
	public GVThinhGiang() {
	}
	public int getSoTietDay() {
		return soTietDay;
	}
	public void setSoTietDay(int soTietDay) {
		this.soTietDay=soTietDay;
	}
	public Double getDonGia() {
		return donGia;
	}
	public void setDonGia(Double donGia) {
		this.donGia=donGia;
	}
	public double getThuNhap() {
		return thuNhap;
	}
	public void setThuNhap(double thuNhap) {
		this.thuNhap=thuNhap;
	}
	public void nhapThongTin() {
		Scanner sc= new Scanner(System.in);
		super.nhapThongTin();
		System.out.println("Nhap so tiet day: ");
		soTietDay=sc.nextInt();
		System.out.println("Nhap don gia: ");
		donGia=sc.nextDouble();
	}
	@Override
	public void tinhLuong() {
		thuNhap=0.15*(soTietDay*donGia);
		System.out.println("Luong thang= "+(soTietDay*donGia-thuNhap));
		
	}
	
	
}
