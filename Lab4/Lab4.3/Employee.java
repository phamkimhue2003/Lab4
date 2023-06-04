class Employee extends person{
    protected String employerName,dateHired;
    public Employee(String name,int age,String gender,String employerName,String dateHired){
        super(employerName, gender, age);
        this.employerName=employerName;
        this.dateHired=dateHired;
    }
    public String getemployerName(){
        return employerName;
    }
    public void setemployerName(String employerName){
        this.employerName=employerName;
    }
    public String getdateHired(){
        return dateHired;
    }
    public void setdateHired(String dateHired){
        this.dateHired=dateHired;
    }
    public String toString(){
        return super.toString()+"\nTen nhan vien: "+employerName+"\nThoi gian thue: "+dateHired;
    }
}