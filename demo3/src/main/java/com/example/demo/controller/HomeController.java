package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String paginaPrincipal() {
        return "Hello World";
    }
    @RequestMapping(value = {"/holaMundo", "/prueba", "test"}, method = RequestMethod.GET)
    public String holaMundo() {
        return "hola";
    }

















}
