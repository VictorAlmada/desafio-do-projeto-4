import java.util.ArrayList;
import java.util.List;

public class Banco {
	// atributos
	private static final String NOME_BANCO = "Banco Digital";
	private String nome;
	private List<Conta> contas;

	// construtor
	public Banco() {
		this.nome = NOME_BANCO;
		this.contas = new ArrayList<>();
	}

	// getter
	public String getNome() {
		return nome;
	}

	// métodos
	public void adicionarConta(Conta conta) {
		this.contas.add(conta);
	}
	
	public void imprimirContas() {
		System.out.println("### " + NOME_BANCO + " ###");
		System.out.println("Lista de Contas: ");
		for (int i = 0; i < contas.size(); i++) { 
			System.out.println("Cliente: " + contas.get(i).cliente.getNome() +
			", Agência: " + contas.get(i).getAgencia() +
			",Conta: " + contas.get(i).getNumeroConta() +
			", Saldo: " + contas.get(i).getSaldo());
			
		}
	}

}
