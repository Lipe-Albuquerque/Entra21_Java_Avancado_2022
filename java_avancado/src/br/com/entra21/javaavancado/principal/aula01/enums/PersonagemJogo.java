package br.com.entra21.javaavancado.principal.aula01.enums;

public enum PersonagemJogo {
	BARBARO(1000, "Muito HP"), ANAO(100,"FERREIRO");
	
	private final int HP;
	private final String DESCRIPTION;
	
	private PersonagemJogo(int hp, String description) {
		this.HP = hp;
		this.DESCRIPTION = description;
	}

	public int getHP() {
		return HP;
	}

	public String getDESCRIPTION() {
		return DESCRIPTION;
	}
}
