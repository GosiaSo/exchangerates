package pl.sobocinska.exchangerates.exchange;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@AllArgsConstructor
public class RateController {

    private final ExchangeRate exchangeRate;

    @GetMapping("/")
    @ResponseBody
    public String getConcurencyTable(){
        exchangeRate.getDataFromTable();
        return "........";
    }
}
