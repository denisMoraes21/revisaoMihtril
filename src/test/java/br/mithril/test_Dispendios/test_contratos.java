package br.mithril.test_Dispendios;

import br.mithril.test_Login.login;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static br.mithril.test_FunilInovacao.test_adicionarIdeia.driver;
import static br.mithril.test_FunilInovacao.test_adicionarIdeia.wait;

public class test_contratos {
    public static login loginSis = new login();
    public static contratos contrato = new contratos();

    @BeforeClass
    public static void inicial(){
        loginSis.loginSistema();
        //2022
        contrato.adicionarContratos("2022 Interno Realizado", "2022", "Interno", "Sim");
        contrato.adicionarContratos("2022 Externo Realizado", "2022", "Externo", "Sim");
        contrato.adicionarContratos("2022 Interno Não Realizado", "2022", "Interno", "Não");
        contrato.adicionarContratos("2022 Externo Não Realizado", "2022", "Externo", "Não");
        //2021
        contrato.adicionarContratos("2021 Interno Realizado", "2021", "Interno", "Sim");
        contrato.adicionarContratos("2021 Externo Realizado", "2021", "Externo", "Sim");
        contrato.adicionarContratos("2021 Interno Não Realizado", "2021", "Interno", "Não");
        contrato.adicionarContratos("2021 Externo Não Realizado", "2021", "Externo", "Não");
        //Início
        contrato.entrarContratos();
    }

    @Test
    public void contratoInternoRealizado_2021(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@class='truncate au-target'])[4]")));
        Assert.assertEquals(driver.findElement(By.xpath("(//td[@class='truncate au-target'])[4]")).getText(), "2021 Interno Realizado");
    }

    @Test
    public void contratoInternoNaoRealizado_2021(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@class='truncate au-target'])[2]")));
        Assert.assertEquals(driver.findElement(By.xpath("(//td[@class='truncate au-target'])[2]")).getText(), "2021 Interno Não Realizado");
    }

    @Test
    public void contratoExternoRealizado_2021(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@class='truncate au-target'])[3]")));
        Assert.assertEquals(driver.findElement(By.xpath("(//td[@class='truncate au-target'])[3]")).getText(), "2021 Externo Realizado");
    }

    @Test
    public void contratoExternoNaoRealizado_2021(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@class='truncate au-target'])[1]")));
        Assert.assertEquals(driver.findElement(By.xpath("(//td[@class='truncate au-target'])[1]")).getText(), "2021 Externo Não Realizado");
    }

    @Test
    public void contratoInternoRealizado_2022(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@class='truncate au-target'])[8]")));
        Assert.assertEquals(driver.findElement(By.xpath("(//tr/td[@class='truncate au-target'])[8]")).getText(), "2022 Interno Realizado");
    }

    @Test
    public void contratoInternoNaoRealizado_2022(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@class='truncate au-target'])[6]")));
        Assert.assertEquals(driver.findElement(By.xpath("(//td[@class='truncate au-target'])[6]")).getText(), "2022 Interno Não Realizado");
    }

    @Test
    public void contratoExternoRealizado_2022(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@class='truncate au-target'])[7]")));
        Assert.assertEquals(driver.findElement(By.xpath("(//td[@class='truncate au-target'])[7]")).getText(), "2022 Externo Realizado");
    }

    @Test
    public void contratoExternoNaoRealizado_2022(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@class='truncate au-target'])[5]")));
        Assert.assertEquals(driver.findElement(By.xpath("(//td[@class='truncate au-target'])[5]")).getText(), "2022 Externo Não Realizado");
    }
/*
    @AfterClass
    public static void fimTeste(){
        driver.quit();
    }

 */

}
