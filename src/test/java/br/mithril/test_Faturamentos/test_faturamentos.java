package br.mithril.test_Faturamentos;

import br.mithril.test_Login.login;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

import static br.mithril.test_FunilInovacao.test_adicionarIdeia.driver;

public class test_faturamentos {

    public static login loginSis = new login();
    public static faturamentos fatu = new faturamentos();

    @BeforeClass
    public static void inicial() throws InterruptedException {
        loginSis.loginSistema();
        //2022
        fatu.adicionarFaturamento("2022","Lei de Informática");
        fatu.adicionarFaturamento("2022","PPB");
        //2021
        fatu.adicionarFaturamento("2021","Lei de Informática");
        fatu.adicionarFaturamento("2021","PPB");
    }

    @Test
    public void leiInformatica_2021() {

        Assert.assertEquals(driver.findElement(By.xpath("(//td[text()='Lei de Informática'])[3]")).getText(), "Lei de Informática");
    }

    @Test
    public void leiInformatica_2022() {

        Assert.assertEquals(driver.findElement(By.xpath("(//td[text()='Lei de Informática'])[1]")).getText(), "Lei de Informática");
    }

    //Em análise - ok
    @Test
    public void ppb_2021(){

        Assert.assertEquals(driver.findElement(By.xpath("(//td[text()='PPB'])[3]")).getText(), "PPB");
    }

    @Test
    public void ppb_2022(){

        Assert.assertEquals(driver.findElement(By.xpath("(//td[text()='PPB'])[1]")).getText(), "PPB");
    }

    @AfterClass
    public static void fimTeste(){
        driver.quit();
    }

}
