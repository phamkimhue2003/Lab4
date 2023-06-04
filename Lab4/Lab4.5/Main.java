import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int chon, chon1;
		ArrayList<GiangVien> list = new ArrayList<>();
		do {
			System.out.println("1.Nhap thong tin giang vien.");
			System.out.println("2.Xuat thong tin giang vien.");
			System.out.println("0.Thoat.");
			System.out.print("Moi ban chon: ");
			chon = sc.nextInt();
			switch (chon) {
			case 1: {
				do {
					System.out.println("1.Nhap thong tin GV co huu.");
					System.out.println("2.Nhap thong tin GV thinh giang.");
					System.out.println("0.Thoat.");
					System.out.print("Moi ban chon: ");
					chon1 = sc.nextInt();
					switch (chon1) {
					case 1: {
						GVCoHuu gvch = new GVCoHuu();
						gvch.nhapThongTin();
						list.add(gvch);
						break;
					}
					case 2: {
						GVThinhGiang gvtg = new GVThinhGiang();
						gvtg.nhapThongTin();
						list.add(gvtg);
						break;
					}
					default:
						break;
					}
				} while (chon1 != 0);
				break;
			}
			case 2: {
				System.out.println("Xuat thong tin: ");
				System.out.println("-----------------------");
				for (GiangVien giangVien : list) {
					giangVien.inThongTin();
					giangVien.tinhLuong();
					System.out.println("-----------------------");
				}
			}
			default:
				break;
			}
		} while (chon != 0);
	}
}
