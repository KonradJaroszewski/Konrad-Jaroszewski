package Game.WebApp3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employees")
public class Employee {

    private int id;
    public String username;
    public String name;
    public String surname;
    public String password;
    public String role;


    public Employee() {
    }
    public Employee(String username, String name, String surname, String password , String role) {
        this.name = name;
        this.username = username;
        this.surname = surname;
        this.password = password;
        this.role=role;
    }



    public void setId(int id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    public int getId() {
        return id;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = name;
    }

    @Column(name = "surname",nullable = false)
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Column(name = "username",nullable = false)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "password", nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Column(name = "role",nullable = false)
    public String getRole(){return role;}

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ",Name=" + name + ", Surname=" + surname + ", Username=" + username + ", Password=" + password + ",Role="+role+"]";
    }
}
