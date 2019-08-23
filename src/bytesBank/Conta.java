package bytesBank;
public class Conta{
	
	double saldo;
	int    agencia = 42;
	int    numero;
	String titular;
	String cpf;
	String profissao;
	
	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor){
			this.saldo -= valor;
			return true;
		}else{
			return false;
		}		
	}
	
	public boolean transfere(double valor, Conta contaDestino){
		
		if (this.saldo > valor){
			saca(valor);
			contaDestino.deposita(valor);
			return true;
		}else{
			return false;
		}
	}
	
	
}