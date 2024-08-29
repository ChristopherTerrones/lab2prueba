package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping(value = "/empleados", method = RequestMethod.GET)
public class EmpleadoController {
    @RequestMapping( value = "", method = RequestMethod.GET)
    public String listaEmpleados(){
        return "empleados/index";
    }
    @RequestMapping(value = "/crearFrm", method = RequestMethod.GET)
    public String formularioCrearEmpleado(){
        return "empleados/crear";
    }
    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    public String guardarEmpleado(){
        return "redirect:/empleados";
    }
}
