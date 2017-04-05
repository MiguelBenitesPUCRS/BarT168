package bar.t168;

import java.util.ArrayList;

public class Bar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Cliente> clientes = new ArrayList<>();
		
		//Cliente(String nome, String cpf, int idade, char genero)
		Cliente cli1 = new Cliente("Evandro", "12345678901", 30, 'M');
		Cliente cli2 = new Cliente("Temis", "12345678901", 28, 'F');
		Cliente cli3 = new Socio("1234");
		
		
		clientes.add(cli1);
		
		System.out.println("Teste");
		
		
	}

}
