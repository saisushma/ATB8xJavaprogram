package Oct.Tasks.task_04102024;

public class Main {
    public static void main(String[] args) {

        Person pc = new Person();
        Person pc1 = new Person("sai","sush",12345789);

        pc.isWorking= true;
        pc.Working();

        pc1.getaddress("Kolkota",5000467);

        pc1.Personals(1234567,"female");
        pc1.getAge(28);

        pc.read();
    }
}
