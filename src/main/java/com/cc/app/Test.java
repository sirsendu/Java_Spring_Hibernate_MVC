package com.cc.app;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cc.app.service.NameService;

@Controller
public class Test {
    
    @Autowired
    NameService nameService;
    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {       
        model.addAttribute("myName", "My Name Is :" + nameService.getMyName() );
        return "home";
    }

}
