
public class ContaPoupanca extends Conta {
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	
	}

	public void Extrato() {
		System.out.println("Extrato Conta Poupan�a: ");
		super.infosExtrato();
		
	}

	
}
