package com.maxcompany.osworks.api.exceptionhandler;

public class Campo {
	private String campo;
	private String mensagem;
			
	public Campo(String campo, String mensagem) {
		super();
		this.campo = campo;
		this.mensagem = mensagem;
	}
	public String getcampo() {
		return campo;
	}
	public void setcampo(String campo) {
		this.campo = campo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
}