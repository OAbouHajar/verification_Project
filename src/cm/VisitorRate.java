package cm;

import java.math.BigDecimal;

class VisitorRate implements KindPrice {

    @Override
    public BigDecimal calculate(BigDecimal cost) {
        BigDecimal visitorFreeAmount = new BigDecimal("8");
        BigDecimal visitorReductionAmount = new BigDecimal("0.50");
        if (cost.compareTo(visitorFreeAmount) == -1) return BigDecimal.ZERO;
        else return ((cost.subtract(visitorFreeAmount)).multiply(visitorReductionAmount));
    }

}
