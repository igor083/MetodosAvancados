package controller;

import java.util.ArrayList;
import java.util.List;

import model.Onibus;
import model.OnibusException;
import model.TerminalEvent;
import model.TerminalListener;

public class Terminal {
	
	private List<TerminalListener> listeners;
	private Onibus bus;
	
	public Terminal() {
		this.listeners = new ArrayList<>();
		this.bus = new Onibus();
	}
	
	
	
	public void addTerminalListener(TerminalListener t) {
		this.listeners.add(t);
	}
	
	public void removeTerminalListener(TerminalListener t) {
		this.listeners.remove(t);
	}

	
	 // Método para notificar Listeners de alteração
	
	private void onibusAlterou() {
		TerminalEvent e = new TerminalEvent(this);
		
		for (TerminalListener terminalListener : listeners) {
			terminalListener.atualizarPassagens(e);
		}
	}

	//vende passagem

	public int venderPassagem() throws OnibusException {
		int a = this.bus.adicionar();
		onibusAlterou();
		return a;
	}
	
	//Reserva uma passagem
	 
	public int reservarPassagem() throws OnibusException {
		int a = this.bus.reservar();
		onibusAlterou();
		return a;
	}
	
	// Cancela uma passagem comprada/reservada
	
	public boolean cancelarPassagem(int i) {
		if (i >= 0 && i <= this.bus.getCapacidade()) {
			this.bus.liberar(i);
			onibusAlterou();
			return true;
		}
		return false;
	}
	
//Recupera o ônibus

	public Onibus getOnibus() {
		return this.bus;
	}
}