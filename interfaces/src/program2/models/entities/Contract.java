package program2.models.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private Integer numberOfContract;
    private LocalDate contractDate;
    private Double contractTotal;

    private List<Installment> installments = new ArrayList<>();

    public Contract(Integer numberOfContract, LocalDate contractDate, Double contractTotal) {
        this.numberOfContract = numberOfContract;
        this.contractDate = contractDate;
        this.contractTotal = contractTotal;
    }

    public Integer getNumberOfContract() {
        return numberOfContract;
    }

    public LocalDate getContractDate() {
        return contractDate;
    }

    public Double getContractTotal() {
        return contractTotal;
    }

    public void setNumberOfContract(Integer numberOfContract) {
        this.numberOfContract = numberOfContract;
    }

    public void setContractDate(LocalDate contractDate) {
        this.contractDate = contractDate;
    }

    public void setContractTotal(Double contractTotal) {
        this.contractTotal = contractTotal;
    }

    public List<Installment> getInstalments() {
        return installments;
    }
}
