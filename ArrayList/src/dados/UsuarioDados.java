package dados;

import entidades.Cliente;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class UsuarioDados {
	
	File lista = new File("listaClientes.txt");
	
	public String adicionarCliente(Cliente c1) throws ClassNotFoundException, IOException {
		
		ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
		
		if(lista.exists()) {
			listaClientes = listarClientes();
			listaClientes.add(c1);
			gravarLista(listaClientes);
			return "Cliente gravado com sucesso";
		}
		listaClientes.add(c1);
		gravarLista(listaClientes);
		return "Cliente gravado com sucesso";
		
	}
	
	public String removerCliente(Cliente c1) throws ClassNotFoundException, IOException {
		
		ArrayList<Cliente> listaCliente;
		listaCliente = listarClientes();
		
		if(listaCliente.size() == 1) {
			lista.delete();
		}else {
			listaCliente.remove(c1);
			gravarLista(listaCliente);
		}
		return "Cliente removido com sucesso";
	}
	
	public String alterarCliente(Cliente c1) {
		
		return null;
		
	}
		
	
	public ArrayList<Cliente> listarClientes() throws ClassNotFoundException, IOException {
		
		ArrayList<Cliente> listaCliente;
		
		FileInputStream fis = new FileInputStream(lista);
		ObjectInputStream ois = new ObjectInputStream(fis);
		listaCliente = (ArrayList) ois.readObject();
		
		return listaCliente;
		
	}
	
	public void gravarLista(ArrayList<Cliente> listaClientes) throws IOException {
		FileOutputStream fos = new FileOutputStream(lista);
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(listaClientes);
	}
	
	public int buscaCliente(Cliente c1) throws ClassNotFoundException, IOException {
		
		ArrayList<Cliente> listaCliente;
		listaCliente = listarClientes();
		return 0;
	}
}
