package cz.petrsumbal.objects;

public class OrgUnit extends Contact {
    private String name;

    public OrgUnit(int id, String address, String name) {
        super(id, address);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}