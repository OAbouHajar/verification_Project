package cm;

import java.math.BigDecimal;

class ManagementRate implements KindPrice {

    @Override
    public BigDecimal calculate(BigDecimal cost) {
        BigDecimal MANAGEMENTMinimumPayable = new BigDecimal("3");
        if (cost.compareTo(MANAGEMENTMinimumPayable) == -1)  return MANAGEMENTMinimumPayable;
        else return cost;
    }

}
