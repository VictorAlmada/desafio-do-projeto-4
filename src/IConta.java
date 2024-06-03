
public interface IConta {
	// métodos
		public void sacar(double valor);

		public void depositar(double valor);

		public void tranferir(double valor, Conta contaDestino);
}
