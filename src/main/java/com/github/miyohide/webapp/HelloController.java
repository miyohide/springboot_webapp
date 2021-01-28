package com.github.miyohide.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Optional;

@Controller
public class HelloController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        Optional<String> guid = Optional.ofNullable(System.getenv("CF_INSTANCE_GUID"));
        model.addAttribute("instance_guid", guid.orElse("CF_INSTANCE_GUID is null"));
        return "index";
    }
}
