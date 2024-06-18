package com.jerry.LJM.weather;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WeatherController {

	@RequestMapping("/weather/list")
	public String getList(HttpServletRequest request) {
		System.out.println("weather list");
			
		return "weather/list";
	}

}
