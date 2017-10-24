package tests;

public enum FacebookBrowser {
	
	CHROME("chrome"),
	FIREFOX("firefox");
	
	private String descricao;

	private FacebookBrowser(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
