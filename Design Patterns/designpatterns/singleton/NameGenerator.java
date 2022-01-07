package designpatterns.singleton;

import java.util.Random;
import java.util.Set;

/**
 * @author Ohad Klein
 */
public class NameGenerator {
    Set<String> names = Set.of("Israel", "Ido", "Orya", "Shay", "Ohad");

    public NameGenerator() {
        Singleton.getInstance().logToSingleton("Created NameGenerator instance.");
    }

    public String getName() {
        String name = (names.toArray())[new Random().nextInt(names.size())].toString();
        Singleton.getInstance().logToSingleton(String.format("Called NameGenerator.getName, got: %s", name));
        return name;
    }
}
