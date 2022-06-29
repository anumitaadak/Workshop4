import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Contact contact = new Contact("Seema","Jaipur");
        Contact contact1 = new Contact("Reena","Agra");
        Contact contact2 = new Contact("Jiya","Mysore");
        Contact contact3 = new Contact("Siya","Bhagalpur");

        AddressBook addressBook = new AddressBook();
        addressBook.list.add(contact);
        addressBook.list.add(contact1);
        addressBook.list.add(contact2);
        addressBook.list.add(contact3);

        System.out.println(addressBook.list);
        List<String> listBook =  addressBook.list.stream().filter(name -> Objects.equals(name, contact))
                .forEach(System.out::println).collect(Collectors.toList());

        System.out.println(listBook);

    }
}
