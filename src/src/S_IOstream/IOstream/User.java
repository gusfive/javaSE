package S_IOstream.IOstream;

import java.io.Serializable;

public class User implements Serializable {
    private String loginName;
    private String username;
    private int age;
    private transient String password;

    public User() {
    }

    public User(String loginName, String username, int age, String password) {
        this.loginName = loginName;
        this.username = username;
        this.age = age;
        this.password = password;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "loginName='" + loginName + '\'' +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }
}
