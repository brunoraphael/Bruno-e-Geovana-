package Exercicio_316;

public class HeartRates {
	private String nome;
	private String sobrenome;
	private int dia;
	private int mes;
	private int ano;
	int idade;
	double frequencia_alvo;
	int frequencia;
	
		public HeartRates(String nome, String sobrenome, int dia, int mes, int ano){
			this.nome=nome;
			this.sobrenome=sobrenome;
			this.dia=dia;
			this.mes=mes;
			this.ano=ano;
			if (ano>2016){
				System.out.print("Data inválida.");
			}
		}
	public String getNome() {
		return nome;
	}
	public void setnome(String nome){
		this.nome = nome;
	}
	public String getsobrenome() {
		return sobrenome;
	}
	public void setsobrenoe(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getDia() {
		return dia;
	}
	public void setdia(int dia){
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setmes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int Idade(){
		return 2016-ano;
	}
	public int FrequenciaCardia(){
		int frequencia = 220 - Idade();
		return frequencia;	
	}
	public double Intervalo(){
		double frequencia_alvo = FrequenciaCardia()*0.85;
		return frequencia_alvo;
	}
}
