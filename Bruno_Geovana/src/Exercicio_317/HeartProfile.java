package Exercicio_317;

public class HeartProfile {
	private String nome;
	private String sobrenome;
	private String sexo;
	private int dia;
	private int mes;
	private int ano;
	private double altura;
	private double peso;
		public HeartProfile(String nome, String sobrenome, String sexo, int dia, int mes, int ano, double altura, double peso){
			this.nome=nome;
			this.sobrenome=sobrenome;
			this.sexo=sexo;
			this.dia=dia;
			this.mes=mes;
			this.ano=ano;
			if (ano>2016){
				System.out.print("Data inválida.");
			}
			this.altura=altura;
			this.peso=peso;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getSobrenome() {
			return sobrenome;
		}
		public void setSobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
		}
		public String getSexo() {
			return sexo;
		}
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		public int getDia() {
			return dia;
		}
		public void setDia(int dia) {
			this.dia = dia;
		}
		public int getMes() {
			return mes;
		}
		public void setMes(int mes) {
			this.mes = mes;
		}
		public int getAno() {
			return ano;
		}
		public void setAno(int ano) {
			this.ano = ano;
		}
		public double getAltura() {
			return altura;
		}
		public void setAltura(double altura) {
			this.altura = altura;
		}
		public double getPeso() {
			return peso;
		}
		public void setPeso(double peso) {
			this.peso = peso;
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
		public double Libras(){
			return peso*2.2046;
		}
		public double Polegadas(){
			return (altura*100)*39.370;
		}
		public double IMC(){
			double IMC = ((peso)/(altura*altura));
			return IMC;
		}
		
}
