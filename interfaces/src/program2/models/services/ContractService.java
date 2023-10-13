package program2.models.services;

import java.time.LocalDate;

import program2.models.entities.Contract;
import program2.models.entities.Installment;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {

        double basicQuota = contract.getContractTotal() / months;

        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getContractDate().plusMonths(i);

            double interest = onlinePaymentService.interest(basicQuota, i);
            double fee = onlinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;

            contract.getInstalments().add(new Installment(dueDate, quota));
        }
    }
}
