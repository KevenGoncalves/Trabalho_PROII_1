
public class Programa5 {

	public static void main(String[] args) {
		MinhaClass5 obj = new MinhaClass5();
		obj.nome = "Eng.Info";
		obj.idade = 19;
		obj.SaberIdade();
		obj.SaberNome();

	}

}

class MinhaClass5{
	
	public String nome;
	String curso;
	int idade;
	
	void SaberNome() {
		System.out.println("O nome do Objecto é"+this.nome);
	}
	
	void SaberCurso() {
		System.out.println("O curso do Objecto é"+this.curso);
	}
	
	void SaberIdade() {
		System.out.println("A idade do Objecto é"+this.idade);
	}
	
}
