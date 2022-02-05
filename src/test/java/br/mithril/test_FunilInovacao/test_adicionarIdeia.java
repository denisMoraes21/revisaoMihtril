package br.mithril.test_FunilInovacao;

import br.mithril.test_Login.login;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class test_adicionarIdeia {
    public static login loginSis = new login();
    public static avaliacaoIdeias avaIdeias = new avaliacaoIdeias();
    public static final ChromeDriver driver = new ChromeDriver();
    public static final WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(20));

    @BeforeClass
    public static void inicial(){
        loginSis.loginSistema();
        //2022
        avaIdeias.adicionarIdeia("Não iniciada", "2022");
        avaIdeias.adicionarIdeia("Em análise", "2022");
        avaIdeias.adicionarIdeia("Aprovada para cotação", "2022");
        avaIdeias.adicionarIdeia("Aprovada", "2022");
        avaIdeias.adicionarIdeia("Implementada", "2022");
        avaIdeias.adicionarIdeia("Duplicada", "2022");
        avaIdeias.adicionarIdeia("Reprovada", "2022");
        avaIdeias.adicionarIdeia("Banco de Ideias", "2022");
        //2021
        avaIdeias.adicionarIdeia("Não iniciada", "2021");
        avaIdeias.adicionarIdeia("Em análise", "2021");
        avaIdeias.adicionarIdeia("Aprovada para cotação", "2021");
        avaIdeias.adicionarIdeia("Aprovada", "2021");
        avaIdeias.adicionarIdeia("Implementada", "2021");
        avaIdeias.adicionarIdeia("Duplicada", "2021");
        avaIdeias.adicionarIdeia("Reprovada", "2021");
        avaIdeias.adicionarIdeia("Banco de Ideias", "2021");
    }

    //Não iniciada - ok
    @Test
    public void naoIniciada_2021(){
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='Não iniciada'])[2]")).getText(), "Não iniciada");
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='2021'])[7]")).getText(), "2021");
    }

    @Test
    public void naoIniciada_2022(){
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='Não iniciada'])[1]")).getText(), "Não iniciada");
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='2022'])[7]")).getText(), "2022");
    }

    //Em análise - ok
    @Test
    public void emAnalise_2021(){
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='Em análise'])[2]")).getText(), "Em análise");
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='2021'])[5]")).getText(), "2021");
    }

    @Test
    public void emAnalise_2022(){
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='Em análise'])[1]")).getText(), "Em análise");
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='2022'])[5]")).getText(), "2022");
    }

    //Aprovada para cotação - ok
    @Test
    public void aprovadaCotacao_2021(){
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='Aprovada para cotação'])[2]")).getText(), "Aprovada para cotação");
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='2021'])[2]")).getText(), "2021");
    }

    @Test
    public void aprovadaCotacao_2022(){
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='Aprovada para cotação'])[1]")).getText(), "Aprovada para cotação");
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='2022'])[2]")).getText(), "2022");
    }

    //Aprovada - ok
    @Test
    public void aprovada_2021(){
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='Aprovada'])[2]")).getText(), "Aprovada");
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='2021'])[1]")).getText(), "2021");
    }

    @Test
    public void aprovada_2022(){
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='Aprovada'])[2]")).getText(), "Aprovada");
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='2022'])[1]")).getText(), "2022");
    }

    //Implementada - ok
    @Test
    public void implementada_2021(){
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='Implementada'])[2]")).getText(), "Implementada");
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='2021'])[6]")).getText(), "2021");
    }

    @Test
    public void implementada_2022(){
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='Implementada'])[1]")).getText(), "Implementada");
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='2022'])[6]")).getText(), "2022");
    }

    //Duplicada - ok
    @Test
    public void dupliacada_2021(){
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='Duplicada'])[2]")).getText(), "Duplicada");
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='2021'])[4]")).getText(), "2021");
    }

    @Test
    public void duplicada_2022(){
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='Duplicada'])[1]")).getText(), "Duplicada");
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='2022'])[4]")).getText(), "2022");
    }

    //Reprovada
    @Test
    public void reprovada_2021(){
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='Reprovada'])[2]")).getText(), "Reprovada");
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='2021'])[8]")).getText(), "2021");
    }

    @Test
    public void reprovada_2022(){
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='Reprovada'])[1]")).getText(), "Reprovada");
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='2022'])[8]")).getText(), "2022");
    }

    //Banco de Ideias
    @Test
    public void bancoIdeias_2021(){
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='Banco de Ideias'])[2]")).getText(), "Banco de Ideias");
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='2021'])[3]")).getText(), "2021");
    }

    @Test
    public void bancoIdeias_2022(){
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='Banco de Ideias'])[1]")).getText(), "Banco de Ideias");
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[text()='2022'])[3]")).getText(), "2022");
    }

    @AfterClass
    public static void fimTestes(){
        driver.quit();
    }
}
