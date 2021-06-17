package pos_java_jdbc.pos_java_jdbc;

import org.junit.Test;

import conexaojdbc.SingleConnection;
import dao.UserPosDao;
import junit.framework.TestCase;
import model.Userposjava;

public class TesteBancoJdbc{
	
	@Test
	public void initBanco() {
		
		UserPosDao userPosDAO = new UserPosDao();
		Userposjava userposjava = new Userposjava();
		
		userposjava.setId(5L);
		userposjava.setNome("Maria");
		userposjava.setEmail("maria@hotmail.com");
		
		
		userPosDAO.salvar(userposjava);
		
	}

}
