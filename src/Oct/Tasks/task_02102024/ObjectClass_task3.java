package Oct.Tasks.task_02102024;

public class ObjectClass_task3 extends Task3 {
    public static void main(String[] args) {

        Task3 sai = new Task3();
        Task3 sush = new Task3();
        Task3 amit = new Task3();
        Task3 dhana = new Task3();
        Task3 ssv = new Task3();

        sai.id=88;
        System.out.println(sai.id);

        sai.tasksComplete();

        sush.email="abc.xyz@com";
        sai.work("TCS");

        amit.feespaid=true;
        System.out.println(amit.feespaid);

        dhana.phonenum=12345678;
        dhana.eat();

        ssv.tasksComplete();
        ssv.work();

    }
}
