package br.com.senac.servico;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senac.dominio.Aluno;
import br.com.senac.repositorio.AlunoRepositorio;
import br.com.senac.repositorio.AlunoRepositorio;
import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class LoginService {

	@Autowired
	private AlunoRepositorio repoCat;
	
	public Aluno buscar(Integer id) throws ObjectNotFoundException {
		Optional<Aluno> objCategoria = repoCat.findById(id);
		return objCategoria.orElseThrow(() -> new ObjectNotFoundException(
				"Categoria não encontrada! id: " + id + ", Tipo: " + Aluno.class.getName()));
	}
	
	public Aluno inserir(Aluno objCategoria) {
		//estou colocando um objeto novo entao o id precisa ser null
		objCategoria.setId(null);
		return repoCat.save(objCategoria);
	}
	
	public Aluno alterar(Aluno objCategoria) throws ObjectNotFoundException {
		Aluno objCategoriaEncontrado = buscar(objCategoria.getId());
		objCategoriaEncontrado.setNome(objCategoria.getNome());
		
		return repoCat.save(objCategoriaEncontrado);
				
	}
	
	public void excluir(Integer id) {
		repoCat.deleteById(id);
	}
	
	public List<Aluno> listaCategorias(){
		return repoCat.findAll();
	}
	
	public List<Aluno> listaLogin(){
		return repoCat.findAll();
	}
}