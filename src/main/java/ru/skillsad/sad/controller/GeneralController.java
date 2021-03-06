package ru.skillsad.sad.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.skillsad.sad.domain.general.MainText;
import ru.skillsad.sad.repository.MainTextRepo;

@RestController
@RequestMapping("/api")
public class GeneralController {
    private final MainTextRepo mainTextRepo;

    public GeneralController(MainTextRepo mainTextRepo) {this.mainTextRepo = mainTextRepo;}

    @GetMapping(value = "/general", produces = MediaType.APPLICATION_JSON_VALUE)
    public MainText getGeneralText() {
        return mainTextRepo.getById(1L) == null
                ? new MainText("Нужно описание",1L)
                : mainTextRepo.getById(1L);
    }

    @GetMapping(value = "/contact")
    public MainText getContactText(){
        return mainTextRepo.getById(2L) == null
                ? new MainText("Нужно добавить контакты",2L)
                : mainTextRepo.getById(2L);
    }
}
