package app.Task01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class Main01 {
    public static void main(String[] args) {
        showData(getData());

    }

    static List<String> getData() {
        return Arrays.asList("Tom", "Alice", "Bob", "Lucy");
    }

    static void showData(List<String> list) {
        Consumer<String> consumer = name -> System.out.println("Name is " + name);
        for (String name : list) {
            consumer.accept(name);
        }
    }
}
