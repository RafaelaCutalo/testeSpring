package br.com.senac.repositorio;

import org.springframework.data.jpa.repository.Query;

import br.com.senac.dominio.Aluno;

public class LoginRepositorio extends JpaRepository<Aluno, Integer>{

	Aluno findByEmail(String email) {
		return null;
	}
	
	@Query("select a from Aluno a where a.nome = ?1")
	Aluno findByNome(String nome) {
		return null;
	}
}



