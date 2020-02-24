package defination;

import java.util.ArrayList;


public class manage {
    private static ArrayList conlist = new ArrayList<>();

    public static ArrayList getConlist() {
        return conlist;
    }

    public static void setConlist(ArrayList conlist) {
        manage.conlist.add(conlist);
    }

    public static void removeContact(int index) {
        manage.conlist.remove(index);
    }
}