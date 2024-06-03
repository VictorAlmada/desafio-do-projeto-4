
public abstract class Conta implements IConta {
	// atributos
	private int agencia;
	private int numeroConta;
	private double saldo;

	// getters e setters
	public int getAgencia() {
		return agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tranferir(double valor, Conta contaDestino) {
		// TODO Auto-generated method stub
		
	}

	
}
