package br.com.fiap.model;

public class ConsultarFrase {
	private int id;
	private String advice, slip;
	@Override
	public String toString() {
		return "ConsultarFrase [id=" + id + ", advice=" + advice + ", slip=" + slip + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdvice() {
		return advice;
	}
	public void setAdvice(String advice) {
		this.advice = advice;
	}
	public String getSlip() {
		return slip;
	}
	public void setSlip(String slip) {
		this.slip = slip;
	}
	public ConsultarFrase(int id, String advice, String slip) {
		super();
		this.id = id;
		this.advice = advice;
		this.slip = slip;
	}

}
