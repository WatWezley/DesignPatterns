package factoryMethod;

import factoryMethod.CareForHire;

import java.math.BigDecimal;

public class HireForBurial extends CareForHire {

    @Override
    public BigDecimal getRate() {
        rate = BigDecimal.valueOf(8.50);
        return rate;
    }
}
