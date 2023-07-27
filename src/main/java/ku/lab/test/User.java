package ku.lab.test;

public class User {
    private String userName;
    private String iD;
    private String accountName;

    private String password;

    public User() {
        iD = "1256";
        userName = "AAA";
        accountName = "JJ";
    }

    public String getUserName() {return this.userName;}
    public String getPassword() {return this.password;}
}
