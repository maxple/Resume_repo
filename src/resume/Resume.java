package resume;

import java.util.Collection;

/**
 * Created by pletnyov
 */
public class Resume {

    String fullName;
    String location;
    String homePage;

    Collection<Contact> contacts;

    Collection<Section> sections;

    public Resume(String fullName, String location, String homePage, Contact contact, Section section) {
        this.fullName = fullName;
        this.location = location;
        this.homePage = homePage;
        this.contacts.add(contact);
        this.sections.add(section);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public void setContact(Contact contact) {
        this.contacts.add(contact);
    }

    public void setSection(Section section) {
        this.sections.add(section);
    }
}
