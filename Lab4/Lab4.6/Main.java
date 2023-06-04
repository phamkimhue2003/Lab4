import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int chon, chon1;
		ArrayList<CongNhan> list = new ArrayList<>();
		do {
			System.out.println("1.Nhap thong tin cong nhan.");
			System.out.println("2.Xuat thong tin cong nhan.");
			System.out.println("0.Thoat.");
			System.out.print("Moi ban chon: ");
			chon = sc.nextInt();
			switch (chon) {
			case 1: {
				do {
					System.out.println("1.Nhap thong tin CNKSP.");
					System.out.println("2.Nhap thong tin CNTCN.");
					System.out.println("0.Thoat.");
					System.out.print("Moi ban chon: ");
					chon1 = sc.nextInt();
					switch (chon1) {
					case 1: {
						CNKSP cnksp = new CNKSP();
						cnksp.nhapThongTin();
						list.add(cnksp);
						break;
					}
					case 2: {
						CNTCN cntcn = new CNTCN();
						cntcn.nhapThongTin();
						list.add(cntcn);
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
				for (CongNhan cn : list) {
					cn.inThongTin();
					cn.tinhLuong();;
					System.out.println("-----------------------");
				}
			}
			default:
				break;
			}
		} while (chon != 0);
	}
}
