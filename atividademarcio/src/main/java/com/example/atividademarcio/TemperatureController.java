package com.example.atividademarcio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemperatureController {

    @GetMapping("/celsiusParaFahrenheit")
    public String celsiusParaFahrenheit(@RequestParam double grau) {
        double fahrenheit = (grau * 9/5) + 32;
        return grau + " Celsius é igual a " + fahrenheit + " Fahrenheit";
    }

    @GetMapping("/fahrenheitParaCelsius")
    public String fahrenheitParaCelsius(@RequestParam double grau) {
        double celsius = (grau - 32) * 5/9;
        return grau + " Fahrenheit é igual a " + celsius + " Celsius";
    }
}
