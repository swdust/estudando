package padrao;
import java.util.ArrayList;
import entidades.Cliente;
public class teste {
	public static void main(String[]args) {
		
		Cliente c1 = new Cliente(31, "will", 1084253132);
		
		ArrayList<Cliente> lista = new ArrayList();
		lista.add(c1);
		
		for(Cliente i : lista) {
			System.out.println(i.getNome());
			System.out.println(i.getCodigo());
			System.out.println(i.getCpf());
		}
			
	}
}
