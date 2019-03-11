import java.util.ArrayList;
import java.util.List;
public class Empresa{
	String nome;
	int cnpj, nfunc;
	List<Bodegueiro> funcionario = new ArrayList();
	List<Bebida> estoque = new ArrayList();
	
	public void Contrata(Bodegueiro func){
		nfunc+=nfunc;
		funcionario.add(nfunc, func);
	}
	
	public void cProduto(Bebida prod){
		estoque.add(prod);
	}
	
	public Bodegueiro getBodegueiro(int i){
		Bodegueiro x = new Bodegueiro();
		x=funcionario.get(i);
		return x;
	}
	
	public Bebida getBebida(int i){
		Bebida x = new Bebida();
		x = estoque.get(i);
		return x;
	}
}
