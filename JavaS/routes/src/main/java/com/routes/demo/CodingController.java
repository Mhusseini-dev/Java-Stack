package com.routes.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class CodingController {
        @RequestMapping("{place}")
        public String dojo(@PathVariable("place") String place) {
            if(place.equals("dojo")) {
                return "The Dojo is awesome!";
            }
            if(place.equals("burbank-dojo")) {
                return "Burbank Dojo is located in Southern California.";
            }
            if(place.equals("san-jose")) {
                return "DJ dojo is the headquarters.";
            }
            return "";
        }
    }


