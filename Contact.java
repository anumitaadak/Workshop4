public class Contact {
    String name;
    String city;

    public Contact(String name,String city) {
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
