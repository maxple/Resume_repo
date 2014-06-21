package resume;

import java.util.Collection;

/**
 * Created by 1 on 21.06.2014.
 */
public class Organisation {

    Link organisation;
    Collection<Period> periods;

    public Organisation(Link organisation, Period period) {
        this.organisation = organisation;
        this.periods.add(period);
    }

    public Link getOrganisation() {
        return organisation;
    }

    public void setOrganisation(Link organisation) {
        this.organisation = organisation;
    }

    public void setPeriod(Period period) {
        this.periods.add(period);
    }
}
