package bytesBank;

public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta conta         = new Conta();
		Conta contaPoupanca = new Conta();
		
		conta.saldo = 100;
		conta.deposita(50);
		
		contaPoupanca.deposita(1000);
		System.out.println("Saldo da poupança : " + contaPoupanca.saldo);
		
		if (conta.saca(20)){
			System.out.println("Saque realizado com sucesso");
		}else{
			System.out.println("Saldo Insuficiente");
		}
		
		System.out.println("Saldo da conta : " + conta.saldo);
		
		if (contaPoupanca.transfere(300, conta)){
			System.out.println("Transferencia realizada com sucesso");
			System.out.println("Saldo da poupança : " + contaPoupanca.saldo);
			System.out.println("Saldo da conta, depois da transferencia : " + conta.saldo);
		}else{
			System.out.println("Saldo insuficiente para transferencia");
		}
	}

}
