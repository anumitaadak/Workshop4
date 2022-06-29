import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();
        addressBook.list.add(new Contact("Seema","Jaipur"));
        addressBook.list.add(new Contact("Reena","Agra"));
        addressBook.list.add(new Contact("Jiya","Mysore"));
        addressBook.list.add(new Contact("Siya","Bhagalpur"));

        addressBook.list.stream()
                .filter(contact -> contact.name == "Seema")
                .forEach(contact -> System.out.println(contact.name));

        addressBook.list.stream().filter(contact -> contact.city != null)
                .map(contact -> contact.city)
                .forEach(contact -> System.out.println(contact.city));
    }


}
