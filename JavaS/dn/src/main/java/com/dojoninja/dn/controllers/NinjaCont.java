package com.dojoninja.dn.controllers;

import com.dojoninja.dn.models.Ninja;
import com.dojoninja.dn.services.DojoNinjaServ;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class NinjaCont {
    private final DojoNinjaServ dojoNinjaServ;

    public NinjaCont(DojoNinjaServ dojoNinjaServ) {
        this.dojoNinjaServ = dojoNinjaServ;
    }

    @RequestMapping("/")
    public String index(){
        return "dojo.jsp";
    }

    @GetMapping("/ninjas/new")
    public String newNinja(@ModelAttribute("ninjaObject") Ninja Ninja, Model model) {
        model.addAttribute("dojos", dojoNinjaServ.getAllDojos());
        return "ninja.jsp";
    }

    @PostMapping("/addninja")
    public String addNinja(@Valid @ModelAttribute("ninjaObject") Ninja ninja, BindingResult result) {
        if(result.hasErrors()) {
            return "ninja.jsp";
        }
        else {
            dojoNinjaServ.addNinja(ninja);
            return "redirect:/dojos/" + ninja.getDojo().getId() ;
        }
    }
}
