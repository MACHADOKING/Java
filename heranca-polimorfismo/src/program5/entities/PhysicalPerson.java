package program5.entities;

public class PhysicalPerson extends Person {
    private Double healthExpendities;

    public PhysicalPerson() {
        super();
    }

    public PhysicalPerson(String name, Double anualIncome, Double healExpendities) {
        super(name, anualIncome);
        this.healthExpendities = healExpendities;
    }

    public Double getHealExpendities() {
        return healthExpendities;
    }

    public void setHealthExpendities(Double healthExpendities) {
        this.healthExpendities = healthExpendities;
    }

    @Override
    public Double tax() {
        // double basicTax = (getAnualIncome() < 20000.0) ? getAnualIncome() * 0.15 :
        // getAnualIncome() * 0.25;
        double basicTax;
        if (getAnualIncome() < 20000.0) {
            basicTax = getAnualIncome() * 0.15;
        } else {
            basicTax = getAnualIncome() * 0.25;
        }
        basicTax -= getHealExpendities() * 0.5;
        if (basicTax < 0.0) {
            basicTax = 0.0;
        }
        return basicTax;
    }
}
