package Oct.Tasks.task_11102024;

public class ApiAutomationRunner {
    public static void main(String[] args) {
        BaseTest bt = new TestCaseAPI("sai",8);
        bt.performGET();
        bt.performDELETE();
        bt.performPOST("ssv");
        bt.perfromPATCH();
        bt.performPut(18);
    }
}
