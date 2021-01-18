package com.goldninja.gold;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class mainC {
    @RequestMapping("/")
    public String main(HttpSession session){
        if(session.getAttribute("gold")==null){
        session.setAttribute("gold",0);
        }
        return "index.jsp";

    }
}
