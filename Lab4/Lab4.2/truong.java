public class truong {
    protected String tenTruong, diaChi, hieuTruong;
    public truong(String tenTruong,String diaChi,String hieuTruong){
        this.tenTruong = tenTruong;
        this.diaChi = diaChi;
        this.hieuTruong=hieuTruong;
    }
    public String gettenTruong(){
        return tenTruong;
    }
    public void settenTruong(String tenTruong){
        this.tenTruong = tenTruong;
    }
    public String getdiaChi(){
        return diaChi;
    }
    public void setdiaChi(String diaChi){
        this.diaChi=diaChi;
    }
    public String gethieuTruong(){
        return hieuTruong;
    }
    public void sethieuTruong(String hieuTruong){
        this.hieuTruong=hieuTruong;
    }
    public String toString(){
        return "\nTen truong: "+tenTruong+"\nDia chi: "+diaChi+"\nHieu truong: "+hieuTruong;
    }
}