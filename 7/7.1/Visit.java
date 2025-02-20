public class Visit {
    private Customer customer;
    private double serviceExpense;
    private double productExpense;

    // Constructor
    public Visit(Customer customer) {
        this.customer = customer;
        this.serviceExpense = 0.0;
        this.productExpense = 0.0;
    }

    // Getters and setters for expenses
    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    // Calculate total expense after applying discounts
    public double getTotalExpense() {
        double serviceDiscount = DiscountRate.getServiceDiscountRate(customer.getMembership());
        double productDiscount = DiscountRate.getProductDiscountRate();

        double discountedServiceExpense = serviceExpense * (1 - serviceDiscount);
        double discountedProductExpense = productExpense * (1 - productDiscount);

        return discountedServiceExpense + discountedProductExpense;
    }

    @Override
    public String toString() {
        return "Visit[Customer=" + customer + ", Service Expense=" + serviceExpense + 
               ", Product Expense=" + productExpense + ", Total after Discount=" + getTotalExpense() + "]";
    }
}
