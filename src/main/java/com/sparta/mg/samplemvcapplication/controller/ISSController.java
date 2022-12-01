package com.sparta.mg.samplemvcapplication.controller;

import com.sparta.mg.samplemvcapplication.model.geolocation.GeoLocationResponse;
import com.sparta.mg.samplemvcapplication.model.iss.ISSResponse;
import com.sparta.mg.samplemvcapplication.service.Injector;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ISSController {

    @GetMapping("/iss")
    public static String welcome(Model model) {
        ISSResponse coordinates = Injector.getISSResponse();
        String latitude = coordinates.getIssPosition().getLatitude();
        String longitude = coordinates.getIssPosition().getLongitude();
        GeoLocationResponse location = Injector.getLocation(latitude, longitude);

        model.addAttribute("latitude", latitude);
        model.addAttribute("longitude", longitude);
        model.addAttribute("location", location.getDisplayName());
       return "view/index";
    }
}
