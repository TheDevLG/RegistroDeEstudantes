package RegistroDeEstudantes;
import java.util.Scanner;
public class app {
	Scanner input = new Scanner(System.in);
	public static void main (String[] args) throws Exception {
		
		
	Aluno a1 = new Aluno("Felipe", 1341242412, 18, "fio_solto", "eletrot�cnica" );
	Aluno a2 = new Aluno("Ian", 2141245325, 18, "virose", "medicina");
	Aluno a3 = new Aluno("Ang�lica", 231457642, 19, "loucura", "psicologia");
	Aluno a4 = new Aluno("Luan", 21341456, 17, "narcisismo", "fotografia");
	Aluno a5 = new Aluno("Daniel", 547769325, 19, "caf�", "ci�ncias da computa��o");
	Aluno a6 = new Aluno("Gabriel", 948576209, 18, "ad", "publicidade e propaganda");
	Aluno a7 = new Aluno("Pedro", 675349768, 19, "xarope", "farm�cia");
	Aluno a8 = new Aluno("Cleiton", 348734069, 21, "fio_preso", "engenharia el�trica");
	
	
	TestaAluno e1 = new TestaAluno();
	
	e1.inserir(a1);
	e1.inserir(a2);
	e1.inserir(a3);	
	e1.inserir(a4);
	e1.inserir(a5);
	e1.inserir(a6);
	e1.inserir(a7);
	e1.inserir(a8);
	e1.imprimir();
	
	
	}

}
