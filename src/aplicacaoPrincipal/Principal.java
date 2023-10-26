package aplicacaoPrincipal;
import padrao.Carro;
public class Principal {


			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Carro ford = new Carro("Ford", "Fusion", 2020, 2.4);
				//ford.marca = "Ford";
				System.out.println(ford.getMarca());
				ford.acelerar();
				ford.setVelocidade(35.0);
				System.out.println(ford.getVelocidade());
				
			}

		

	}


