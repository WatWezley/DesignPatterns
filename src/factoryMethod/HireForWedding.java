package factoryMethod;

import java.math.BigDecimal;

public class HireForWedding extends CareForHire {
    @Override
    public BigDecimal getRate() {
        rate = BigDecimal.TEN;
        return rate;
    }
}
