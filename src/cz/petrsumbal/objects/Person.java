package cz.petrsumbal.objects;

import java.util.List;

public class Person extends Contact {
    private String firstName;
    private String lastName;
    private List<String> titles;

    public Person(int id, String address, String firstName, String lastName, List<String> titles) {
        super(id, address);
        this.firstName = firstName;
        this.lastName = lastName;
        this.titles = titles;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<String> getTitles() {
        return titles;
    }
}
