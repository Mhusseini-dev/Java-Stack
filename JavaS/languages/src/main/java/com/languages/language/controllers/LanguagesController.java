package com.languages.language.controllers;

import com.languages.language.models.Language;
import com.languages.language.services.LanguagesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

@Controller
public class LanguagesController {
    private final LanguagesService languageService;
    public LanguagesController(LanguagesService service) {

        languageService = service;
    }
    @RequestMapping("/")
    public String Index(Model model) {
        model.addAttribute("languages", languageService.allLanguages());
        return "index.jsp";
    }
    @RequestMapping("/{id}")
    public String Show(@PathVariable("id") Long id, Model model) {
        model.addAttribute("language", languageService.findLanguage(id));
        return "show.jsp";
    }
    @RequestMapping("/new")
    public String New(@ModelAttribute("language") Language language) {
        return "new.jsp";
    }
    @RequestMapping(value="/", method= RequestMethod.POST)
    public String Create(@Valid @ModelAttribute("language") Language lang, BindingResult result, @RequestParam Map<String,String> body) {
        if(result.hasErrors())
            return "new.jsp";
        languageService.createLanguage(lang);
        return "redirect:/";
    }
    @RequestMapping("/{id}/edit")
    public String Edit(@PathVariable("id") Long id, Model model) {
        model.addAttribute("language", languageService.findLanguage(id));
        return "edit.jsp";
    }
    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
    public String Update(@Valid @ModelAttribute("language") Language lang, BindingResult result) {
        if(result.hasErrors())
            return "edit.jsp";
        languageService.updateLanguage(lang);
        return "redirect:/";
    }
    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public String Delete(@PathVariable("id") Long id) {
        languageService.deleteLanguage(id);
        return "redirect:/";
    }
}
