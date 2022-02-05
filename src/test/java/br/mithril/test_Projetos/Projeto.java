package br.mithril.test_Projetos;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Objects;

import static br.mithril.test_FunilInovacao.test_adicionarIdeia.driver;
import static br.mithril.test_FunilInovacao.test_adicionarIdeia.wait;

public class Projeto {

    /*
    public static void main(String[] args) throws InterruptedException {
        loginSis.loginSistema();
        adicionarProjeto("PPB 2022 Interno RM","2022", "Interno", "PPB", "Sim");
        adicionarProjeto("PPB 2022 Interno","2022", "Interno", "PPB", "Não");
    }
     */

    public void entrarProjeto(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Projetos'])[1]")));
        driver.findElement(By.xpath("(//span[text()='Projetos'])[1]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Projetos'])[2]")));
        driver.findElement(By.xpath("(//span[text()='Projetos'])[2]")).click();
    }

    public void adicionarProjeto(String nome, String anoBase, String areaAplicacao, String tipo, String regiaoMetropolitana) throws InterruptedException {
        entrarProjeto();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("btn_create")));
        driver.findElement(By.id("btn_create")).click();

        //Solicitação da Proposta
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Solicitação da Proposta']")));
        driver.findElement(By.xpath("//input[@value='Solicitação da Proposta']")).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li/span[text()='Duplicada'])[2]")));
        driver.findElement(By.xpath("(//li/span[text()='Duplicada'])[2]")).click();

        //Título
        wait.until(ExpectedConditions.elementToBeClickable(By.id("nome")));
        driver.findElement(By.id("nome")).sendKeys(nome);

        //Área de Aplicação
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Selecione a Área de Aplicação' and @class='select-dropdown']")));
        driver.findElement(By.xpath("//input[@value='Selecione a Área de Aplicação' and @class='select-dropdown']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li/span[text()='"+areaAplicacao+"']")));
        driver.findElement(By.xpath("//li/span[text()='"+areaAplicacao+"']")).click();

        //Enquadrabilidade
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Selecione a Enquadrabilidade']")));
        driver.findElement(By.xpath("//input[@value='Selecione a Enquadrabilidade']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li/span[text()='Pesquisa Básica']")));
        driver.findElement(By.xpath("//li/span[text()='Pesquisa Básica']")).click();

        //Período de execução do projeto
        //2021
        if (Objects.equals(anoBase, "2021")){
            //Data inicial - ok
            driver.findElement(By.xpath("(//i[text()='today'])[1]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@title='Selecione um mês'])[1]")));
            driver.findElement(By.xpath("(//select[@title='Selecione um mês'])[1]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//option[text()='janeiro'])[1]")));
            driver.findElement(By.xpath("(//option[text()='janeiro'])[1]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@title='Selecione um ano'])[1]")));
            driver.findElement(By.xpath("(//select[@title='Selecione um ano'])[1]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//select/option[text()='2021'])[1]")));
            driver.findElement(By.xpath("(//select/option[text()='2021'])[1]")).click();
            driver.findElement(By.xpath("//div[@aria-label='01/01/2021']")).click();
            //Data final - ok
            driver.findElement(By.xpath("(//i[text()='today'])[2]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@title='Selecione um mês'])[2]")));
            driver.findElement(By.xpath("(//select[@title='Selecione um mês'])[2]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//option[text()='dezembro'])[2]")));
            driver.findElement(By.xpath("(//option[text()='dezembro'])[2]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@title='Selecione um ano'])[2]")));
            driver.findElement(By.xpath("(//select[@title='Selecione um ano'])[2]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//select/option[text()='2021'])[2]")));
            driver.findElement(By.xpath("(//select/option[text()='2021'])[2]")).click();
            driver.findElement(By.xpath("//div[@aria-label='31/12/2021']")).click();
        }

        //2022
        if (Objects.equals(anoBase, "2022")){
            //Data inicial - ok
            driver.findElement(By.xpath("(//i[text()='today'])[1]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@title='Selecione um mês'])[1]")));
            driver.findElement(By.xpath("(//select[@title='Selecione um mês'])[1]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//option[text()='janeiro'])[1]")));
            driver.findElement(By.xpath("(//option[text()='janeiro'])[1]")).click();
            driver.findElement(By.xpath("(//div[@aria-label='01/01/2022'])[1]")).click();
            //Data final - ok
            driver.findElement(By.xpath("(//i[text()='today'])[2]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@title='Selecione um mês'])[2]")));
            driver.findElement(By.xpath("(//select[@title='Selecione um mês'])[2]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//option[text()='dezembro'])[2]")));
            driver.findElement(By.xpath("(//option[text()='dezembro'])[2]")).click();
            driver.findElement(By.xpath("//div[@aria-label='31/12/2022']")).click();
        }

        //Tipo
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Selecione o Tipo']")));
        driver.findElement(By.xpath("//input[@value='Selecione o Tipo']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li/span[text()='"+tipo+"'])[2]")));
        driver.findElement(By.xpath("(//li/span[text()='"+tipo+"'])[2]")).click();

        //Região Metropolitana
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Sim']")));
        driver.findElement(By.xpath("//input[@value='Sim']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li/span[text()='"+regiaoMetropolitana+"']")));
        driver.findElement(By.xpath("//li/span[text()='"+regiaoMetropolitana+"']")).click();

        //Área do projeto
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Selecione a Área de atuação do projeto']")));
        driver.findElement(By.xpath("//input[@value='Selecione a Área de atuação do projeto']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='select-wrapper au-target']/ul/li/span[text()='Teste']")));
        driver.findElement(By.xpath("//div[@class='select-wrapper au-target']/ul/li/span[text()='Teste']")).click();

        //Salvar
        driver.findElement(By.id("save")).click();
        Thread.sleep(2000);
    }
}
