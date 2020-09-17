package pl.sobocinska.exchangerates.exchange;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@ToString
public class RateDto {

    private String currency;
    private String code;
    private BigDecimal mid;
}
