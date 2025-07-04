package pl.merito.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ArithmeticCalculatorController {

    @GetMapping("/calculate")
    public String calculator(@RequestParam double a, @RequestParam double b, @RequestParam String operation, Model model) {

        double result = 0.0;

        switch (operation){
            case "+" -> result = a + b;
            case "-" -> result = a - b;
            case "*" -> result = a * b;
            case "/" -> {
                if(b == 0) {
                    model.addAttribute("errorMessage", "Nie można dzielić przez 0");
                    return "calculator";
                }
                result = a / b;
            }
        }

        model.addAttribute("result", result);

        return "calculator";
    }
}


