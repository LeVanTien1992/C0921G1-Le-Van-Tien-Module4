package vn.codegym.controller;

import org.hibernate.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.model.Music;
import vn.codegym.service.MusicService;

import javax.management.MalformedObjectNameException;
import java.util.List;

@Controller
public class MusicController {
    @Autowired
    private MusicService musicService;

    @GetMapping(value = "/")
    public String listMusic(Model model){
        List<Music> musicList = musicService.findAll();
        model.addAttribute("musicList", musicList);
        return "list";
    }

    @GetMapping(value = "/createForm")
    public String formCreate( Model model){
        Music music = new Music();
        model.addAttribute("music", music);
        return "create";
    }

    @PostMapping(value = "/create")
    public String createMusic(@ModelAttribute Music music,
                              RedirectAttributes redirectAttributes){
        musicService.save(music);
        redirectAttributes.addFlashAttribute("message","create music " +music.getSinger()+" success");
        return "redirect:/";
    }

    @GetMapping(value = "/formUpdate/{id}")
    public String formUpdate(@PathVariable int id, Model model){
        Music music = musicService.findById(id);
        model.addAttribute("music", music);
        return "update";
    }

    @PostMapping(value = "/update")
    public String updateMusic(@ModelAttribute Music music,
                              RedirectAttributes redirectAttributes){
        musicService.save(music);
        redirectAttributes.addFlashAttribute("message", "update music " +music.getSinger()+" success");
        return "redirect:/";
    }

    @GetMapping(value = "/delete/{id}")
    public String formDelete(@PathVariable int id, RedirectAttributes redirectAttributes){
        musicService.remove(id);
        redirectAttributes.addFlashAttribute("message", "Are you sure to delete music, is that right?");
        return "redirect:/";
    }

}
