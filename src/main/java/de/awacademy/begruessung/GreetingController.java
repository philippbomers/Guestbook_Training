package de.awacademy.begruessung;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class GreetingController {

    private final GreetingService greetingService;

    @Autowired
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        model.addAttribute("greetingList", this.greetingService.getList());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@Valid @ModelAttribute Greeting greeting, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "greeting";
        }

        greetingService.addGreeting(greeting);
        model.addAttribute("greetingList", this.greetingService.getList());
        return "title";
    }

    @GetMapping("/{id}/detail")
    public String detail(Model model, @PathVariable long id) {
        model.addAttribute("greetingTitle", this.greetingService.getBeitrag(id));
        return "result";
    }
}
