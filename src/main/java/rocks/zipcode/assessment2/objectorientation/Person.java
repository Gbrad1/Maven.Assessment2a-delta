package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {
    Long id;
    String name;
    Address address;
    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    public Person(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Person() {
        this.id = Long.MIN_VALUE;
        this.name = "";
        this.address = new Address();
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Person) {
            if (((Person) o).getId() != null && this.id != null) {
                if ((!((Person) o).getId().equals(this.id))) {
                    return false;
                }
                return true;
            }
            if (((Person) o).getName() != null && this.name != null) {
                if ((!((Person) o).getName().equals(this.name))) {
                    return false;
                }
                return true;
            }
            if (((Person) o).getAddress() != null && this.address != null) {
                if ((!((Person) o).getAddress().equals(this.address))) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String toReturn = "Person{";
        toReturn += "id=" + this.id + ", ";
        toReturn += "name=" + "'" +  this.name + "'" + ", ";
        toReturn += "address=" + this.getAddress().toString() + "}";
        return toReturn;
    }
}