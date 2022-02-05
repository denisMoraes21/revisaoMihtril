package br.mithril.dispendios.outrosDispendios;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class outrosDispendios {

    private static final ChromeDriver driver = new ChromeDriver();
    private static final WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(20));

    public static void adicionarOutrosContratos(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a/span[text()='Dispêndios'])[1]")));
        driver.findElement(By.xpath("(//a/span[text()='Dispêndios'])[1]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a/span[text()='Outros Dispêndios']")));
        driver.findElement(By.xpath("//a/span[text()='Outros Dispêndios']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("btn_create")));
        driver.findElement(By.id("btn_create")).click();
        //Data de Emissão
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[text()='today'])[1]")));
        driver.findElement(By.xpath("(//i[text()='today'])[1]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@aria-label='01/01/2022'])[1]")));
        driver.findElement(By.xpath("(//div[@aria-label='01/01/2022'])[1]")).click();
        //Nota Fiscal
        driver.findElement(By.id("object_invoice")).sendKeys("1234");
        //Valor
        driver.findElement(By.id("object_value")).sendKeys("1000");
        //Fornecedor
        driver.findElement(By.id("supplier")).sendKeys("teste");
        //CNPJ
        driver.findElement(By.id("cnpj")).sendKeys("24176998000148");
        //Descriçõa
        driver.findElement(By.id("description")).sendKeys("teste");
        driver.findElement(By.xpath("//button[text()='Avançar']")).click();
    }
}
