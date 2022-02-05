package br.mithril.test_FunilInovacao;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static br.mithril.test_FunilInovacao.test_adicionarIdeia.driver;
import static br.mithril.test_FunilInovacao.test_adicionarIdeia.wait;

public class avaliacaoIdeias {

    public void adicionarIdeia(String situacao, String anoBase){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a/span[text()='Funil de inovação']")));
        driver.findElement(By.xpath("//a/span[text()='Funil de inovação']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a/span[text()='Avaliação de Ideias']")));
        driver.findElement(By.xpath("//a/span[text()='Avaliação de Ideias']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("btn_new")));
        driver.findElement(By.id("btn_new")).click();

        //Mudar nome da ideia
        wait.until(ExpectedConditions.elementToBeClickable(By.id("nome")));
        driver.findElement(By.id("nome")).sendKeys(situacao);

        //Mudar situação
        driver.findElement(By.xpath("//input[@readonly='true' and @value='Banco de Ideias']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li/span[text()='"+situacao+"']")));
        driver.findElement(By.xpath("//li/span[text()='"+situacao+"']")).click();

        //Mudar nome do colaborador
        driver.findElement(By.id("colaborador")).sendKeys("teste");

        //Mudar matricula
        driver.findElement(By.id("matricula")).sendKeys("1234");

        //Mudar Origem da Ideia
        driver.findElement(By.id("origin")).sendKeys("teste");

        //Mudar Ano Base
        driver.findElement(By.id("year")).sendKeys(anoBase);

        //Mudar Descrição
        driver.findElement(By.id("descricao")).sendKeys("teste");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-success au-target']")));
        driver.findElement(By.xpath("//button[@class='btn btn-success au-target']")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='toast toast-success']")));
        driver.findElement(By.xpath("//div[@class='toast toast-success']")).click();
    }
}
