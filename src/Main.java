
public class Main {

	public static void main(String[] args) {
		// criação de cliente
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		cliente1.setNome("Victor Almada");
		cliente2.setNome(cliente1.getNome());

		// criação de banco
		Banco banco = new Banco();

		// criação de conta
		Conta cc = new ContaCorrente(cliente1);
		Conta cp = new ContaPoupanca(cliente2);

		// usando métodos
		banco.adicionarConta(cc);
		banco.adicionarConta(cp);
		cc.depositar(950);
		//cc.tranferir(100, cp);
		cc.sacar(150);
		//cc.imprimir();
		//cp.imprimir();
		//banco.imprimirContas();
	}

}
