
public class ContaCorrente extends Conta{
public ContaCorrente(Cliente cliente) {
		super(cliente);
	
	}

public void Extrato() {
		System.out.println("Extrato Conta Corrente: ");
		super.infosExtrato();
	}
}
