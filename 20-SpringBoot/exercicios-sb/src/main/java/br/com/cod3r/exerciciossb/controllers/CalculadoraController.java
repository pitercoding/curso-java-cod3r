package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/calculadora")
public class CalculadoraController {

    // /calculadora/somar/10/20
    @GetMapping(path = "/somar/{a}/{b}")
    public int Soma(@PathVariable int a, @PathVariable int b) {
        return a + b;
    }

    // /calculadora/subtrair?a=100&b=39
    @GetMapping(path = "/subtrair")
    public int Subtrair(
            @RequestParam(name = "a") int a,
            @RequestParam(name = "b") int b) {
        return a - b;
    }

}
