package Dominio;

public class quartos {

	private String numeroQuarto;
	private String posicaoQuarto;
	private String camasQuarto;
	private String pessoasQuarto;
	private String lotacaoMaximaQuarto;
	private String fumanteQuarto;
	private String diariaQuarto;
	private String codClienteVinculado;
	private String clienteVinculado;
	private String dataVinculo;
	private String statusQuarto;

	public String getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(String numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public  String getPosicaoQuarto() {
		return posicaoQuarto;
	}

	public  void setPosicaoQuarto(String posicaoQuarto) {
		this.posicaoQuarto = posicaoQuarto;
	}

	public  String getCamasQuarto() {
		return camasQuarto;
	}

	public  void setCamasQuarto(String camasQuarto) {
		this.camasQuarto = camasQuarto;
	}

	public  String getPessoasQuarto() {
		return pessoasQuarto;
	}

	public  void setPessoasQuarto(String pessoasQuarto) {
		this.pessoasQuarto = pessoasQuarto;
	}

	public  String getLotacaoMaximaQuarto() {
		return lotacaoMaximaQuarto;
	}

	public  void setLotacaoMaximaQuarto(String lotacaoMaximaQuarto) {
		this.lotacaoMaximaQuarto = lotacaoMaximaQuarto;
	}

	public  String getFumanteQuarto() {
		return fumanteQuarto;
	}

	public  void setFumanteQuarto(String fumanteQuarto) {
		this.fumanteQuarto = fumanteQuarto;
	}

	public  String getDiariaQuarto() {
		return diariaQuarto;
	}

	public  void setDiariaQuarto(String diariaQuarto) {
		this.diariaQuarto = diariaQuarto;
	}

	public  String getCodClienteVinculado() {
		return codClienteVinculado;
	}

	public  void setCodClienteVinculado(String codClienteVinculado) {
		this.codClienteVinculado = codClienteVinculado;
	}

	public  String getClienteVinculado() {
		return clienteVinculado;
	}

	public  void setClienteVinculado(String clienteVinculado) {
		this.clienteVinculado = clienteVinculado;
	}

	public  String getDataVinculo() {
		return dataVinculo;
	}

	public  void setDataVinculo(String dataVinculo) {
		this.dataVinculo = dataVinculo;
	}

	public  String getStatusQuarto() {
		return statusQuarto;
	}

	public  void setStatusQuarto(String statusQuarto) {
		this.statusQuarto = statusQuarto;
	}

	public quartos(String numeroQuarto, String posicaoQuarto, String camasQuarto, String pessoasQuarto,
			String lotacaoMaximaQuarto, String fumanteQuarto, String diariaQuarto, String codClienteVinculado,
			String clienteVinculado, String dataVinculo, String statusQuarto) {
		super();
		this.numeroQuarto = numeroQuarto;
		this.posicaoQuarto = posicaoQuarto;
		this.camasQuarto = camasQuarto;
		this.pessoasQuarto = pessoasQuarto;
		this.lotacaoMaximaQuarto = lotacaoMaximaQuarto;
		this.fumanteQuarto = fumanteQuarto;
		this.diariaQuarto = diariaQuarto;
		this.codClienteVinculado = codClienteVinculado;
		this.clienteVinculado = clienteVinculado;
		this.dataVinculo = dataVinculo;
		this.statusQuarto = statusQuarto;
	}

	@Override
	public String toString() {
		return "\n Quarto Número: " + numeroQuarto + "\n Posição: " + posicaoQuarto + "\n Quantidade de Camas: "
				+ camasQuarto + "\n Quantidade de Pessoas Hospedadas: " + pessoasQuarto
				+ "\n Lotação Máxima do Quarto: " + lotacaoMaximaQuarto + "\n Quarto para Fumantes?: " + fumanteQuarto
				+ "\n Diaria: " + diariaQuarto + "\n Codigo do Cliente Vinculado: " + codClienteVinculado
				+ "\n Nome do Cliente: " + clienteVinculado + "\n Data do Vinculo: " + dataVinculo + "\n Quarto Liberado? : "
				+ statusQuarto;
	}

}
