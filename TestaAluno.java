package RegistroDeEstudantes;
public class TestaAluno { //repositório
		
	Aluno [] escola;
	int ind;
	public TestaAluno() {
		
	escola = new Aluno[30];	
	ind = 0;
	}
	
	public void inserir(Aluno a){ //metodo de inserção
       escola[ind] = a;
        ind++;
    }
	public void remover(Aluno a){ //metodo de remoção de cartas, verificando se o aluno coresponde
        for(int i = 0; i < ind; i++){ //loop que percorre os alunos
            if(escola[i] == a){ // verifica se o aluno da posição é igual ao aluno procurado
                escola[i] = escola[ind-1]; //atribui o valor da escola a posição especificada
                escola[ind-1] = null; //atribui o valor null a posição especificada
                ind--; //decrementa a posição
            }
        }
    }

    public void procurar(Aluno a){ //metodo 1 de procura de alunos
        for(int i = 0; i < ind; i++){ //loop que percorre os alunos da escola
            if(escola[i] == a){ // verifica se o aluno da posição é igual ao aluno procurado
                a.imprimir(); //se sim, imprime o aluno em questão
            }
        }
    }
		
	public void imprimir(){ //metodo de impressão
        for(int i = 0; i < ind; i++){ //loop
            escola[i].imprimir(); //faz a impressão 
        }
		
		
	}	

	}


