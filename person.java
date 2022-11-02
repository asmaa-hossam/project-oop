
package javaapplication3;

public class person {
    protected String name;
     protected String address;

    public person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "person{" + "name=" + name + ", address=" + address + '}';
    }
     
     
    
}
