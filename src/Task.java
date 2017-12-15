
public class Task {
    private String name;
    private String description;
    
    public Task(String name, String description){
        name="";
        description="";
    }
    
    public boolean validate(){
        if(name==null||description==null||name.equals("")||description.equals("")){
            return false;
        }
        else
            return false;
        }
    public String toString(){
        return "Name: " + name + "\nDescription: " + description + "\n=======\n";
    }
}
