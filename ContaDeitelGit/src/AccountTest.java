import java.util.Scanner;

public class AccountTest {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Account conta1 = new Account("Fabricio", 100);
		Account conta2 = new Account("Ricardo", -50);
		
		
		
//		conta1.imprimir();
//		conta2.imprimir();
		
//		System.out.printf("%nDigite o valor de depósito para a conta de %s: ", conta1.getName());
//		double valorDeposito1 = input.nextDouble();
//		conta1.deposito(valorDeposito1);
//		
//		System.out.printf("%nDigite o valor de depósito para a conta de %s: ", conta2.getName());
//		double valorDeposito2 = input.nextDouble();
//		conta2.deposito(valorDeposito2);
		
//		conta1.imprimir();
//		conta2.imprimir();
		
		
//		System.out.printf("Digite o valor de saque para a conta %s: ", conta1.getName());
//		double valorSaque1 = input.nextDouble();
//		conta1.saque(valorSaque1);
//		
//		System.out.printf("Digite o valor de saque para conta %s: ", conta2.getName());
//		double valorsaque2 = input.nextDouble();
//		conta2.saque(valorsaque2);
		
//		System.out.println();
//		conta1.imprimir();
//		conta2.imprimir();
//		System.out.println();
		
//		Account conta1 = new Account("Fabricio");
//		Account conta2 = new Account("Ricardo");
		
		//System.out.printf("Initial name is: %s%n%n", myAccount.getName());
		
//		System.out.println("Please enter the name: ");
//		String theName = input.nextLine();
//		myAccount.setName(theName);
//		System.out.println();
//		
			
		
		input.close();
	}
	
	public static void displayAccount(Account accountToDisplay) {
		System.out.printf("%nName in object myAccount is: %n%s %.2f%n", Account.getName(), Account.getSaldo());
	}

}
