package defination;

import adt.ContactView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class ViewCon implements ContactView {
    @Override
    public Object printAllContact() {
        System.out.println("Here are all your contact");
        ArrayList contactNames = new ArrayList();
        ArrayList contacts = new ArrayList(manage.getConlist());
        for (int i = 0; i < contacts.size(); i++) {
            ArrayList contact = new ArrayList((Collection) contacts.get(i));
            contactNames.add(contact.get(0) + " " + contact.get(1));
        }
        Collections.sort(contactNames, String.CASE_INSENSITIVE_ORDER);
        for (Object contactName : contactNames) {
            for (int i = 0; i < contacts.size(); i++) {
                ArrayList contact = new ArrayList((Collection) contacts.get(i));
                if (contactName.equals(contact.get(0) + " " + contact.get(1)))
                    if (contact.size() >= 5) {
                        System.out.println("-------------*-------------*-------------*-------------");
                        System.out.println("First Name: " + contact.get(0));
                        System.out.println("Last Name: " + contact.get(1));

                        System.out.print("Contact Number(s):");
                        for (int m = 2; m < contact.size() - 1; m++) {
                            System.out.print(contact.get(m) + "" + (m < contact.size() - 2 ? "," : ""));
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


        return null;

    }
}