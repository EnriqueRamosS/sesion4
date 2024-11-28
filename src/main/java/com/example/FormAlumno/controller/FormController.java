
package com.example.FormAlumno.controller;


import com.example.FormAlumno.model.Alumno;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {
    @GetMapping("/form")
    public String showForm(Model model){
        model.addAttribute("user",new Alumno());
        return "form";
    }
    @PostMapping("/submit")
    public String submitForm(@ModelAttribute Alumno user,Model model){
        model.addAttribute("user", user);
        return "success";
    }
}
