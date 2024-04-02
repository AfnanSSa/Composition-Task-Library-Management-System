package LibrarySystem;

import java.util.List;
import java.util.Objects;

public class Publisher {

    Integer id;
    String name;
    Address address;
    List<Book> publishedBooks;
    ContactInfo contactInfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Book> getPublishedBooks() {
        return publishedBooks;
    }

    public void setPublishedBooks(List<Book> publishedBooks) {
        this.publishedBooks = publishedBooks;
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
        Publisher publisher = (Publisher) o;
        return Objects.equals(name, publisher.name) && Objects.equals(address, publisher.address) && Objects.equals(publishedBooks, publisher.publishedBooks) && Objects.equals(contactInfo, publisher.contactInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, publishedBooks, contactInfo);
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", publishedBooks=" + publishedBooks +
                ", contactInfo=" + contactInfo +
                '}';
    }
}
