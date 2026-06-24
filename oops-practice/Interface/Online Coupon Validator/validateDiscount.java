interface CouponValidator {
    boolean validateCoupon(String code);

    static boolean isLengthValid(String code) {
        return code.length() >= 5 && code.length() <= 10;
    }
}

class ShoppingCart implements CouponValidator {
    @Override
    public boolean validateCoupon(String code) {
        // Example validation logic: valid if code starts with "SAVE" or "DISCOUNT"
        return code.startsWith("SAVE") || code.startsWith("DISCOUNT");
    }
}

public class validateDiscount {
    public static void main(String[] args) {
        String[] couponCodes = { "SAVE10", "DISCOUNT20", "INVALIDCODE", "FREESHIP" };

        ShoppingCart cart = new ShoppingCart();

        for (String code : couponCodes) {
            if (CouponValidator.isLengthValid(code)) {
                boolean isValid = cart.validateCoupon(code);
                System.out.println("Coupon code: " + code + " is " + (isValid ? "valid" : "invalid"));
            } else {
                System.out.println("Coupon code: " + code + " is invalid due to length.");
            }
        }
    }
}
