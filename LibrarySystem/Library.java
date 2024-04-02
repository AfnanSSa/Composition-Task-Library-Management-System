package LibrarySystem;

import java.util.List;
import java.util.Objects;

public class Library {

    Integer id;
    String name;
    List<Book> bookList;
    Address address;
    String openingHours;
    List<Librarian> librarians;

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

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public List<Librarian> getLibrarians() {
        return librarians;
    }

    public void setLibrarians(List<Librarian> librarians) {
        this.librarians = librarians;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(name, library.name) && Objects.equals(bookList, library.bookList) && Objects.equals(address, library.address) && Objects.equals(openingHours, library.openingHours) && Objects.equals(librarians, library.librarians);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, bookList, address, openingHours, librarians);
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", bookList=" + bookList +
                ", address=" + address +
                ", openingHours='" + openingHours + '\'' +
                ", librarians=" + librarians +
                '}';
    }
}
