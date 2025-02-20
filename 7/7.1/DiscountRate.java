public class DiscountRate {
    private static final double SERVICE_DISCOUNT_PREMIUM = 0.2;
    private static final double SERVICE_DISCOUNT_GOLD = 0.15;
    private static final double SERVICE_DISCOUNT_SILVER = 0.1;
    private static final double PRODUCT_DISCOUNT = 0.1; // Flat rate for all members

    // Get discount rate for services based on membership type
    public static double getServiceDiscountRate(String membershipType) {
        switch (membershipType.toLowerCase()) {
            case "premium":
                return SERVICE_DISCOUNT_PREMIUM;
            case "gold":
                return SERVICE_DISCOUNT_GOLD;
            case "silver":
                return SERVICE_DISCOUNT_SILVER;
            default:
                return 0.0; // No discount for non-members
        }
    }

    // Get discount rate for products
    public static double getProductDiscountRate() {
        return PRODUCT_DISCOUNT;
    }
}
