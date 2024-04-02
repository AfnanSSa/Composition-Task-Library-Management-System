package LibrarySystem;
import java.util.List;
import java.util.Objects;

public class Author {

    Integer id;
    Name name;
    String nationality;
    List<Book> booksByAuthor;

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

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public List<Book> getBooksByAuthor() {
        return booksByAuthor;
    }

    public void setBooksByAuthor(List<Book> booksByAuthor) {
        this.booksByAuthor = booksByAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(booksByAuthor, author.booksByAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, booksByAuthor);
    }

    @Override
    public String toString() {
        return "Author{" +
                "name=" + name +
                ", nationality='" + nationality + '\'' +
                ", booksByAuthor=" + booksByAuthor +
                '}';
    }
}
