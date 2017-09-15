package com.pbd1.proybd.web.controller;

import com.pbd1.proybd.service.DevolucionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by carloscubur on 8/09/17.
 */

@Controller
public class DevolucionesController extends BaseController{

    @Autowired
    private DevolucionesService devolucionesService;


    //Todos los metodos en las paginas que va a controlar esta clase

    //carga el listado con el metodo findall()
    @RequestMapping("/devoluciones")
    public ModelAndView devolucionesInicio(){
        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("devoluciones", devolucionesService.getDevoluciones());
        return new ModelAndView("devolucion/devolucion",modelMap);
    }

}
