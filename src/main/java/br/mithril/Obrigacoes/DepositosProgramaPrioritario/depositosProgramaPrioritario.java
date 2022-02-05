package br.mithril.Obrigacoes.DepositosProgramaPrioritario;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.InputEvent;
import java.time.Duration;

public class depositosProgramaPrioritario {

    private static final ChromeDriver driver = new ChromeDriver();
    private static final WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(20));

    public static void adicionarDepositoProgramaPrioritario()  throws AWTException, InterruptedException{
        Robot bot = new Robot();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a/span[text()='Obrigações'])[1]")));
        driver.findElement(By.xpath("(//a/span[text()='Obrigações'])[1]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a/span[text()='Depósitos no Programa Prioritário']")));
        driver.findElement(By.xpath("//a/span[text()='Depósitos no Programa Prioritário']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("btn_new")));
        driver.findElement(By.id("btn_new")).click();
        //Ano Base
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='base-year']")));
        driver.findElement(By.xpath("//input[@name='base-year']")).sendKeys("2022");
        //Valor do Depósito
        driver.findElement(By.xpath("//input[@step.bind='mdStep']")).sendKeys("1000");
        //Tipo
        driver.findElement(By.xpath("//input[@value='Escolha o tipo de depósito']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li/span[text()='Economia Digital']")));
        driver.findElement(By.xpath("//li/span[text()='Economia Digital']")).click();
        //Coordenadora do Programa
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='cordinator']")));
        driver.findElement(By.xpath("//input[@name='cordinator']")).sendKeys("test");
        //Tipo
        driver.findElement(By.xpath("//input[@value='Selecione o Tipo']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li/span[text()='PPB'])[2]")));
        driver.findElement(By.xpath("(//li/span[text()='PPB'])[2]")).click();
        //Fumisso
        driver.findElement(By.xpath("(//div[@class='file-field input-field'])[1]")).click();
        bot.mouseMove(299,252);
        Thread.sleep(1000);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        //Recibo
        driver.findElement(By.xpath("(//div[@class='file-field input-field'])[2]")).click();
        bot.mouseMove(299,252);
        Thread.sleep(1000);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("btn_save")));
        driver.findElement(By.id("btn_save")).click();
    }
}
