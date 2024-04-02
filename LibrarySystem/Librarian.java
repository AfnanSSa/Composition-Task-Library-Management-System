package LibrarySystem;

import java.util.Objects;

public class Librarian {

    Integer id;
    Name name;
    Integer employeeID;
    ContactInfo contactInfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Librarian librarian = (Librarian) o;
        return Objects.equals(name, librarian.name) && Objects.equals(employeeID, librarian.employeeID) && Objects.equals(contactInfo, librarian.contactInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, employeeID, contactInfo);
    }

    @Override
    public String toString() {
        return "Librarian{" +
                "name=" + name +
                ", employeeID=" + employeeID +
                ", contactInfo=" + contactInfo +
                '}';
    }
}
