package br.com.alura.leilao.login;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginTest {
	
	private LoginPage paginaDeLogin;
	
	@BeforeEach
	public void beforeEach() {
        paginaDeLogin =  new LoginPage();
	}
	
	@AfterEach
	public void afterEach() {
		paginaDeLogin.fechar();
	}
	
	
    @Test
    public void deveriaEfetuarLoginComDadosValidos() {
    	paginaDeLogin.preencheFormulario("fulano", "pass");
        paginaDeLogin.efetuaLogin();

        Assert.assertFalse(paginaDeLogin.isPaginaDelogin());
        Assert.assertEquals("fulano", paginaDeLogin.getNomeUsuarioLogado());
        
    }
    
    @Test
    public void naoDeveriaLogarComDadosInvalidos() {
    	this.paginaDeLogin.preencheFormulario("fulano", "passa");
    	paginaDeLogin.efetuaLogin();

    	Assert.assertTrue(paginaDeLogin.isPaginaDeloginComDadosInvalidos());
        Assert.assertNull(paginaDeLogin.getNomeUsuarioLogado());
        Assert.assertTrue(paginaDeLogin.contemTexto("Usuário e senha inválidos."));
    }
    
    @Test
    public void naoDeveriaAcessarPaginaRestritaSemEstarLogado() {
        paginaDeLogin.navegaParaPaginaDeLances();
        Assert.assertTrue(paginaDeLogin.isPaginaDelogin());
        Assert.assertFalse(paginaDeLogin.contemTexto("Dados de Leilão"));
    }
}