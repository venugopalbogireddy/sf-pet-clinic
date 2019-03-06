package com.vb.sfpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by venugopal on 2019-03-06.
 */
@Controller
public class VetController {

    @RequestMapping({"/vets","/vets/index"})
    public String listVets() {
        return "vets/index";
    }
}
