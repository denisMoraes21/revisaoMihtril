package br.mithril.test_FunilInovacao;

import br.mithril.test_Login.login;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

import static br.mithril.test_FunilInovacao.test_adicionarIdeia.driver;

public class test_adicionarProposta {
    public static login loginSis = new login();
    public static solicitacaoPropostas soliProp = new solicitacaoPropostas();

    @BeforeClass
    public static void inicial() throws InterruptedException {
        loginSis.loginSistema();
        //2022
        soliProp.adicionarProposta("Não iniciada", "2022");
        soliProp.adicionarProposta("Em análise", "2022");
        soliProp.adicionarProposta("Aprovada para cotação", "2022");
        soliProp.adicionarProposta("Aprovada", "2022");
        soliProp.adicionarProposta("Implementada", "2022");
        soliProp.adicionarProposta("Duplicada", "2022");
        soliProp.adicionarProposta("Reprovada", "2022");
        soliProp.adicionarProposta("Banco de Ideias", "2022");
        //2021
        soliProp.adicionarProposta("Não iniciada", "2021");
        soliProp.adicionarProposta("Em análise", "2021");
        soliProp.adicionarProposta("Aprovada para cotação", "2021");
        soliProp.adicionarProposta("Aprovada", "2021");
        soliProp.adicionarProposta("Implementada", "2021");
        soliProp.adicionarProposta("Duplicada", "2021");
        soliProp.adicionarProposta("Reprovada", "2021");
        soliProp.adicionarProposta("Banco de Ideias", "2021");
        //Propostas
        soliProp.telaInicio();
        soliProp.limparfiltro();
    }

    //Não iniciada - ok
    @Test
    public void naoIniciada_2021() throws InterruptedException {
        Thread.sleep(500);
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='Não iniciada'])[2]")).getText(), "Não iniciada");
    }

    @Test
    public void naoIniciada_2022() throws InterruptedException {
        Thread.sleep(500);
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='Não iniciada'])[1]")).getText(), "Não iniciada");
    }

    //Em análise - ok
    @Test
    public void emAnalise_2021() throws InterruptedException {
        Thread.sleep(500);
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='Em análise'])[2]")).getText(), "Em análise");
    }

    @Test
    public void emAnalise_2022() throws InterruptedException {
        Thread.sleep(500);
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='Em análise'])[1]")).getText(), "Em análise");
    }

    //Aprovada para cotação - ok
    @Test
    public void aprovadaCotacao_2021() throws InterruptedException {
        Thread.sleep(500);
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='Aprovada para cotação'])[2]")).getText(), "Aprovada para cotação");
    }

    @Test
    public void aprovadaCotacao_2022() throws InterruptedException {
        Thread.sleep(500);
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='Aprovada para cotação'])[1]")).getText(), "Aprovada para cotação");
    }

    //Aprovada - ok
    @Test
    public void aprovada_2021() throws InterruptedException {
        Thread.sleep(500);
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='Aprovada'])[2]")).getText(), "Aprovada");
    }

    @Test
    public void aprovada_2022() throws InterruptedException {
        Thread.sleep(500);
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='Aprovada'])[2]")).getText(), "Aprovada");
    }

    //Implementada - ok
    @Test
    public void implementada_2021() throws InterruptedException {
        Thread.sleep(500);
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='Implementada'])[2]")).getText(), "Implementada");
    }

    @Test
    public void implementada_2022() throws InterruptedException {
        Thread.sleep(500);
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='Implementada'])[1]")).getText(), "Implementada");
    }

    //Duplicada - ok
    @Test
    public void dupliacada_2021() throws InterruptedException {
        Thread.sleep(500);
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='Duplicada'])[2]")).getText(), "Duplicada");
    }

    @Test
    public void duplicada_2022() throws InterruptedException {
        Thread.sleep(500);
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='Duplicada'])[1]")).getText(), "Duplicada");
    }

    //Reprovado - ok
    @Test
    public void reprovado_2021() throws InterruptedException {
        Thread.sleep(500);
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='Reprovada'])[2]")).getText(), "Reprovada");
    }

    @Test
    public void reprovado_2022() throws InterruptedException {
        Thread.sleep(500);
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='Reprovada'])[1]")).getText(), "Reprovada");
    }

    //Banco de Ideias - ok
    @Test
    public void bancoIdeias_2021() throws InterruptedException {
        Thread.sleep(500);
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='Banco de Ideias'])[2]")).getText(), "Banco de Ideias");
    }

    @Test
    public void bancoIdeias_2022() throws InterruptedException {
        Thread.sleep(500);
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='Banco de Ideias'])[1]")).getText(), "Banco de Ideias");
    }

    @AfterClass
    public static void fimTeste(){
        driver.quit();
    }
}
