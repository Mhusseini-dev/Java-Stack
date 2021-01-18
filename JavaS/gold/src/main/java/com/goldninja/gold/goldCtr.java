package com.goldninja.gold;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.concurrent.ThreadLocalRandom;

@Controller
public class goldCtr {
    @RequestMapping(value = "/process", method = RequestMethod.POST)
    public String process(@RequestParam("place") String place, HttpSession session) {

        if (place.equals("khara")) {
            int num = ThreadLocalRandom.current().nextInt(10, 20);
            int gold = (int) session.getAttribute("gold");
            session.setAttribute("gold", gold + num);
        }
        return "redirect:/";


    }
}
