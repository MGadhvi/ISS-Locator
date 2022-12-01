package com.sparta.mg.samplemvcapplication.service;

import com.sparta.mg.samplemvcapplication.model.geolocation.GeoLocationResponse;
import com.sparta.mg.samplemvcapplication.model.iss.ISSResponse;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

public class Injector {
    private static final RestTemplate restTemplate = new RestTemplate();
    public static ISSResponse getISSResponse() {
        try {
            return restTemplate.getForObject(new URI("http://api.open-notify.org/iss-now.json"), ISSResponse.class);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
    public static GeoLocationResponse getLocation(String latitude, String longitude) {
        try {
            return restTemplate.getForObject(new URI("https://geocode.maps.co/reverse?lat=" + latitude + "&lon=" +longitude), GeoLocationResponse.class);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
