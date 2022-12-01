package com.sparta.mg.samplemvcapplication.model.geolocation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sparta.mg.samplemvcapplication.model.geolocation.Address;

public class GeoLocationResponse{

    @JsonProperty("osm_type")
    private String osmType;

    @JsonProperty("osm_id")
    private Integer osmId;

    @JsonProperty("licence")
    private String licence;

    @JsonProperty("boundingbox")
    private List<String> boundingbox;

    @JsonProperty("address")
    private Address address;

    @JsonProperty("powered_by")
    private String poweredBy;

    @JsonProperty("lon")
    private String lon;

    @JsonProperty("display_name")
    private String displayName;

    @JsonProperty("place_id")
    private Integer placeId;

    @JsonProperty("lat")
    private String lat;

    public String getOsmType(){
        return osmType;
    }

    public Integer getOsmId(){
        return osmId;
    }

    public String getLicence(){
        return licence;
    }

    public List<String> getBoundingbox(){
        return boundingbox;
    }

    public Address getAddress(){
        return address;
    }

    public String getPoweredBy(){
        return poweredBy;
    }

    public String getLon(){
        return lon;
    }

    public String getDisplayName(){
        return displayName;
    }

    public Integer getPlaceId(){
        return placeId;
    }

    public String getLat(){
        return lat;
    }
}