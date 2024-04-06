package creational.prototypeRegistry;

public class AdminUser extends User {

    public AdminUser() {

    }

    public AdminUser(AdminUser admin) {
        super(admin);
    }

    @Override
    public AdminUser clone() {
        return new AdminUser(this);
    }

    @Override
    public String toString() {
        return "AdminUser{" +
                "id=" + id +
                ", department='" + department + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
