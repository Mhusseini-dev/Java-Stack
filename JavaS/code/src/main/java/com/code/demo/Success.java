package com.code.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
@Controller
public class Success {
    @RequestMapping(value="/success", method= RequestMethod.POST)
    public String success(@RequestParam(value="code") String code, RedirectAttributes errormsg) {
        if(code.equals("bushido")) {
            return "success.jsp";
        }
        else {
            errormsg.addFlashAttribute("error", "Nope! try again!");
            return "redirect:/";
        }
    }
}


