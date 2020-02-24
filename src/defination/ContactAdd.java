package defination;

import adt.NewContact;

import java.util.ArrayList;

public class ContactAdd implements NewContact {

    @Override
    public boolean newContact(String Firstname, String Lastname, ArrayList MobileNO, String Email) {
        ArrayList contact = new ArrayList();
        contact.add(Firstname);
        contact.add(Lastname);
        for (int i = 0; i < MobileNO.size(); i++) {
            contact.add(MobileNO.get(i));
        }
        contact.add(Email);
        manage.setConlist(contact);
        return true;

    }
}
