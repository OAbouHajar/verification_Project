package cm;

import java.math.BigDecimal;

class ManagementRate implements IReductionRates {

    @Override
    public BigDecimal reduction(BigDecimal cost) {
        BigDecimal ManagmentMinimumPayable = new BigDecimal("3");
        if (cost.compareTo(ManagmentMinimumPayable) == -1)  return ManagmentMinimumPayable;
        else return cost;
    }

}
