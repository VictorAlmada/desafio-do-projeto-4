
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimir() {
		System.out.println("### Extrato de Conta Corrente ###");
		super.infoComum();
		
	}

}
