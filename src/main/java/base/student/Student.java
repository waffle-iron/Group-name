package base.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String forename;
    private String surname;
    private String email;
    private String token;
    // private ArrayList<Flowchart> flowcharts;

    public Student (){};

    public Student(String forename, String surname, String email, String token) {
        this.forename = forename;
        this.surname = surname;
        this.email = email;
        this.token = token;
    }

    public Long getId() {
        return id;
    }

    public String getForename() {
        return forename;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getToken() {
        return token;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setForename(String forname) {
        this.surname = surname;
    }

    public void setSurname(String surname) {
        this.forename = forename;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setToken(String token) {
        this.token = token;
    }
}