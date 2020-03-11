package cm;

import java.math.BigDecimal;

class StaffRate implements IReductionRates {

    @Override
    public BigDecimal calculate(BigDecimal cost) {
        BigDecimal stuffMaximumPayable = new BigDecimal("16");
        if (cost.compareTo(stuffMaximumPayable) >= 0) return  stuffMaximumPayable;
        else return cost;
    }

}
