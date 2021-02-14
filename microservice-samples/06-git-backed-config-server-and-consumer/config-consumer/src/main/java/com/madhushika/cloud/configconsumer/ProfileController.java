package com.madhushika.cloud.configconsumer;

import com.madhushika.cloud.configconsumer.model.MemberConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfileController {
    @Autowired
    MemberConfiguration memberProfileConfiguration;


    @RequestMapping("/profile")
    public String getConfig(Model model) {

        model.addAttribute("max", memberProfileConfiguration.getDefaultModel());
        model.addAttribute("min", memberProfileConfiguration.getMinRentPeriod());
        return "mprofile";
    }
}
