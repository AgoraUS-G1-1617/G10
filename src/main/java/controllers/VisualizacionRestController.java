package controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import services.ReferendumRecuentoService;
import domain.ReferendumRecuento;

@Controller
@RequestMapping("/api/resultados")
public class VisualizacionRestController{

	@Autowired
	private ReferendumRecuentoService referendumRecuentoService;
	
	@RequestMapping(value="/encuestas", method = RequestMethod.GET)
	public @ResponseBody List<ReferendumRecuento> encuestas(){
		List<ReferendumRecuento> result = new ArrayList<ReferendumRecuento>();
		Collection<ReferendumRecuento> encuestas = referendumRecuentoService.findAll();
		result.addAll(encuestas);
		return result;
	}
	
}
