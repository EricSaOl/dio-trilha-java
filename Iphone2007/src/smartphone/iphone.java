package smartphone;

import utilities.AparelhoTelefonico;
import utilities.NavegadorInternet;
import utilities.ReprodutorMusical;

import java.util.Scanner;
public class iphone implements AparelhoTelefonico,NavegadorInternet, ReprodutorMusical{

	Scanner sc = new Scanner(System.in);
	
	public void TocarMusica() {
		System.out.println("Tocando musica...");
	}

	
	public void Pausar() {
		System.out.println("Musica pausada.");
		
	}

	
	public void SelecionarMusica() {
		System.out.println("Qual musica deve ser selecionada?");
		String musica = sc.nextLine() ;
		System.out.printf("Musica selecionada: %S\n", musica);
	}

	
	public void ExibirPagina() {
		System.out.println("Exibindo pagina....");
		
	}

	
	public void AdicionarAba() {
		System.out.println("Aba adicionada.");
		
	}

	
	public void AtualizarPagina() {
		System.out.println("Pagina atualizada.");
		
	}

	
	public void Ligar() {
		System.out.println("Ligando...");
		
	}

	
	public void Atender() {
		System.out.println("Ligação atendida.");
		
	}

	
	public void IniciarCorreioDeVoz() {
		System.out.println("Correio de voz: ------------------.");
		
	}

}
