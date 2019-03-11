import java.util.Scanner;
import java.util.Date;
/*Main class.
 * 
 * 1 - Menu de opções
 *  1.1 - Contratar Funcionario
 *  1.2 - Mostrar Funcionarios
 *  1.3 - Demitir Funcionario
 * 	1.4 - Adicionar Bebidas
 *  1.5 - Vender Bebidas
 * 
 * 
 */


public class Programa{
	public static void main(String[] args){
		Bodegueiro func = new Bodegueiro();
		Scanner x = new Scanner(System.in);
		Empresa bodega = new Empresa();
		int temp,opt=0;
		while(opt != 99){
			System.out.println("1 - Contratar novo funcionario \n2 - Exibir Funcionarios\n4 - Adicionar Bebida");
			opt = x.nextInt();
			
			//Contratar:
			
			if(opt == 1 ){
				Bodegueiro novo = new Bodegueiro();
				
				System.out.print("Entre com o nome: ");
				novo.nome= x.next();
				
				System.out.print("Entre com o cpf: ");
				novo.cpf = x.nextInt();
				
				System.out.print("Entre com o salario: ");
				novo.salario = x.nextDouble();
				
				System.out.print("Dia de Contratação: ");
				temp = x.nextInt();
				novo.contratado.setDate(temp);
				
				System.out.print("Mês De Contratação: ");
				temp = x.nextInt();
				novo.contratado.setMonth(temp);
				
				System.out.print("Ano de Contratação: ");
				temp = x.nextInt();
				novo.contratado.setYear(temp);
				bodega.Contrata(novo);
			}
			
			//Exibir Funcionarios:
			if(opt == 2){
				temp = 0;
				while(temp >= bodega.nfunc){
					func = bodega.getBodegueiro(temp);
					func.show();
					temp = temp+1;
				}
			}
			
			if(opt == 4){
				Bebida novo = new Bebida();
				
				System.out.print("Marca: ");
				novo.nome = x.next();
				
				System.out.print("Teor de Alcool: ");
				novo.teor = x.nextDouble();
				
				System.out.print("Quantidade: ");
				novo.quant = x.nextDouble();
				
				System.out.print("Preço: ");
				novo.preco = x.nextDouble();
				
				System.out.print("Quantas: ");
				novo.quantidade = x.nextInt();
				
				bodega.cProduto(novo);
			}
			
			if(opt == 5){
				System.out.println("(1) - Nome da bebida (2) - Posição da Bebida");
				temp = x.nextInt();
				if(temp == 1){
					System.out.println("Entre com o nome: ");
					String tempS;
					tempS = x.next();
					
				}
			}
		}
		
		
	}
	
}
