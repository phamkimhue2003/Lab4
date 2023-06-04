import java.util.Scanner;

public class HocvienLT extends HocVien{
	private int soBuoi;
	private Double donGiaLT;
	
	public HocvienLT(String hoTen, String diaChi, String loaiChuongTrinh, int loaiUuTien, Double hocPhi, int soBuoi,
			Double donGiaLT) {
		super(hoTen, diaChi, loaiChuongTrinh, loaiUuTien, hocPhi);
		this.soBuoi = soBuoi;
		this.donGiaLT = donGiaLT;
	}
	
	public HocvienLT() {
	}

	public int getSoBuoi() {
		return soBuoi;
	}

	public void setSoBuoi(int soBuoi) {
		this.soBuoi = soBuoi;
	}

	public Double getDonGiaLT() {
		return donGiaLT;
	}

	public void setDonGiaLT(Double donGiaLT) {
		this.donGiaLT = donGiaLT;
	}
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		super.nhapThongTin();
		System.out.println("Nhap so buoi: ");
		soBuoi= sc.nextInt();
		System.out.println("Nhap don gia LT: ");
		donGiaLT=sc.nextDouble();
	}
	@Override
	public void hocPhi() {
		if(getLoaiUuTien()==1) {
			setHocPhi(soBuoi*donGiaLT-1000000);
		}else if(getLoaiUuTien()==2) {
			setHocPhi(soBuoi*donGiaLT-800000);
		}else {
			setHocPhi(soBuoi*donGiaLT);
		}
		System.out.println("Hoc phi = "+getHocPhi());
	}
	
}
