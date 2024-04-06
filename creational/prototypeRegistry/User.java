package creational.prototypeRegistry;

public class User implements Prototype<User> {
    int id;
    String department;
    String role;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public User() {

    }

    public User(User u) {
        this.role = u.role;
        this.department = u.department;
    }

    @Override
    public User clone() {
        return new User(this);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", department='" + department + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
