package br.mithril.test_Faturamentos;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Objects;

import static br.mithril.test_FunilInovacao.test_adicionarIdeia.driver;
import static br.mithril.test_FunilInovacao.test_adicionarIdeia.wait;

public class faturamentos {

    // Regra: Não se pode criar faturamentos no mesmo período
    public static void adicionarFaturamento(String anoBase, String nome) throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a/span[contains(text(),'Faturamentos')]")));
        driver.findElement(By.xpath("//a/span[contains(text(),'Faturamentos')]")).click();
        Thread.sleep(500);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("btn_new")));
        driver.findElement(By.id("btn_new")).click();

        //Ano base
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@name='base-year'])[1]")));
        driver.findElement(By.xpath("(//input[@name='base-year'])[1]")).sendKeys(anoBase);

        //Período do Faturamento
        //Lei de Informática - 2022 - ok
        if (Objects.equals(anoBase, "2022") && Objects.equals(nome, "Lei de Informática")){
            //Data inicial - ok
            driver.findElement(By.xpath("(//i[text()='today'])[1]")).click();
            driver.findElement(By.xpath("//div[@aria-label='01/01/2022']")).click();
            //Data final - ok
            driver.findElement(By.xpath("(//i[text()='today'])[2]")).click();
            driver.findElement(By.xpath("(//select[@title='Selecione um mês'])[2]")).click();
            driver.findElement(By.xpath("(//select/option[text()='junho'])[2]")).click();
            driver.findElement(By.xpath("//div[@aria-label='30/06/2022']")).click();
        }

        //PPB - 2022 - ok
        if (Objects.equals(anoBase, "2022") && Objects.equals(nome, "PPB")){
            //Data inicial - ok
            driver.findElement(By.xpath("(//i[text()='today'])[1]")).click();
            driver.findElement(By.xpath("(//select[@title='Selecione um mês'])[1]")).click();
            driver.findElement(By.xpath("(//select/option[text()='julho'])[1]")).click();
            driver.findElement(By.xpath("//div[@aria-label='01/07/2022']")).click();
            //Data final - ok
            driver.findElement(By.xpath("(//i[text()='today'])[2]")).click();
            driver.findElement(By.xpath("(//select[@title='Selecione um mês'])[2]")).click();
            driver.findElement(By.xpath("(//select/option[text()='dezembro'])[2]")).click();
            driver.findElement(By.xpath("//div[@aria-label='31/12/2022']")).click();
        }

        //Lei de Informática - 2021
        if (Objects.equals(anoBase, "2021") && Objects.equals(nome, "Lei de Informática")){
            //Data inicial - ok
            driver.findElement(By.xpath("(//i[text()='today'])[1]")).click();
            driver.findElement(By.xpath("(//select[@title='Selecione um ano'])[1]")).click();
            driver.findElement(By.xpath("(//select/option[text()='2021'])[1]")).click();
            driver.findElement(By.xpath("//div[@aria-label='01/01/2021']")).click();
            //Data final - ok
            driver.findElement(By.xpath("(//i[text()='today'])[2]")).click();
            driver.findElement(By.xpath("(//select[@title='Selecione um ano'])[2]")).click();
            driver.findElement(By.xpath("(//select/option[text()='2021'])[2]")).click();
            driver.findElement(By.xpath("(//select/option[text()='junho'])[2]")).click();
            driver.findElement(By.xpath("//div[@aria-label='30/06/2021']")).click();
        }

        //PPB - 2021
        if (Objects.equals(anoBase, "2021") && Objects.equals(nome, "PPB")){
            //Data inicial
            driver.findElement(By.xpath("(//i[text()='today'])[1]")).click();
            driver.findElement(By.xpath("(//select[@title='Selecione um ano'])[1]")).click();
            driver.findElement(By.xpath("(//select/option[text()='2021'])[1]")).click();
            driver.findElement(By.xpath("(//select/option[text()='julho'])[1]")).click();
            driver.findElement(By.xpath("//div[@aria-label='01/07/2021']")).click();

            //Data final - ok
            driver.findElement(By.xpath("(//i[text()='today'])[2]")).click();
            driver.findElement(By.xpath("(//select[@title='Selecione um ano'])[2]")).click();
            driver.findElement(By.xpath("(//select/option[text()='2021'])[2]")).click();
            driver.findElement(By.xpath("(//select/option[text()='dezembro'])[2]")).click();
            driver.findElement(By.xpath("//div[@aria-label='31/12/2021']")).click();
        }

        //Tipo
        driver.findElement(By.xpath("//input[@value='Selecione o Tipo']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li/span[text()='"+nome+"'])[2]")));
        driver.findElement(By.xpath("(//li/span[text()='"+nome+"'])[2]")).click();

        //Nome do produto
        driver.findElement(By.xpath("//input[@name='product-name']")).sendKeys(nome);

        //Código suframa
        driver.findElement(By.xpath("//input[@name='suframa-code']")).sendKeys("1234");

        //Código NCM
        driver.findElement(By.id("ncm")).sendKeys("1234");

        //Faturamento bruto
        driver.findElement(By.id("gross_sales")).sendKeys("10000");

        //COFINS
        driver.findElement(By.id("cofins")).sendKeys("1000");

        //ICMS
        driver.findElement(By.id("icms")).sendKeys("1000");

        //ISS
        driver.findElement(By.id("iss")).sendKeys("1000");

        //PIS
        driver.findElement(By.id("pis")).sendKeys("1000");

        //IPI
        driver.findElement(By.id("ipi")).sendKeys("1000");

        //Obrigação
        driver.findElement(By.xpath("//input[@step.bind='mdStep']")).sendKeys("10");

        //salvar
        wait.until(ExpectedConditions.elementToBeClickable(By.id("btn_save")));
        driver.findElement(By.id("btn_save")).click();

        //Menssagem de sucesso
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Faturamento salvo com sucesso']")));
        driver.findElement(By.xpath("//div[text()='Faturamento salvo com sucesso']")).click();
    }
}
