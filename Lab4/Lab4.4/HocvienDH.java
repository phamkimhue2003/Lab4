import java.util.Scanner;

public class HocvienDH extends HocVien{
	private int soBuoi;
	private Double donGiaDH;
	public HocvienDH(String hoTen, String diaChi, String loaiChuongTrinh, int loaiUuTien, Double hocPhi, int soBuoi,
			Double donGiaDH) {
		super(hoTen, diaChi, loaiChuongTrinh, loaiUuTien, hocPhi);
		this.soBuoi = soBuoi;
		this.donGiaDH = donGiaDH;
	}
	
	public HocvienDH() {
	}

	public int getSoBuoi() {
		return soBuoi;
	}

	public void setSoBuoi(int soBuoi) {
		this.soBuoi = soBuoi;
	}

	public Double getDonGiaDH() {
		return donGiaDH;
	}

	public void setDonGiaDH(Double donGiaDH) {
		this.donGiaDH = donGiaDH;
	}

	public void nhapThongTin() {
		Scanner sc= new Scanner(System.in);
		super.nhapThongTin();
		System.out.println("Nhap so buoi hoc: ");
		soBuoi=sc.nextInt();
		System.out.println("Nhap don gia DH: ");
		donGiaDH=sc.nextDouble();
	}
	@Override
	public void hocPhi() {
		if(getLoaiUuTien()==1) {
			setHocPhi(soBuoi*donGiaDH-1000000);
		}else if(getLoaiUuTien()==2){
			setHocPhi(soBuoi*donGiaDH-500000);
		}else {
			setHocPhi(soBuoi*donGiaDH);
		}
		System.out.println("Hoc Phi ="+getHocPhi());
	}
	
	
	
}
