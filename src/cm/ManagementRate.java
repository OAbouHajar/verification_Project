package cm;

import java.math.BigDecimal;

class ManagementRate implements IKindPrice {

    @Override
    public BigDecimal calculate(BigDecimal cost) {
        BigDecimal ManagmentMinimumPayable = new BigDecimal("3");
        if (cost.compareTo(ManagmentMinimumPayable) == -1)  return ManagmentMinimumPayable;
        else return cost;
    }

}
