package bytesBank;

public class CriaConta {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;

		System.out.println(primeiraConta.saldo);

		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);

		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;

		System.out.println("Primeira conta tem : " + primeiraConta.saldo);
		System.out.println("Segunda conta tem : " + segundaConta.saldo);

		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);

		System.out.println(segundaConta.agencia);
		System.out.println(segundaConta.numero);

		segundaConta.agencia = 146;
		System.out.println("agora na segunda conta, a agencia está na " + segundaConta.agencia);

		if (primeiraConta == segundaConta) {
			System.out.println("Mesma Conta");
		} else {
			System.out.println("Conta diferente");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);

	}
}
