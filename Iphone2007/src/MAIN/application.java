package MAIN;

import smartphone.iphone;
import java.util.Scanner;

public class application {

	public static void main(String[] args) {
		iphone iphone2007 =  new iphone();
		iphone2007.Atender();
		iphone2007.Ligar();
		iphone2007.IniciarCorreioDeVoz();
		
		iphone2007.AdicionarAba();
		iphone2007.AtualizarPagina();
		iphone2007.ExibirPagina();
		
		iphone2007.SelecionarMusica();
		iphone2007.TocarMusica();
		iphone2007.Pausar();

	}

}
