public class Bebida{
	String nome;
	double teor, quant, preco;
	int quantidade;
	
	public void printBebida(){
		System.out.print("\n---------------------------\nMarca: "+this.nome+"\nTeor de Alcool: "+this.teor+"%\nQuantidade: "+this.quant+"mls\nPreço: R$"+this.preco+" Quantidade em Estoque: "+this.quantidade+"\n---------------------------\n");
		
	}
}
