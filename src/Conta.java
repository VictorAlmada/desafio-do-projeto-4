
public abstract class Conta implements IConta {
	// atributos
	protected int agencia;
	protected int numeroConta;
	protected double saldo;
	protected Cliente cliente;
	
	// constantes
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	// construtores
	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numeroConta = SEQUENCIAL++;
		this.cliente = cliente;
	}

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
		System.out.println("Saque realizado no valor de: R$" + String.format("%.2f", valor) + " na conta de " + this.cliente.getNome() + ".");
		saldo -= valor;

	}

	@Override
	public void depositar(double valor) {
		System.out.println("Depósito realizado no valor de: R$" + String.format("%.2f", valor) + " na conta de " + this.cliente.getNome() + ".");
		saldo += valor;

	}

	@Override
	public void tranferir(double valor, Conta contaDestino) {
		System.out.println("Transferência no valor de R$" + String.format("%.2f", valor) + " realizada.");
		this.saldo -= valor;
		contaDestino.saldo += valor;

	}
	
	protected void infoComum() {
		System.out.println("Nome do Cliente: " + this.cliente.getNome() +
				"\nAgência: " + this.getAgencia() +
				"\nNúmero da Conta: " + this.getNumeroConta() +
				"\nSaldo: R$" + String.format("%.2f", this.getSaldo()) + "\n");
	}

}
