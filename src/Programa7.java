
public class Programa7 {

	public static void main(String[] args) {
		
		MinhaClass7 obj = new MinhaClass7();
		System.out.println(obj.BI);
		System.out.println(obj.nome);
		//System.out.println(obj.curso);
	}

}


class MinhaClass7{
	public String nome = "Lingui";
	int idade = 19;
	private String curso = "Engenharia Informatica";
	protected String BI = "129843120G";
}
