
public class Conta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.numero = SEQUENCIAL++;
		this.agencia = Conta.AGENCIA_PADRAO;
		this.cliente = cliente;
	}
	
	public void sacar(double valor) {
		saldo += valor;
		
	}
	
	public void depositar(double valor) {
		saldo -= valor;
		
	}
	
	public void transferir(double valor, Conta ContaDestino) {
		this.sacar(valor);
		ContaDestino.depositar(valor);
		
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	protected void infosExtrato() {
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Saldo: %f", this.saldo));
	}
	
	
}
