package com.clt.weather_data_api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data  
@JsonIgnoreProperties(ignoreUnknown=true) // ignore unused fields
public class WeatherResponseDTO {
	
	@JsonProperty("temperature")
	private String temperature;
	
	@JsonProperty("windspeed")
	private String windSpeed;
	
	@JsonProperty("weathercode")
	private String weatherCode;
	
	@JsonProperty("time")
	private String time;
	

}
