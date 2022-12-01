package com.sparta.mg.samplemvcapplication.model.geolocation;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address{

    @JsonProperty("country")
    private String country;

    @JsonProperty("country_code")
    private String countryCode;

    @JsonProperty("state")
    private String state;

    public String getCountry(){
        return country;
    }

    public String getCountryCode(){
        return countryCode;
    }

    public String getState(){
        return state;
    }
}