package challenge;

public enum DiscountPerson {
    국가유공자(0.1),
    군인(0.05),
    학생(0.03),
    일반(0.0);

    private final double discountRate;
    DiscountPerson(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }
}
