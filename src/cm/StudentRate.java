package cm;

import java.math.BigDecimal;

class StudentRate implements IReductionRates {

    @Override
    public BigDecimal calculate(BigDecimal cost) {
        BigDecimal studentNotReducedAmount = new BigDecimal("5.50");
        BigDecimal studentReduction = new BigDecimal("0.25");
        if (cost.compareTo(studentNotReducedAmount) <= 0) return cost;
        else return ((cost.subtract(studentNotReducedAmount).multiply(studentReduction).add(studentNotReducedAmount)));

    }


}
