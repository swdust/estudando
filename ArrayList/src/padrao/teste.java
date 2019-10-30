package padrao;

import java.io.IOException;
import java.util.ArrayList;
import entidades.Cliente;
import dados.UsuarioDados;

public class teste {
	public static void main(String[]args) throws ClassNotFoundException, IOException {
		
		UsuarioDados dados = new UsuarioDados();
		
		Cliente c1 = new Cliente(31, "will", 1084253132);
		
		dados.adicionarCliente(c1);
		
		ArrayList<Cliente> lista = new ArrayList<Cliente>();
		
		lista.add(c1);
		
		for(Cliente i : lista) {
			System.out.println(i.toString());
		}
			
	}
}
