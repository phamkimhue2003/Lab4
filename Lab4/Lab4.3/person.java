public class person {
    protected String name, gender;
    protected int age;
    public person(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public String getgender(){
        return gender;
    }
    public void setgender( String gender){
        this.gender = gender;
    }
    public int getage(){
        return age;
    }
    public void setage(int age){
        this.age = age;
    }
    public String toString(){
        return name+"+"+age+"+"+gender;
    }
}
