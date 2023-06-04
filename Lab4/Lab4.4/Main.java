import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int chon, chon1;
		ArrayList<HocVien> list = new ArrayList<>();
		do {
			System.out.println("1.Nhap thong tin hoc vien.");
			System.out.println("2.Xuat thong tin hoc vien.");
			System.out.println("0.Thoat.");
			System.out.print("Moi ban chon: ");
			chon = sc.nextInt();
			switch (chon) {
			case 1: {
				do {
					System.out.println("1.Nhap thong tin hoc vien DH.");
					System.out.println("2.Nhap thong tin hoc vien LT.");
					System.out.println("0.Thoat.");
					System.out.print("Moi ban chon: ");
					chon1 = sc.nextInt();
					switch (chon1) {
					case 1: {
						HocvienDH hvdh = new HocvienDH();
						hvdh.nhapThongTin();
						list.add(hvdh);
						break;
					}
					case 2: {
						HocvienLT hvlt = new HocvienLT();
						hvlt.nhapThongTin();
						list.add(hvlt);
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
				for (HocVien hocVien : list) {
					hocVien.inThongTin();
					hocVien.hocPhi();
					System.out.println("-----------------------");
				}
			}
			default:
				break;
			}
		} while (chon != 0);
	}
}
