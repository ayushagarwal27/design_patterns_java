package creational.prototypeRegistry;

import java.util.HashMap;

public class UserRegistry {
    private HashMap<String, User> map = new HashMap<>();

    void register(String key, User user) {
        map.put(key, user);
    }

    User get(String key) {
        return map.get(key).clone();
    }
}
