package pos_java_jdbc.pos_java_jdbc;

import java.util.List;

import org.junit.Test;

import conexaojdbc.SingleConnection;
import dao.UserPosDAO;
import junit.framework.TestCase;
import model.Userposjava;

public class TesteBancoJdbc {

	@Test
	public void initBanco() {

		UserPosDAO userPosDAO = new UserPosDAO();
		Userposjava userposjava = new Userposjava();

		userposjava.setNome("Matheus");
		userposjava.setEmail("matheus@hotmail.com");

		userPosDAO.salvar(userposjava);

	}

	@Test
	public void initListar() {

		UserPosDAO dao = new UserPosDAO();
		try {
			List<Userposjava> list = dao.listar();

			for (Userposjava userposjava : list) {
				System.out.println(userposjava);
				System.out.println("-------------------------------------");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Test
	public void initBuscar() {

		UserPosDAO dao = new UserPosDAO();

		try {
			Userposjava userposjava = dao.buscar(8L);

			System.out.println(userposjava);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}
	
	@Test
	public void initAtualizarEmail() {

		try {

			UserPosDAO dao = new UserPosDAO();

			Userposjava objetoBanco = dao.buscar(6L);
			
			objetoBanco.setEmail("Email mudado com metodo atualizar");
			
			dao.atualizaremail(objetoBanco);
			
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
	
	@Test
	public void initAtualizar() {

		try {

			UserPosDAO dao = new UserPosDAO();

			Userposjava objetoBanco = dao.buscar(6L);
			
			objetoBanco.setNome("Nome atualizado Jose");
			
			dao.atualizar(objetoBanco);
			
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
	
	@Test
	public void initDeletar() {
		
		try {
			
			UserPosDAO dao = new UserPosDAO();
			dao.deletar(9L);
			
		}catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
	}

}
