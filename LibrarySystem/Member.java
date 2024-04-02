package LibrarySystem;

import java.util.List;
import java.util.Objects;

public class Member {

    Integer id;
    Name name;
    LibraryCard libraryCard;
    ContactInfo contactInfo;
    Address address;
    List<Book> borrowedBooks;

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

    public LibraryCard getLibraryCard() {
        return libraryCard;
    }

    public void setLibraryCard(LibraryCard libraryCard) {
        this.libraryCard = libraryCard;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(name, member.name) && Objects.equals(libraryCard, member.libraryCard) && Objects.equals(contactInfo, member.contactInfo) && Objects.equals(address, member.address) && Objects.equals(borrowedBooks, member.borrowedBooks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, libraryCard, contactInfo, address, borrowedBooks);
    }

    @Override
    public String toString() {
        return "Member{" +
                "name=" + name +
                ", libraryCard=" + libraryCard +
                ", contactInfo=" + contactInfo +
                ", address=" + address +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }
}
