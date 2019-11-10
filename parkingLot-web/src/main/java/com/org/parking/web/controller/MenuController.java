package com.org.parking.web.controller;

import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "menuController")
@ELBeanName(value = "menuController	")
@Scope(value = "session")
public class MenuController {

	public String menuNavigation(String view) {
		switch (view) {
		case "ENTRADA":
			return "registro_entrada";
		case "SALIDA":
			return "/registro_entrada";
		case "BOL_PERDIDO":
			return "";
		default:
			return "";
		}
	}

}
