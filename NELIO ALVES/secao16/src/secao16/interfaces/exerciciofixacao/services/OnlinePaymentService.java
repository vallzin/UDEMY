package secao16.interfaces.exerciciofixacao.services;

public interface OnlinePaymentService {
	
	double paymentFee(double amount);
	double interest(double amount, int months);

}
