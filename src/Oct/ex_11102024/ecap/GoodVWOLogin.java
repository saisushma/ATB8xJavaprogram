package Oct.ex_11102024.ecap;

public class GoodVWOLogin {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password ,boolean isAdmin) {
        if(isAdmin){
            this.password = password;
        }
        else {
            System.out.println("not allowed");
        }
    }

    public GoodVWOLogin(String passwd, String uname){
        this.password = passwd;
        this.username= uname;

    }

}
