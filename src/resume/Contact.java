package resume;

/**
 * Created by 1 on 21.06.2014.
 */
public class Contact {

    String type;
    String contact;

    public Contact(String type, String contact) {
        this.type = type;
        this.contact = contact;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
