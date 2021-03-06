package com.lookify.lookify.Controllers;

import com.lookify.lookify.Models.Song;
import com.lookify.lookify.Services.LookifyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class LookifyCtrl {
    private final LookifyService lookifyService;

    public LookifyCtrl(LookifyService lookifyService) {
        this.lookifyService = lookifyService;
    }

    @RequestMapping("/")
    public String index(Model model) {
        return "index.jsp";
    }

    @RequestMapping("/dashboard")
    public String dashboard(Model model) {
        List<Song> songs = lookifyService.allSongs();
        model.addAttribute("songs", songs);
        return "dashboard.jsp";
    }

    @RequestMapping("/songs/{id}")
    public String songs(@PathVariable("id") Long id, Model model) {
        Song song = lookifyService.findSong(id);
        model.addAttribute("song", song);
        return "song.jsp";
    }

    @RequestMapping("/songs/new")
    public String addNew(@ModelAttribute("addNew") Song song, Model model) {
        return "new.jsp";
    }

    @RequestMapping(value="/process", method=RequestMethod.POST)
    public String process(@Valid @ModelAttribute("addNew") Song song, BindingResult result, Model model) {
        if (result.hasErrors()) {
            List<Song> songs = lookifyService.allSongs();
            model.addAttribute("songs", songs);
            return "new.jsp";
        }
        else {
            lookifyService.addSong(song);
            return "redirect:/dashboard";
        }
    }

    @RequestMapping("/search/topten")
    public String topten(Model model) {
        List<Song> songs = lookifyService.getTopTen();
        model.addAttribute("songs", songs);
        return "topten.jsp";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        lookifyService.deleteSong(id);
        return "redirect:/dashboard";
    }

    @RequestMapping("/search/{artist}")
    public String search(@PathVariable("artist") String artist, Model model) {
        List<Song> songs = lookifyService.getSearchSongs(artist);
        model.addAttribute("artist", artist);
        model.addAttribute("songs", songs);
        return "search.jsp";
    }

    @PostMapping("/search")
    public String search(@RequestParam("artist") String artist) {
        return "redirect:/search/"+artist;
    }

}
