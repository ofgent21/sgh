package Dominio;

public class clientes {
	
	
	private String codigoCliente;
	private String nomeCliente;
	private String dataNascimentoCliente;
	private String telefoneCliente;
	private String enderecoCliente;
	private String numeroLogradouroCliente;
	private String bairroCliente;
	private String cepCliente;
	private String cidadeCliente;
	private String uFCliente;
	private String cPFCliente;
	private String rGCliente;
	private String fumanteCliente;
	private String quantasPessoasCliente;
	private String quartoCliente;
	private String checkInCliente;
	private String checkOutCliente;
	private String valorPeriodoCliente;
	
	
	
	
	public String getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getDataNascimentoCliente() {
		return dataNascimentoCliente;
	}
	public void setDataNascimentoCliente(String dataNascimentoCliente) {
		this.dataNascimentoCliente = dataNascimentoCliente;
	}
	public String getTelefoneCliente() {
		return telefoneCliente;
	}
	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}
	public String getEnderecoCliente() {
		return enderecoCliente;
	}
	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}
	public String getNumeroLogradouroCliente() {
		return numeroLogradouroCliente;
	}
	public void setNumeroLogradouroCliente(String numeroLogradouroCliente) {
		this.numeroLogradouroCliente = numeroLogradouroCliente;
	}
	public String getBairroCliente() {
		return bairroCliente;
	}
	public void setBairroCliente(String bairroCliente) {
		this.bairroCliente = bairroCliente;
	}
	public String getCepCliente() {
		return cepCliente;
	}
	public void setCepCliente(String cepCliente) {
		this.cepCliente = cepCliente;
	}
	public String getCidadeCliente() {
		return cidadeCliente;
	}
	public void setCidadeCliente(String cidadeCliente) {
		this.cidadeCliente = cidadeCliente;
	}
	public String getuFCliente() {
		return uFCliente;
	}
	public void setuFCliente(String uFCliente) {
		this.uFCliente = uFCliente;
	}
	public String getcPFCliente() {
		return cPFCliente;
	}
	public void setcPFCliente(String cPFCliente) {
		this.cPFCliente = cPFCliente;
	}
	public String getrGCliente() {
		return rGCliente;
	}
	public void setrGCliente(String rGCliente) {
		this.rGCliente = rGCliente;
	}
	public String getFumanteCliente() {
		return fumanteCliente;
	}
	public void setFumanteCliente(String fumanteCliente) {
		this.fumanteCliente = fumanteCliente;
	}
	public String getQuantasPessoasCliente() {
		return quantasPessoasCliente;
	}
	public void setQuantasPessoasCliente(String quantasPessoasCliente) {
		this.quantasPessoasCliente = quantasPessoasCliente;
	}
	public String getQuartoCliente() {
		return quartoCliente;
	}
	public void setQuartoCliente(String quartoCliente) {
		this.quartoCliente = quartoCliente;
	}
	public String getCheckInCliente() {
		return checkInCliente;
	}
	public void setCheckInCliente(String checkInCliente) {
		this.checkInCliente = checkInCliente;
	}
	public String getCheckOutCliente() {
		return checkOutCliente;
	}
	public void setCheckOutCliente(String checkOutCliente) {
		this.checkOutCliente = checkOutCliente;
	}
	public String getValorPeriodoCliente() {
		return valorPeriodoCliente;
	}
	public void setValorPeriodoCliente(String valorPeriodoCliente) {
		this.valorPeriodoCliente = valorPeriodoCliente;
	}
	public clientes(String codigoCliente, String nomeCliente, String dataNascimentoCliente, String telefoneCliente,
			String enderecoCliente, String numeroLogradouroCliente, String bairroCliente, String cepCliente,
			String cidadeCliente, String uFCliente, String cPFCliente, String rGCliente, String fumanteCliente,
			String quantasPessoasCliente, String quartoCliente, String checkInCliente, String checkOutCliente,
			String valorPeriodoCliente) {
		super();
		this.codigoCliente = codigoCliente;
		this.nomeCliente = nomeCliente;
		this.dataNascimentoCliente = dataNascimentoCliente;
		this.telefoneCliente = telefoneCliente;
		this.enderecoCliente = enderecoCliente;
		this.numeroLogradouroCliente = numeroLogradouroCliente;
		this.bairroCliente = bairroCliente;
		this.cepCliente = cepCliente;
		this.cidadeCliente = cidadeCliente;
		this.uFCliente = uFCliente;
		this.cPFCliente = cPFCliente;
		this.rGCliente = rGCliente;
		this.fumanteCliente = fumanteCliente;
		this.quantasPessoasCliente = quantasPessoasCliente;
		this.quartoCliente = quartoCliente;
		this.checkInCliente = checkInCliente;
		this.checkOutCliente = checkOutCliente;
		this.valorPeriodoCliente = valorPeriodoCliente;
	}
	@Override
	public String toString() {
		return "\n Código Cliente: " + codigoCliente + "\n Nome: " + nomeCliente + "\n Data Nascimento: "
				+ dataNascimentoCliente + "\n Telefone:  " + telefoneCliente + "\n Rua: "
				+ enderecoCliente + " NR: " + numeroLogradouroCliente + "\n Bairro: "
				+ bairroCliente + "\n CEP" + cepCliente + "\n Cidade : " + cidadeCliente + " UF: "
				+ uFCliente + "\n CPF: " + cPFCliente + " RG: " + rGCliente + "\n Fumante? : "
				+ fumanteCliente + "\n Número de Pessoas do Cliente: " + quantasPessoasCliente + " \n Quarto Hospedado: "
				+ quartoCliente + "\n Data Check In: " + checkInCliente + " Data Check Out: " + checkOutCliente
				+ "\n Total do Período: R$: " + valorPeriodoCliente;
	}

	
	
	

}
