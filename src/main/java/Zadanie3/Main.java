package Zadanie3;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        Scanner scanner = new Scanner(System.in);

        List<Contact> listOfContacts = new ArrayList<>();
        listOfContacts.add(new Contact("Mieszko", "Pierwszy", "333-222-111", "mieszko1@gmail.com"));
        listOfContacts.add(new Contact("Bolesław", "Chrobry","666-124-567", "bolek_chrobry@gmail.com"));
        listOfContacts.add(new Contact("Kazimierz", "Wielki", "990-123-456", "kazikwielki@gmail.com"));

        try {
            mapper.writeValue(new File("D:\\Java\\Projekty\\ProgramowanieII\\src\\main\\resources\\contacts.json"), listOfContacts);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            String contactsAsList = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(listOfContacts);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Wybierz czynnosc:");
        System.out.println("1. Wyszukaj kontakt w bazie");
        System.out.println("2. Dodaj nowy kontakt");
        System.out.println("3. Wyjdź z programu");
        Integer chosenNumber = scanner.nextInt();

        switch (chosenNumber){
            case 1: {
                System.out.println("Wybierz rodzaj wyszukiwania:");
                System.out.println("A. Po imieniu");
                System.out.println("B. Po numerze telefonu");
                System.out.println("C. Po adresie email");

                String chosenLetter = scanner.next();
                switch (chosenLetter){
                    case "A": {
                        System.out.println("Podaj imię:");
                        String nameForSearch = scanner.next();
                        List<Contact> loadedListOfContacts = null;
                        try {
                            loadedListOfContacts = mapper.readValue(new File("D:\\Java\\Projekty\\ProgramowanieII\\src\\main\\resources\\contacts.json"), new TypeReference<List<Contact>>(){});
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        for (Contact contact : loadedListOfContacts){
                            if (contact.getName().equals(nameForSearch)){
                                System.out.println(contact.toString());
                            }
                        }
                    }
                }
            }
        }


    }


}
