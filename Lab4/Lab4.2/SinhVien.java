class SinhVien extends Nguoi{
   protected String lop,nganh;
   protected truong trg;
    public SinhVien(String ten,int tuoi,String gioitinh,String lop,String nganh,truong trg){
        super(ten, gioitinh, tuoi);
        this.lop=lop;
        this.nganh=nganh;
        this.trg=trg;
    }
    public String getlop(){
        return lop;
    }
    public void setlop(String lop){
        this.lop=lop;
    }
    public String getnganhString(){
        return nganh;
    }
    public void setnagnh(String nganh){
        this.nganh=nganh;
    }
    public String toString(){
        return super.toString()+"\nLop: "+lop+"\nNganh: "+nganh+trg;
    }
}