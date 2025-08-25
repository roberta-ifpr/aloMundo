package br.ifpr.aloMundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping
public class AloMundoController {

   
    @GetMapping("/aloMundo")
    public String aloMundoString(){
        return "Alo Mundo de novo!!!";
    }

    @GetMapping("/")
    public String aloMundoHome(){
        return "Alo Mundo na home!!!";
    }





}
