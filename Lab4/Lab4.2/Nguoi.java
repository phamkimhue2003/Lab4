public class Nguoi{
    protected String ten, gioitinh;
    int tuoi;
    public Nguoi(String ten, String gioitinh, int tuoi){
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioitinh = gioitinh;
    }
    public String getten(){
        return ten;
    }
    public void setten(String ten){
        this.ten=ten;
    }
    public int gettuoi(){
        return tuoi;
    }
    public void settuoi(int tuoi){
        this.tuoi=tuoi;
    }
    public String getgioitinh(){
        return gioitinh;
    }
    public void setgioiTinh(String gioitinh){
        this.gioitinh=gioitinh;
    }
    public String toString(){
        return "Ten : "+ten+"\nTuoi : "+tuoi+"\nGioi tinh : "+gioitinh;
    }
}