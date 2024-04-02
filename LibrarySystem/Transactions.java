package LibrarySystem;

import java.util.Objects;

public class Transactions {

    Integer id;
    Member borrower;
    Book borrowedBook;
    String dueDate;
    String issueDate;
    String returnDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Member getBorrower() {
        return borrower;
    }

    public void setBorrower(Member borrower) {
        this.borrower = borrower;
    }

    public Book getBorrowedBook() {
        return borrowedBook;
    }

    public void setBorrowedBook(Book borrowedBook) {
        this.borrowedBook = borrowedBook;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transactions that = (Transactions) o;
        return Objects.equals(borrower, that.borrower) && Objects.equals(borrowedBook, that.borrowedBook) && Objects.equals(dueDate, that.dueDate) && Objects.equals(issueDate, that.issueDate) && Objects.equals(returnDate, that.returnDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(borrower, borrowedBook, dueDate, issueDate, returnDate);
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "borrower=" + borrower +
                ", borrowedBook=" + borrowedBook +
                ", dueDate='" + dueDate + '\'' +
                ", issueDate='" + issueDate + '\'' +
                ", returnDate='" + returnDate + '\'' +
                '}';
    }
}
