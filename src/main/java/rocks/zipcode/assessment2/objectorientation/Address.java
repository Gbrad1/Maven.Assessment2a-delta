package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 */
public class Address {
    String addressLine1;
    String addressLine2;
    String city;
    String state;
    String zipcode;

    public Address() {
        this.addressLine1 = "";
        this.addressLine2 = "";
        this.city = "";
        this.state = "";
        this.zipcode = "";
    }

    public Address(String addressLine1, String addressLine2, String city, String state, String zipcode) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return this.zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Address) {
            if (((Address)o).getAddressLine1().equals(this.addressLine1) &&
            ((Address) o).getAddressLine2().equals(this.addressLine2) &&
            ((Address) o).getCity().equals(this.city) &&
            ((Address) o).getState().equals(this.state) &&
            ((Address) o).getZipcode().equals(this.zipcode)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String toReturn = "Address{";
        toReturn += "addressLine1=" + "'" + this.addressLine1 + "',";
        toReturn += " addressLine2=" + "'" + this.addressLine2 + "',";
        toReturn += " city=" + "'" + this.city + "',";
        toReturn += " state=" + "'" + this.state + "',";
        toReturn += " zipcode=" + "'" + this.zipcode + "'}";
        return toReturn;
    }
}
