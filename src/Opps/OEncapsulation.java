package Opps;

public class OEncapsulation {

    // encapsulation is machinsm where we can wrappe the data in to th single entity
     // all the instance varialb are private we get the data with gettr method

    private String  namel;
    private String username;
    private String password;

    public void setNamel(String namel) {
        this.namel = namel;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String getNamel() {
        return namel;
    }

    public OEncapsulation(String namel, String username, String password) {
        this.namel = namel;
        this.username = username;
        this.password = password;
    }

    public OEncapsulation() {
    }
}
