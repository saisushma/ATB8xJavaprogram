package Oct.ex_11102024_encapsulation.Practise;

public class Lab120 {
    public static void main(String[] args) {
        WebLogin wl = new WebLogin("Admin","paswd");
        System.out.println(wl.password);
        wl.password="hacker";
        System.out.println(wl.password);

        GoodWebLogin gl= new GoodWebLogin("goodAdmin", "passwd");

       // System.out.println(gl.password); - cannot be accessible like this as passwd is
        // declared as private in login page
        System.out.println(gl.getPassword());
        boolean isAdmin=false;
        gl.setPassword("new passwd", isAdmin);
        System.out.println(gl.getPassword());
    }
}
