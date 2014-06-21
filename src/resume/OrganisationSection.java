package resume;

import java.util.Collection;

/**
 * Created by 1 on 21.06.2014.
 */
public class OrganisationSection extends Section {

    Collection<Organisation> organisations;

    public OrganisationSection(String type, Collection<Organisation> organisations) {
        super(type);
        this.organisations = organisations;
    }

    public void setOrganisation(Organisation organisation) {
        this.organisations.add(organisation);
    }
}
