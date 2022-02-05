package br.mithril.Obrigacoes.TermosAditivos;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.InputEvent;
import java.time.Duration;

public class termosAditivos {

    private static final ChromeDriver driver = new ChromeDriver();
    private static final WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(20));

    public static void adicionarTermoAditivo() throws AWTException, InterruptedException {
        Robot bot = new Robot();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a/span[text()='Obrigações'])[1]")));
        driver.findElement(By.xpath("(//a/span[text()='Obrigações'])[1]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a/span[text()='Termos Aditivos']")));
        driver.findElement(By.xpath("//a/span[text()='Termos Aditivos']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("btn_create")));
        driver.findElement(By.id("btn_create")).click();
        //Ano Base
        wait.until(ExpectedConditions.elementToBeClickable(By.id("ano")));
        driver.findElement(By.id("ano")).clear();
        driver.findElement(By.id("ano")).sendKeys("2022");
        //Projeto
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Selecione um projeto' and @class='select-dropdown']")));
        driver.findElement(By.xpath("//input[@value='Selecione um projeto' and @class='select-dropdown']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li/span[text()='Projeto 01 Externo PPB'])[1]")));
        driver.findElement(By.xpath("(//li/span[text()='Projeto 01 Externo PPB'])[1]")).click();
        //Instituição Geral
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Selecione uma instituição' and @class='select-dropdown']")));
        driver.findElement(By.xpath("//input[@value='Selecione uma instituição' and @class='select-dropdown']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li/span[text()='FPF']")));
        driver.findElement(By.xpath("//li/span[text()='FPF']")).click();
        //Termo Aditivo
        driver.findElement(By.id("addendum_name")).sendKeys("Termo 01 Externo PPB");
        //Data final Período de Vigência
        driver.findElement(By.xpath("(//div/i[text()='today'])[4]")).click();
        driver.findElement(By.xpath("(//select[@class='picker__select--month browser-default'])[4]")).click();
        driver.findElement(By.xpath("(//select[@class='picker__select--month browser-default'])[4]/option[text()='dezembro']")).click();
        driver.findElement(By.xpath("//div[@aria-label='31/12/2022']")).click();
        //Valor
        driver.findElement(By.id("md-input-0")).sendKeys("1000");
        //Objeto do Termo Aditivo
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Selecione um tipo de objeto' and @class='select-dropdown']")));
        driver.findElement(By.xpath("//input[@value='Selecione um tipo de objeto' and @class='select-dropdown']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li/span[text()='Alteração do prazo de execução']")));
        driver.findElement(By.xpath("//li/span[text()='Alteração do prazo de execução']")).click();
        driver.findElement(By.id("md-input-0")).click();
        //Termo Aditivo Digitalizado
        driver.findElement(By.xpath("(//div[@class='file-field input-field'])[1]")).click();
        bot.mouseMove(299,252);
        Thread.sleep(1000);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        //Análise de risco
        driver.findElement(By.xpath("(//div[@class='file-field input-field'])[2]")).click();
        bot.mouseMove(299,252);
        Thread.sleep(1000);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        //Fumisso
        driver.findElement(By.xpath("(//div[@class='file-field input-field'])[3]")).click();
        bot.mouseMove(299,252);
        Thread.sleep(1000);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        driver.findElement(By.xpath("(//button[text()='Avançar'])[1]")).click();

        //Definir Cronograma de Aportes

        //Data de vencimento
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[text()='today'])[6]")));
        driver.findElement(By.xpath("(//i[text()='today'])[6]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@aria-label='31/01/2022'])[5]")));
        driver.findElement(By.xpath("(//div[@aria-label='31/01/2022'])[5]")).click();
        //Valor
        driver.findElement(By.id("md-input-1")).sendKeys("300");
        driver.findElement(By.xpath("//button[text()='Adicionar']")).click();
        Thread.sleep(2000);

        //Data de vencimento
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[text()='today'])[6]")));
        driver.findElement(By.xpath("(//i[text()='today'])[6]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@aria-label='31/01/2022'])[5]")));
        driver.findElement(By.xpath("(//div[@aria-label='31/01/2022'])[5]")).click();
        //Valor
        driver.findElement(By.id("md-input-1")).clear();
        driver.findElement(By.id("md-input-1")).sendKeys("400");
        driver.findElement(By.xpath("//button[text()='Adicionar']")).click();
        Thread.sleep(2000);

        //Data realizada
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[text()='mode_edit'])[1]")));
        driver.findElement(By.xpath("(//i[text()='mode_edit'])[1]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[text()='today'])[8]")));
        driver.findElement(By.xpath("(//i[text()='today'])[8]")).click();
        driver.findElement(By.xpath("(//div[@aria-label='01/01/2022'])[7]")).click();
        //Data N.F.
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[text()='today'])[9]")));
        driver.findElement(By.xpath("(//i[text()='today'])[9]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@aria-label='01/01/2022'])[8]")));
        driver.findElement(By.xpath("(//div[@aria-label='01/01/2022'])[8]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[text()='check'])[1]")));
        driver.findElement(By.xpath("(//i[text()='check'])[1]")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-success au-target']")).click();
    }
}
