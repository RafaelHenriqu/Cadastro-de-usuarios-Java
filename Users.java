public class Users {
    String Name;
    int Age;

    public Users(){
    }

    public void Add_Users(String Name, int Age){
        this.Name = Name;
        this.Age = Age;
    }

    public String Get_Users(){
        return "Name: " + Name + " Idade: " + Age + " Anos";
    }

}
