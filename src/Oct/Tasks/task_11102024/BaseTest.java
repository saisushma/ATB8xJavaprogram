package Oct.Tasks.task_11102024;

abstract class BaseTest {
    protected String name;
    protected int id;

    public BaseTest(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String performGET() {
        return "im peforming get operation";
    }

    public void performPOST(String name) {

        System.out.println("this is a post operation : " +name);
    }

    public int perfromPATCH() {
        return id;
    }

    public void performPut(int id) {
        this.id = id;
        System.out.println("put operation is performed by "+id);
    }

        abstract void performDELETE();


    }

