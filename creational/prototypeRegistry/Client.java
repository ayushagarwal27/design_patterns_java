package creational.prototypeRegistry;

public class Client {
    public static void fillRegistry(UserRegistry userRegistry) {
        User user = new User();
        user.setRole("Common Employee");
        user.setDepartment("General");
        userRegistry.register("common", user);

        User adminUser = new AdminUser();
        adminUser.setDepartment("Admin Department");
        adminUser.setRole("Admin");
        userRegistry.register("admin", adminUser);
    }

    public static void main(String[] args) {
        UserRegistry userRegistry = new UserRegistry();
        fillRegistry(userRegistry);
        User common1 = userRegistry.get("common").clone();
        User common2 = userRegistry.get("common").clone();
        common1.setId(1);
        common2.setId(2);

        User admin1 = userRegistry.get("admin").clone();
        User admin2 = userRegistry.get("admin").clone();

        admin1.setId(40);
        admin2.setId(50);

        System.out.println(common1);
        System.out.println(common2);
        System.out.println(admin1);
        System.out.println(admin2);
    }
}
