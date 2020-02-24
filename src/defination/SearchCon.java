package defination;

import adt.ContactSearch;

import java.util.ArrayList;
import java.util.Collection;


public class SearchCon implements ContactSearch {
    @Override
    public void searchContact(String name) {
        int flag = 0;
        ArrayList contacts = new ArrayList(manage.getConlist());
        for (int i = 0; i < contacts.size(); i++) {
            ArrayList contact = new ArrayList((Collection) contacts.get(i));
            if ((contact.get(0) + " " + contact.get(1)).equals(name)) {
                flag = 1;
                SearchContact((ArrayList) contacts.get(i));
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Contact Not Found");
        }

    }


    public void SearchContact(ArrayList contact) {
        if (contact.size() >= 5) {
            System.out.println("-------------*-------------*-------------*-------------");
            System.out.println("First Name: " + contact.get(0));
            System.out.println("Last Name: " + contact.get(1));

            System.out.println("Contact Number(s):");
            for (int i = 2; i < contact.size() - 1; i++) {
                System.out.print(contact.get(i));
            }
            System.out.println();
            System.out.println("Email:" + contact.get(contact.size() - 1));
            System.out.println("-------------*-------------*-------------*-------------");
        } else {
            System.out.println("-------------*-------------*-------------*-------------");
            System.out.println("First Name: " + contact.get(0));
            System.out.println("Last Name: " + contact.get(1));
            System.out.println("Contact Number:" + contact.get(2));
            System.out.println("Email:" + contact.get(contact.size() - 1) + "\n");
            System.out.println("-------------*-------------*-------------*-------------");

        }
    }
}
