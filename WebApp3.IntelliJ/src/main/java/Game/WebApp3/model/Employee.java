package Game.WebApp3.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Employees")
public class Employee {

    private int id;
    private String Username;
    private String Name;
    private String Surname;
    private String Password;

    public Employee() {
    }

    public Employee(String username, String name, String surname, String password) {
        this.Name = name;
        this.Username = username;
        this.Surname = surname;
        this.Password = password;
    }

    public Employee(String Konrad, String Jaroszewski) {
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    public long getId() {
        return id;
    }

    @Column(name = "Name", nullable = false)
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    @Column(name = "Surname", nullable = false)
    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    @Column(name = "Username", nullable = false)
    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    @Column(name = "Password", nullable = false)
    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ",Name=" + Name + ", Surname=" + Surname + ", Username=" + Username + ", Password=" + Password + "]";
    }
}
