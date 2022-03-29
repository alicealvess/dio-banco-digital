
public class Main {

	public static void main (String[] args) {
		Cliente alice = new Cliente();
		alice.setNome("Alice");
		
		
		Conta cc = new ContaCorrente(alice);
		Conta cp = new ContaPoupanca(alice);
		cc.depositar(100);
		cc.transferir(100, cp);
		
		cc.infosExtrato();
		cp.infosExtrato();
	}
}
