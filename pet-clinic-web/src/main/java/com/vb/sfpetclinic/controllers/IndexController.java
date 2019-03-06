package com.vb.sfpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by venugopal on 2019-03-06.
 */
@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String index() {
        return "index";
    }
}
