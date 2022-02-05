package br.mithril.Obrigacoes.DepositosFNDCT;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class depositosFNDCT {

    private static final ChromeDriver driver = new ChromeDriver();
    private static final WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(20));

    public static void adicionarDepositoFNDCT(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a/span[text()='Obrigações'])[1]")));
        driver.findElement(By.xpath("(//a/span[text()='Obrigações'])[1]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a/span[text()='Depósitos no FNDCT']")));
        driver.findElement(By.xpath("//a/span[text()='Depósitos no FNDCT']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("btn_add")));
        driver.findElement(By.id("btn_add")).click();
        //Ano Base
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Informe o ano base']")));
        driver.findElement(By.xpath("//input[@placeholder='Informe o ano base']")).sendKeys("2022");
        //Data planejada
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[text()='today'])[1]")));
        driver.findElement(By.xpath("(//i[text()='today'])[1]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@aria-label='01/01/2022'])[1]")));
        driver.findElement(By.xpath("(//div[@aria-label='01/01/2022'])[1]")).click();
        //Valor do Depósito
        wait.until(ExpectedConditions.elementToBeClickable(By.id("valor")));
        driver.findElement(By.id("valor")).sendKeys("1000");
        //Salvar
        wait.until(ExpectedConditions.elementToBeClickable(By.id("btn_save")));
        driver.findElement(By.id("btn_save")).click();
    }
}
