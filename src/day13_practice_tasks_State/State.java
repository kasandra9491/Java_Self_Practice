package day13_practice_tasks_State;

public class State {
    private String name;
    private String abreviation;
    private String politicalParty;
    private String governor;
    private String senator;
    private int population;

    public State(String name, String abreviation, String politicalParty, String governor, String senator, int population) {
        setName(name);
        setAbreviation(abreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            System.err.println("Name can not be null, empty or blank " + name);
            System.exit(1);
        }
        this.name = name;
    }

    public String getAbreviation() {
        return abreviation;
    }

    public void setAbreviation(String abreviation) {
        if (abreviation == null || abreviation.isEmpty() || abreviation.isBlank()) {
            System.err.println("Abbreviation can not be null, empty or blank " + abreviation);
            System.exit(1);
        }
        this.abreviation = abreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if (politicalParty== null || politicalParty.isEmpty() || politicalParty.isBlank()) {
            System.err.println("Political party can not be null, empty or blank " + politicalParty);
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        if (governor == null || governor.isEmpty() || governor.isBlank()) {
            System.err.println("Governor can not be null, empty or blank " + governor);
            System.exit(1);
        }
        this.governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if (senator == null || senator.isEmpty() || senator.isBlank()) {
            System.err.println("Senator can not be null, empty or blank " + senator);
            System.exit(1);
        }
        this.senator = senator;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if (population < 0){
            System.err.println("Population can not be negative " + population);
            System.exit(1);
        }
        this.population = population;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", abreviation='" + abreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                '}';
    }
}


