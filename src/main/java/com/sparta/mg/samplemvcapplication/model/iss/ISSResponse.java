package com.sparta.mg.samplemvcapplication.model.iss;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ISSResponse{

	@JsonProperty("iss_position")
	private IssPosition issPosition;

	@JsonProperty("message")
	private String message;

	@JsonProperty("timestamp")
	private Integer timestamp;

	public IssPosition getIssPosition(){
		return issPosition;
	}

	public String getMessage(){
		return message;
	}

	public Integer getTimestamp(){
		return timestamp;
	}
}