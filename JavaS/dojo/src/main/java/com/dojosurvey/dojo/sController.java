package com.dojosurvey.dojo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class sController {
    @RequestMapping("/")
    public String survey() {
        return "survey.jsp";
    }
}


