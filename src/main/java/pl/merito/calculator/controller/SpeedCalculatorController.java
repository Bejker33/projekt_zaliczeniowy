package pl.merito.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SpeedCalculatorController {

    @GetMapping("/speed-calculate")
    public String calculateSpeed(
            @RequestParam(required = false) Double distance,
            @RequestParam(required = false) Double time,
            @RequestParam(required = false) Double speed,
            @RequestParam String calculate, // "speed", "time", "distance"
            Model model) {

        if (distance != null && time != null && "speed".equals(calculate)) {
            speed = distance / time;
        } else if (distance != null && speed != null && "time".equals(calculate)) {
            time = distance / speed;
        } else if (speed != null && time != null && "distance".equals(calculate)) {
            distance = speed * time;
        }

        model.addAttribute("distance", distance);
        model.addAttribute("time", time);
        model.addAttribute("speed", speed);
        return "speed_calculator";
    }
}

