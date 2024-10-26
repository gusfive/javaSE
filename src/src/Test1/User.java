package Test1;

import java.time.LocalDate;

public class User {
    private Long id;
    private String gender;
    private LocalDate birthday;
    private  String name;

    public User() {
    }

    public User(Long id, String gender, LocalDate birthday,String name) {
        this.id = id;
        this.gender = gender;
        this.birthday = birthday;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
