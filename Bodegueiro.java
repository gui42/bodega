import java.util.Date;

public class Bodegueiro{
	String nome;
	double salario;
	int cpf;
	Date contratado = new Date();
	
	void show(){
		System.out.println("Nome: "+this.nome+"\nCPF: "+this.cpf+"\nSalario: "+salario+"\nContratado:"+contratado.getDate()+"/"+contratado.getMonth()+"/"+contratado.getYear());
		
	}
}
