package com.refactoring.Etapa3;

public class PriceCalculator {

    private static final double DISCOUNT_REGULAR_CUSTOMER = 0.10;
    private static final double DISCOUNT_PREMIUM_CUSTOMER = 0.15;
    private static final double DISCOUNT_HOLIDAY = 0.05;

    public double calculateFinalPrice(double basePrice, CustomerType customer, boolean isHoliday) {
        double customerDiscount = getCustomerDiscount(customer);
        double holidayDiscount  = isHoliday ? DISCOUNT_HOLIDAY : 0;
        double totalDiscount    = customerDiscount + holidayDiscount;

        return applyDiscount(basePrice, totalDiscount);
    }

    /** Retorna o desconto associado a cada tipo de cliente. */
    private double getCustomerDiscount(CustomerType customer) {
        switch (customer) {
            case REGULAR:
                return DISCOUNT_REGULAR_CUSTOMER;
            case PREMIUM:
                return DISCOUNT_PREMIUM_CUSTOMER;
            default:
                return 0;
        }
    }

    /** Aplica o desconto sobre o preço base. */
    private double applyDiscount(double price, double discountRate) {
        return price * (1 - discountRate);
    }
}
