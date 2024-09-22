package cz.petrsumbal;

import cz.petrsumbal.objects.ContactManager;
import cz.petrsumbal.objects.Contact;
import cz.petrsumbal.objects.Person;
import cz.petrsumbal.objects.OrgUnit;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PlayWithContacts {


    public void playWithContacts() {
        ContactManager manager = new ContactManager();

        manager.addContact(new Person(1, "Address 1", "Adam", "Novak", Arrays.asList("Ing.")));
        manager.addContact(new Person(2, "Address 2", "Lukas", "Dlouhy", Arrays.asList("Dr.")));
        manager.addContact(new OrgUnit(3, "Address 3", "Big Company"));
        manager.addContact(new OrgUnit(4, "Address 4", "Small Company"));

        // !!! DUPLICITY !!!
        manager.addContact(new Person(1, "Address 1", "Adam", "Novak", Arrays.asList("Ing.")));

        Scanner scanner = new Scanner(System.in);

        // Searching person according to their surname prefix
        System.out.print("Enter surname prefix person search: ");
        String lastNamePrefix = scanner.nextLine();
        List<Contact> findPerson = manager.findContactsByLastNamePrefix(lastNamePrefix);

        findPerson.forEach(contact -> {
            Person person = (Person) contact;
            System.out.println(person.getFirstName() + " " + person.getLastName() + " (" + person.getTitles() + ")");
        });

        // Searching Org Units according to their name prefix
        System.out.print("Enter name prefix Org Unit search: ");
        String orgNamePrefix = scanner.nextLine();
        List<Contact> FindOrgUnits = manager.findOrgUnitsByNamePrefix(orgNamePrefix);

        FindOrgUnits.forEach(contact -> {
            OrgUnit orgUnit = (OrgUnit) contact;
            System.out.println(orgUnit.getName() + " (" + orgUnit.getAddress() + ")");
        });

        scanner.close();
    }
}
