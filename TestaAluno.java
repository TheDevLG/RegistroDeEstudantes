package RegistroDeEstudantes;
public class TestaAluno { //reposit�rio
		
	Aluno [] escola;
	int ind;
	public TestaAluno() {
		
	escola = new Aluno[30];	
	ind = 0;
	}
	
	public void inserir(Aluno a){ //metodo de inser��o
       escola[ind] = a;
        ind++;
    }
	public void remover(Aluno a){ //metodo de remo��o de cartas, verificando se o aluno coresponde
        for(int i = 0; i < ind; i++){ //loop que percorre os alunos
            if(escola[i] == a){ // verifica se o aluno da posi��o � igual ao aluno procurado
                escola[i] = escola[ind-1]; //atribui o valor da escola a posi��o especificada
                escola[ind-1] = null; //atribui o valor null a posi��o especificada
                ind--; //decrementa a posi��o
            }
        }
    }

    public void procurar(Aluno a){ //metodo 1 de procura de alunos
        for(int i = 0; i < ind; i++){ //loop que percorre os alunos da escola
            if(escola[i] == a){ // verifica se o aluno da posi��o � igual ao aluno procurado
                a.imprimir(); //se sim, imprime o aluno em quest�o
            }
        }
    }
		
	public void imprimir(){ //metodo de impress�o
        for(int i = 0; i < ind; i++){ //loop
            escola[i].imprimir(); //faz a impress�o 
        }
		
		
	}	

	}


