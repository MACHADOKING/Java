package program5.entities;

public class LegalPerson extends Person {
    private Integer numberEmployees;

    public LegalPerson() {
        super();
    }

    public LegalPerson(String name, Double anualIncome, Integer numberEmployees) {
        super(name, anualIncome);
        this.numberEmployees = numberEmployees;
    }

    public Integer getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(Integer numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    @Override
    public Double tax() {
        if (numberEmployees > 10) {
            return getAnualIncome() * 0.14;
        } else {
            return getAnualIncome() * 0.16;
        }
    }
}
