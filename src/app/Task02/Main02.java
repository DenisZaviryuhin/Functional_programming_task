package app.Task02;

import java.util.function.Supplier;

public class Main02 {


    public static void main(String[] args) {
        showInfo();
    }

    static void showInfo() {
        String name = "Tom";
        String phoneNumber = "555 123-8596";
        User user = getInfo(() -> new User(name, phoneNumber));
        System.out.println("User name is " + user.getName() + ", phone " + user.getPhoneNumber());
    }

    public static User getInfo(Supplier<User> supplier) {
        return supplier.get();
    }
}
