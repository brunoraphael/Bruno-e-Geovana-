package Exercicio_314;

public class Employeetest {
	public static void main(String[] args) {
		Employee a = new Employee("Bruno", "Rafael", 1200);
		Employee b = new Employee("Lima", "Calado", 1300);
		
		double a_10 = 0.10 * (a.getSalario()*12);
		a_10 += (a.getSalario()*12);
		
		double b_10 = 0.10 * (b.getSalario()*12);
		b_10 += (b.getSalario()*12);
		
		System.out.println("Nome: "+a.getNome()+"\nSobrenome: "+a.getSobrenome()+"\nSalario anual: "+a.getSalario()*12);
		System.out.println("Nome: "+b.getNome()+"\nSobrenome: "+b.getSobrenome()+"\nSalario anual: "+b.getSalario()*12);
		System.out.println("Nome: "+a.getNome()+"\nSobrenome: "+a.getSobrenome()+"\nSalario anual mais 10%: "+a_10);
		System.out.println("Nome: "+b.getNome()+"\nSobrenome: "+b.getSobrenome()+"\nSalario anual mais 10%: "+b_10);
	}
}
