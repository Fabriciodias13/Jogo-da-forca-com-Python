import java.util.Scanner;

public class Account {
	
	private static String name;
	private static double saldo;
	
	public Account(String name, double saldo) {
		this.name = name;
		
		if (saldo > 0.0)
			this.saldo = saldo;
	}
	//aqui termina o construtor
	
	public void deposito(double valor) {
		if (valor > 0.0)
			saldo += valor;	
	}
	
	public void saque(double retirada) {
		if (retirada <= saldo) {
			saldo -= retirada;
		}else
		{
			System.out.println("Valor de débito excedeu o saldo da conta");
			}
		}
		
		
	
	public static double getSaldo() {
		return saldo;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static String getName() {
		return name;
	}
	
//	void imprimir() {
//		System.out.printf("%nName in object myAccount is: %n%s %.2f%n", getName(), getSaldo());
//		//System.out.println("Name in object myAccount is: " + getName() + " " + getSaldo());
//	}
	
	public static void displayAccount(Account accountToDisplay) {
		System.out.printf("%nName in object myAccount is: %n%s %.2f%n", getName(), getSaldo());
	}

}
