package LibrarySystem;

import java.util.Objects;

public class LibraryCard {

    Integer id;
    Name memberName;
    Integer cardID;
    String expiryDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Name getMemberName() {
        return memberName;
    }

    public void setMemberName(Name memberName) {
        this.memberName = memberName;
    }

    public Integer getCardID() {
        return cardID;
    }

    public void setCardID(Integer cardID) {
        this.cardID = cardID;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibraryCard that = (LibraryCard) o;
        return Objects.equals(memberName, that.memberName) && Objects.equals(cardID, that.cardID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberName, cardID);
    }

    @Override
    public String toString() {
        return "LibraryCard{" +
                "memberName=" + memberName +
                ", cardID=" + cardID +
                ", expiryDate='" + expiryDate + '\'' +
                '}';
    }
}
