
package hellogit;

import java.util.logging.Logger;

public class Person {
    private final String name;
    private final String gender;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }
    private static final Logger LOG = Logger.getLogger(Person.class.getName());

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public static Logger getLOG() {
        return LOG;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", gender=" + gender + '}';
    }

    
    
}
