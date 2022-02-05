package br.mithril.Projeto.anoBase;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class anoBase {

    private static final ChromeDriver driver = new ChromeDriver();
    private static final WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(20));

    public static void adicionarAnoBase(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a/span[text()='Projetos'])[1]")));
        driver.findElement(By.xpath("(//a/span[text()='Projetos'])[1]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a/span[text()='Ano Base']")));
        driver.findElement(By.xpath("//a/span[text()='Ano Base']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("btn_create")));
        driver.findElement(By.id("btn_create")).click();
        //Ano Base
        wait.until(ExpectedConditions.elementToBeClickable(By.id("year")));
        driver.findElement(By.id("year")).clear();
        driver.findElement(By.id("year")).sendKeys("2022");
        //Projeto
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Selecione um projeto' and @class='select-dropdown']")));
        driver.findElement(By.xpath("//input[@value='Selecione um projeto' and @class='select-dropdown']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li/span[text()='Projeto 01 Externo PPB']")));
        driver.findElement(By.xpath("//li/span[text()='Projeto 01 Externo PPB']")).click();
        //Situação do Projeto
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Em andamento' and @class='select-dropdown']")));
        driver.findElement(By.xpath("//input[@value='Em andamento' and @class='select-dropdown']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li/span[text()='Em andamento']")));
        driver.findElement(By.xpath("//li/span[text()='Em andamento']")).click();
        //Data inicial Execução do projeto
        driver.findElement(By.xpath("(//div/i[text()='today'])[1]")).click();
        driver.findElement(By.xpath("//div[@aria-label='01/01/2022']")).click();
        //Data final Execução do projeto
        driver.findElement(By.xpath("(//div/i[text()='today'])[2]")).click();
        driver.findElement(By.xpath("(//select[@class='picker__select--month browser-default'])[2]")).click();
        driver.findElement(By.xpath("(//select[@class='picker__select--month browser-default'])[2]/option[text()='dezembro']")).click();
        driver.findElement(By.xpath("//div[@aria-label='31/12/2022']")).click();
        //Data inicial Execução do Ano Base
        driver.findElement(By.xpath("(//div/i[text()='today'])[3]")).click();
        driver.findElement(By.xpath("(//div[@aria-label='01/01/2022'])[2]")).click();
        //Data final Execução do Ano Base
        driver.findElement(By.xpath("(//div/i[text()='today'])[4]")).click();
        driver.findElement(By.xpath("(//select[@class='picker__select--month browser-default'])[4]")).click();
        driver.findElement(By.xpath("(//select[@class='picker__select--month browser-default'])[4]/option[text()='dezembro']")).click();
        driver.findElement(By.xpath("(//div[@aria-label='31/12/2022'])[2]")).click();
        //Classe do Projeto
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Selecione a Classe do Projeto' and @class='select-dropdown']")));
        //driver.findElement(By.xpath("//input[@value='Selecione a Classe do Projeto' and @class='select-dropdown']")).click();
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li/span[text()='Interno']")));
        //driver.findElement(By.xpath("//li/span[text()='Interno']")).click();
        driver.findElement(By.id("btn_save")).click();
    }
}
