// 1. A hospital billing system must never crash. Wrap division-by-zero
// (bills with zero items), array out-of-bounds (invalid patient index),
// and number format exceptions (bad input) with meaningful
// messages. Create a custom InsufficientFundsException for payment
// failures.
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

