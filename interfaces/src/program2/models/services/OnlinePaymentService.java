package program2.models.services;

public interface OnlinePaymentService {
    double paymentFee(Double amount);

    double interest(Double amount, Integer months);
}
