package LibrarySystem;

import java.util.List;
import java.util.Objects;

public class Genre {
    Integer id;
    String nameOfGenre;
    List<Book> books;
    String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameOfGenre() {
        return nameOfGenre;
    }

    public void setNameOfGenre(String nameOfGenre) {
        this.nameOfGenre = nameOfGenre;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Genre genre = (Genre) o;
        return Objects.equals(nameOfGenre, genre.nameOfGenre) && Objects.equals(books, genre.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfGenre, books);
    }

    @Override
    public String toString() {
        return "Genre{" +
                "nameOfGenre='" + nameOfGenre + '\'' +
                ", books=" + books +
                ", description='" + description + '\'' +
                '}';
    }
}
