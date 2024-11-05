package ifrn.pi.eventos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ifrn.pi.eventos.models.Evento;
import ifrn.pi.eventos.repositories.EventoReporitory;

@Controller
public class EventosController {
	
	@Autowired
	private EventoReporitory er;
	@RequestMapping("/eventos/form")
	public String form() {
		return "eventos/formEventos";
	}
	@RequestMapping ("/eventos" )
	public String adicionar(Evento evento) {
		
		System.out.println(evento );
		return "eventos/evento-adicionar";
	}
	
}
