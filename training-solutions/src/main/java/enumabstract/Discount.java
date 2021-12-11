package enumabstract;

public enum Discount {
    SPECIAL_OFFER {
        @Override
        public double getAmountToPay(int price, int pieces) {
            return pieces * price * 0.8;
        }
    },
    BLACK_FRIDAY_OFFER {
        @Override
        public double getAmountToPay(int price, int pieces) {
            if (pieces == 1 || pieces == 2) {
                return 0.75 * (pieces * price);
            } else if (pieces >= 3) {
                return (0.75 * pieces - 0.25) * price;
            }
            return 0;
        }
    };

    public abstract double getAmountToPay(int price, int pieces);
}
