package com.zaorish.newsbot.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zaorish on 4/27/14.
 */
@Controller
public class HomeController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private DateProvider dateProvider;

    @Autowired
    public HomeController(DateProvider dateProvider) {
        this.dateProvider = dateProvider;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) {
        logger.info("Welcome home!");
        model.addAttribute("serverTime", dateProvider.provideDate());
        return "home";
    }

}
