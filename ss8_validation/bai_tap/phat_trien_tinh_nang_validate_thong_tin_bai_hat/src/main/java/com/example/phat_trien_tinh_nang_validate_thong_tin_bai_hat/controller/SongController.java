package com.example.phat_trien_tinh_nang_validate_thong_tin_bai_hat.controller;

import com.example.phat_trien_tinh_nang_validate_thong_tin_bai_hat.model.Song;
import com.example.phat_trien_tinh_nang_validate_thong_tin_bai_hat.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class SongController {

    @Autowired
    private SongService songService;

    @GetMapping(value = "/")
    public String listSong(Model model){
        model.addAttribute("songList", songService.findAll());
        return "list";
    }

    @GetMapping(value = "/createForm")
    public String showFormCreate(Model model){
        model.addAttribute("song", new Song());
        return "create";
    }

    @PostMapping(value = "/create")
    public String createSong( @ModelAttribute @Valid Song song,
                             BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "create";
        }else {
            songService.save(song);
            return "redirect:/";
        }

    }

    @GetMapping(value = "/updateForm/{id}")
    public String showFormUpdate(@PathVariable Long id, Model model){
        Song song = songService.findById(id);
        model.addAttribute("song", song);
        return "update";
    }


    @PostMapping(value = "/update")
    public String updateSong(@ModelAttribute Song song,
                             RedirectAttributes redirectAttributes){
        songService.save(song);
        redirectAttributes.addFlashAttribute("message", "Create a song " +song.getName()+" success");
        return "redirect:/";
    }
}
