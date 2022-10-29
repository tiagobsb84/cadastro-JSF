package com.tiago.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.tiago.model.Evento;

@Named
@SessionScoped
public class EventoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Evento evento;
	
	private List<Evento> listaEvento = new ArrayList<Evento>();
	
	public String adicionarEvento() {
		listaEvento.add(evento);
		System.out.println("Gravando: " + evento.getNomeEvento() + " Cadastrado com sucesso!");
		clean();
		return "";
	}
	
	public void clean() {
		this.evento = new Evento();
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public List<Evento> getListaEvento() {
		return listaEvento;
	}

	public void setListaEvento(List<Evento> listaEvento) {
		this.listaEvento = listaEvento;
	}

}
