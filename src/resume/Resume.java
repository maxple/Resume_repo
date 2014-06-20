package resume;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by pletnyov on 19.06.2014.
 */
public class Resume {

    String fullName;

    HashMap<String, String> contacts;

    TitleDescription targetObjective;

    SkillsList achievements;
    SkillsList qualifications;
    InstitutionsList institutions;
    LifePeriodsList experienceLifePeriods;
    LifePeriodsList educationLifePeriods;

    public Resume() {

        contacts = new HashMap<String, String>();
        targetObjective = new TitleDescription();
        achievements = new SkillsList();
        qualifications = new SkillsList();
        institutions = new InstitutionsList();
        experienceLifePeriods = new LifePeriodsList();
        educationLifePeriods = new LifePeriodsList();
    }
}

class SkillsList {

    ArrayList<TitleDescription> items;

    public SkillsList() {

        items = new ArrayList<TitleDescription>();
    }

    private TitleDescription s;

    private void prepare(String name, String description) {

        s = new TitleDescription();

        s.title = name;
        s.description = description;
    }

    void addItem(String name, String description) {

        prepare(name, description);

        items.add(s);
    }

    void setItem(int index, String name, String description) {

        prepare(name, description);

        items.set(index, s);
    }
}

class InstitutionsList {

    ArrayList<String> items;

    public InstitutionsList() {

        items = new ArrayList<String>();
    }

    void addItem(String institution) {

        items.add(institution);
    }

    void setItem(int index, String institution) {

        items.set(index, institution);
    }
}

class LifePeriodsList {

    ArrayList<LifePeriod> items;

    public LifePeriodsList() {

        items = new ArrayList<LifePeriod>();
    }

    private LifePeriod lp;

    private void prepare(String institution, String objectiveName, String objectiveDescription,
                         int firstMonth, int firstYear, int lastMonth, int lastYear) {

        lp = new LifePeriod();

        lp.institution = institution;
        lp.objective.title = objectiveName;
        lp.objective.description = objectiveDescription;

        lp.firstMonth = firstMonth;
        lp.firstYear = firstYear;
        lp.lastMonth = lastMonth;
        lp.lastYear = lastYear;
    }

    void addItem(String institution, String objectiveName, String objectiveDescription,
                 int firstMonth, int firstYear, int lastMonth, int lastYear) {

        prepare(institution, objectiveName, objectiveDescription, firstMonth, firstYear, lastMonth, lastYear);

        items.add(lp);
    }

    void setItem(int index, String institution, String objectiveName, String objectiveDescription,
                 int firstMonth, int firstYear, int lastMonth, int lastYear) {

        prepare(institution, objectiveName, objectiveDescription, firstMonth, firstYear, lastMonth, lastYear);

        items.set(index, lp);
    }
}

class TitleDescription {

    String title;
    String description;
}

class LifePeriod {

    String institution;
    TitleDescription objective;

    int firstYear;
    int lastYear;
    int firstMonth;
    int lastMonth;

    public LifePeriod() {

        objective = new TitleDescription();
    }
}
