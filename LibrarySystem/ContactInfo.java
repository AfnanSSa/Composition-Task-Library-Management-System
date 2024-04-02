package LibrarySystem;

import java.util.Objects;

public class ContactInfo {

    Integer id;
    String mobilePhoneNumber;
    String email;
    String officePhoneNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOfficePhoneNumber() {
        return officePhoneNumber;
    }

    public void setOfficePhoneNumber(String officePhoneNumber) {
        this.officePhoneNumber = officePhoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactInfo that = (ContactInfo) o;
        return Objects.equals(mobilePhoneNumber, that.mobilePhoneNumber) && Objects.equals(email, that.email) && Objects.equals(officePhoneNumber, that.officePhoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mobilePhoneNumber, email, officePhoneNumber);
    }

    @Override
    public String toString() {
        return "ContactInfo{" +
                "mobilePhoneNumber='" + mobilePhoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", officePhoneNumber='" + officePhoneNumber + '\'' +
                '}';
    }
}
