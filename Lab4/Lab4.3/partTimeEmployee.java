class PartTimeEmployee extends Employee{
    int hoursPerWeek;
    PartTimeEmployee(String name,int age,String gender,String employerName,String dateHired, int hoursPerWeek){
        super(name, age, gender, employerName, dateHired);
        this.hoursPerWeek=hoursPerWeek;
    }
    public int gethoursPerWeek(){
        return hoursPerWeek;
    }
    public void sethoursPerWeek(int hoursPerWeek){
        this.hoursPerWeek=hoursPerWeek;
    }
    public String toString(){
        return super.toString()+"\nSo gio lam trong tuan: "+hoursPerWeek;
    }
}