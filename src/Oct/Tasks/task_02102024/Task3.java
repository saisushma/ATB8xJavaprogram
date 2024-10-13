package Oct.Tasks.task_02102024;

public class Task3 {

    long phonenum;
    int id;
    String email;
    boolean feespaid;
    String  name;

    void work(String wname){
        this.name = wname;
        System.out.printf("working at ",wname);
    }
    boolean tasksComplete( ){

        return true;
    }

    void eat(){
        System.out.println("eating");
    }
    void work(){
        System.out.println("im working");
    }
}
