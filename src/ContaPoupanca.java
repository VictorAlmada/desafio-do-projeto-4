
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimir() {
		System.out.println("### Extrato de Conta Poupança ###");
		super.infoComum();
	}

}
