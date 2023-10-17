package factoryMethod;

import java.math.BigDecimal;

public abstract class CareForHire {
    private double distance;
    protected BigDecimal rate;
    private BigDecimal charge;

    public abstract BigDecimal getRate();
    public BigDecimal calculateCharge(double distance, BigDecimal rate){
        charge = rate.multiply(BigDecimal.valueOf(distance));
        return charge;
    }

}
