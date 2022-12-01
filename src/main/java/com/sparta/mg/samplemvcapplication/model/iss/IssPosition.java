package com.sparta.mg.samplemvcapplication.model.iss;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IssPosition{

	@JsonProperty("latitude")
	private String latitude;

	@JsonProperty("longitude")
	private String longitude;

	public String getLatitude(){
		return latitude;
	}

	public String getLongitude(){
		return longitude;
	}
}