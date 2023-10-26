package padrao;

public class Carro {
	
		private String marca;
		private String modelo;
		private int ano;
		private double motor;
		private double tanque;
		private double velocidade=0;
		public double valorGasolina;
		
		
		public Carro (String marca, String modelo, int ano, double motor, double tanque) { //Método construtor (inicializa os atributos essenciais para um objeto existir)
		 this.marca = marca;												//nos () está o que quero mudar
		 this.modelo = modelo;
		 this.ano = ano;
		 this.motor = motor;
		 this.tanque = tanque;
		}
		public void girarChave() {
			System.out.println("Ligou ou desligou");
			
		}
		public double acelerar() {
			this.velocidade+=20;     //this é o elemento que aponta o objeto, 
			return this.velocidade; //eu controlo quem eu acelero através dele
		}
		public double frear () {
			this.velocidade-=20;
			return this.velocidade;	
		}
		public double getVelocidade() {
			return this.velocidade;
			}
		public void setVelocidade (double vel) {
			this.velocidade += vel;
		}
		public void setMarca (String marca) {
			this.marca = marca;
		}
		public String getMarca() {
			return this.marca;
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public int getAno() {
			return ano;
		}
		public void setAno(int ano) {
			this.ano = ano;
		}
		public double getMotor() {
			return motor;
		}
		public void setMotor(double motor) {
			this.motor = motor;
		}
		public void calcular(double valorGasolina) {
			
		}
		
	}

	

