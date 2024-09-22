package cz.petrsumbal.objects;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ContactManager {
    private Set<Contact> contacts;

    public ContactManager() {
        this.contacts = new HashSet<>();
    }

    public boolean addContact(Contact contact) {
        return contacts.add(contact);
    }

    public List<Contact> findContactsByLastNamePrefix(String prefix) {
        return contacts.stream()
                .filter(contact -> contact instanceof Person)
                .map(contact -> (Person) contact)
                .filter(person -> person.getLastName().startsWith(prefix))
                .collect(Collectors.toList());
    }

    public List<Contact> findOrgUnitsByNamePrefix(String prefix) {
        return contacts.stream()
                .filter(contact -> contact instanceof OrgUnit)
                .map(contact -> (OrgUnit) contact)
                .filter(orgUnit -> orgUnit.getName().startsWith(prefix))
                .collect(Collectors.toList());
    }
}