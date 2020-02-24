package defination;


import adt.ContactDeleteAdt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class DeleteCon implements ContactDeleteAdt {
    Scanner sc = new Scanner(System.in);

    @Override
    public boolean deleteContact() {
        int flag = 0;
//        ArrayList contacts = new ArrayList(DataStructure.getConlist());
        System.out.println("Here are all your contact");
        ArrayList contactNames = new ArrayList();
        ArrayList contacts = new ArrayList(manage.getConlist());
        for (int i = 0; i < contacts.size(); i++) {
            Object o = contacts.get(i);
            ArrayList contact = new ArrayList((Collection) o);
            contactNames.add(contact.get(0) + " " + contact.get(1));
        }
        Collections.sort(contactNames, String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < contactNames.size(); i++) {
            System.out.println(i + 1 + "." + contactNames.get(i).toString());
        }
        System.out.print("Enter the Full name: ");
        String del = sc.nextLine();
        for (int i = 0; i < contacts.size(); i++) {
            ArrayList contact = new ArrayList((Collection) contacts.get(i));
            if ((contact.get(0) + " " + contact.get(1)).equals(del)) {
                manage.removeContact(i);
                System.out.println("Contact Delete Sucessfully");
                flag = 1;
                return true;
            }
        }
        if (flag == 0) {
            System.out.println("Contact Not Found");
        }
        return false;
    }
}
