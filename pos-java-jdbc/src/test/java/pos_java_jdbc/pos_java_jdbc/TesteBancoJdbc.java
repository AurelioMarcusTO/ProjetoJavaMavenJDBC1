package pos_java_jdbc.pos_java_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import org.junit.Test;

import conexaojdbc.SingleConnection;
import dao.UserPosDAO;
import junit.framework.TestCase;
import model.BeanUserFone;
import model.Telefone;
import model.Userposjava;

public class TesteBancoJdbc {

	@Test
	public void initBanco() {

		UserPosDAO userPosDAO = new UserPosDAO();
		Userposjava userposjava = new Userposjava();

		userposjava.setNome("Joao da Sila");
		userposjava.setEmail("joaosilava@hotmail.com");

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
	
			
	@Test
	public void testeInsertTelefone() {
		
		Telefone telefone = new Telefone();
		telefone.setNumero("(11) 3365-8897");
		telefone.setTipo("casa");
		telefone.setUsuario(17L);
		
		UserPosDAO dao = new UserPosDAO();
		
		dao.salvarTelefone(telefone);
			
	}
	
	@Test
	public void testeCarregaFonesUser() {
		
		UserPosDAO dao = new UserPosDAO();
		
		List<BeanUserFone> beanUserFones = dao.listaUserFone(14L);
		
		for (BeanUserFone beanUserFone : beanUserFones) {
			
			System.out.println(beanUserFone);
			System.out.println("----------------------------------------------");
			
		}
		
	}
	
	@Test
	public void testDeleteUserFone() {
		
		
		UserPosDAO dao = new UserPosDAO();
		
		dao.deleteFonesPorUser(14L);
		
		
	}

}
