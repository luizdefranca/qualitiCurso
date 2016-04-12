package Qualiti;

public class Aluno {

		class aluno
		{
			
			
			String nome, sobrenome, nomePai, nomeMae, endereco, matricula;
			
			int idade;
			
			/*
			
			Apenas um comentário
			
			*/
			
			void setNome(String nome)
			{
				this.nome = nome;
			}
			
			String getmatricula(String nome)
			{
				return this.matricula;
			}
			

			void fazerMatricula(String nome, String sobrenome, String nomePai, String nomeMae,
					String endereco, String matricula, int idade)
			{
				this.nome = nome;
				this.sobrenome = sobrenome;
				this.nomePai = nomePai;
				this.nomeMae = nomeMae;
				this.endereco = endereco;
				this.matricula = matricula;
				this.idade = idade;
			}
			
		}

		void estudar() {
			// TODO Auto-generated method stub
			
			System.out.println("Aluno estudando");
		}

		public static void main(String args[])
		{
			Aluno fulano = new Aluno();
			fulano.estudar();
		}

	}


