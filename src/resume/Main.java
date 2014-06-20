package resume;

/**
 * Created by pletnyov on 19.06.2014.
 */
public class Main {

    public static void main(String[] args) {

        Resume r = new Resume();

        r.fullName = "Ivan Ivanov";

        r.contacts.put("Mobile phone", "+79111234567");

        r.contacts.put("Home page", "www.ivan.ivanov.ru");

        r.targetObjective.title = "Senior Java Developer";
        r.targetObjective.description = "WEB, Desktop";

        r.achievements.addItem("", "Development/design Java training for programmers");
        r.achievements.addItem("", "Development and continious integration processes setup for ERP system River BPM");

        r.qualifications.addItem("JEE AS", "GlassFish (v2.1, v3); OC4J; JBoss; Tomcat; Jetty, WebLogic, WSO2");
        r.qualifications.addItem("Version control", "Subversion; Mercury; ClearCase; Perforce, Git");

        r.institutions.addItem("Institute of Fine Mechanics & Optics (Technical University)");
        r.institutions.addItem("Alcatel");
        r.institutions.addItem("Siemens AG");

        r.experienceLifePeriods.addItem(r.institutions.items.get(1), "Software test Engineer",
                "Testing, debugging and integration of software for public network",
                1, 1997, 1, 1998);

        r.experienceLifePeriods.addItem(r.institutions.items.get(1), "Advanced Software test Engineer",
                "Advanced testing, debugging and integration of software for public network",
                1, 1998, 1, 2005);

        r.experienceLifePeriods.addItem(r.institutions.items.get(2), "Java developer",
                "Requirements specification analysis, project specifications developing/ support",
                1, 2005, 2, 2007);

        r.educationLifePeriods.addItem(r.institutions.items.get(0), "", "master of science", 9, 1987, 6, 1993);
    }
}
