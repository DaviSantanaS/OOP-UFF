
class Pessoa{
	private String nome;
	private int ano_nasc;
	
	public int ano_atual;

	public Pessoa(){
		
	}

	Pessoa(String nome, int ano){
		this.nome = nome;
		this.ano_nasc = ano;
	}
	
	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public int getAno_atual(){
			return ano_atual;
		}

	public void setAno_atual(int ano){
		this.ano_atual = ano;
	}
	
	public int getAno(){
		return ano_nasc;
	}

	public void setAno(int ano){
		this.ano_nasc = ano;
	}
	
	public void Aniversario(){
		this.ano_atual += 1;
	}
	
}