package br.mithril.test_Projetos;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

import static br.mithril.test_Faturamentos.test_faturamentos.loginSis;
import static br.mithril.test_FunilInovacao.test_adicionarIdeia.driver;

public class test_projetos {

    static Projeto proj = new Projeto();

    @BeforeClass
    public static void inicial() throws InterruptedException {
        loginSis.loginSistema();
        //2022
        proj.adicionarProjeto("PPB 2022 Interno RM","2022", "Interno", "PPB", "Sim");
        proj.adicionarProjeto("PPB 2022 Interno","2022", "Interno", "PPB", "Não");
        proj.adicionarProjeto("Lei 2022 Interno RM","2022", "Interno", "Lei de Informática", "Sim");
        proj.adicionarProjeto("Lei 2022 Interno","2022", "Interno", "Lei de Informática", "Não");
        proj.adicionarProjeto("PPB 2022 Externo RM","2022", "Externo", "PPB", "Sim");
        proj.adicionarProjeto("PPB 2022 Externo","2022", "Externo", "PPB", "Não");
        proj.adicionarProjeto("Lei 2022 Externo RM","2022", "Externo", "Lei de Informática", "Sim");
        proj.adicionarProjeto("Lei 2022 Externo","2022", "Externo", "Lei de Informática", "Não");
        //2021
        proj.adicionarProjeto("PPB 2021 Interno RM","2021", "Interno", "PPB", "Sim");
        proj.adicionarProjeto("PPB 2021 Interno","2021", "Interno", "PPB", "Não");
        proj.adicionarProjeto("Lei 2021 Interno RM","2021", "Interno", "Lei de Informática", "Sim");
        proj.adicionarProjeto("Lei 2021 Interno","2021", "Interno", "Lei de Informática", "Não");
        proj.adicionarProjeto("PPB 2021 Externo RM","2021", "Externo", "PPB", "Sim");
        proj.adicionarProjeto("PPB 2021 Externo","2021", "Externo", "PPB", "Não");
        proj.adicionarProjeto("Lei 2021 Externo RM","2021", "Externo", "Lei de Informática", "Sim");
        proj.adicionarProjeto("Lei 2021 Externo","2021", "Externo", "Lei de Informática", "Não");
        //Entrar Projeto
        proj.entrarProjeto();
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
