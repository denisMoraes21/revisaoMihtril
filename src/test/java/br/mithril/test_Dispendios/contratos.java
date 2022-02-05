package br.mithril.test_Dispendios;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Objects;

import static br.mithril.test_FunilInovacao.test_adicionarIdeia.driver;
import static br.mithril.test_FunilInovacao.test_adicionarIdeia.wait;

public class contratos {

    public void entrarContratos(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a/span[text()='Dispêndios'])")));
        driver.findElement(By.xpath("(//a/span[text()='Dispêndios'])")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a/span[text()='Contratos']")));
        driver.findElement(By.xpath("//a/span[text()='Contratos']")).click();
    }

    public void adicionarContratos(String title, String anoBase, String classe, String realizado){
        entrarContratos();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("btn_create")));
        driver.findElement(By.id("btn_create")).click();

        //Descrição resumida
        wait.until(ExpectedConditions.elementToBeClickable(By.id("brief_description")));
        driver.findElement(By.id("brief_description")).sendKeys(title);

        //Objeto do Contrato
        wait.until(ExpectedConditions.elementToBeClickable(By.id("object_contract")));
        driver.findElement(By.id("object_contract")).sendKeys(title);

        //Ano Base
        driver.findElement(By.xpath("//input[@id='base_year']")).clear();
        driver.findElement(By.xpath("//input[@id='base_year']")).sendKeys(anoBase);

        //Classe do Projeto
        driver.findElement(By.xpath("//input[@value='Selecione a Classe do Projeto']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li/span[text()='"+classe+"']")));
        driver.findElement(By.xpath("//li/span[text()='"+classe+"']")).click();

        //Value
        driver.findElement(By.id("value")).sendKeys("100000");

        //Tipo de dispêndio
        driver.findElement(By.xpath("//input[@value='Selecione o Tipo de Dispêndio']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li/span[text()='Treinamentos']")));
        driver.findElement(By.xpath("//li/span[text()='Treinamentos']")).click();

        if (Objects.equals(anoBase, "2022")){
            //Período Execução do Serviço
            //Data Inicial
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[text()='today'])[1]")));
            driver.findElement(By.xpath("(//i[text()='today'])[1]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@title='Selecione um mês'])[1]")));
            driver.findElement(By.xpath("(//select[@title='Selecione um mês'])[1]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//option[text()='janeiro'])[1]")));
            driver.findElement(By.xpath("(//option[text()='janeiro'])[1]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@title='Selecione um ano'])[1]")));
            driver.findElement(By.xpath("(//select[@title='Selecione um ano'])[1]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//option[text()='2022'])[1]")));
            driver.findElement(By.xpath("(//option[text()='2022'])[1]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@aria-label='01/01/2022'])[1]")));
            driver.findElement(By.xpath("(//div[@aria-label='01/01/2022'])[1]")).click();

            //Data Final
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[text()='today'])[2]")));
            driver.findElement(By.xpath("(//i[text()='today'])[2]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@title='Selecione um mês'])[2]")));
            driver.findElement(By.xpath("(//select[@title='Selecione um mês'])[2]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//option[text()='dezembro'])[2]")));
            driver.findElement(By.xpath("(//option[text()='dezembro'])[2]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@title='Selecione um ano'])[2]")));
            driver.findElement(By.xpath("(//select[@title='Selecione um ano'])[2]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//option[@value='2022'])[2]")));
            driver.findElement(By.xpath("(//option[@value='2022'])[2]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@aria-label='31/12/2022']")));
            driver.findElement(By.xpath("//div[@aria-label='31/12/2022']")).click();

            //Período de vigência de Contrato
            //Data Inicial
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[text()='today'])[3]")));
            driver.findElement(By.xpath("(//i[text()='today'])[3]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@title='Selecione um mês'])[3]")));
            driver.findElement(By.xpath("(//select[@title='Selecione um mês'])[3]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//option[text()='janeiro'])[3]")));
            driver.findElement(By.xpath("(//option[text()='janeiro'])[3]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@aria-label='01/01/2022'])[2]")));
            driver.findElement(By.xpath("(//div[@aria-label='01/01/2022'])[2]")).click();

            //Data Final
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[text()='today'])[4]")));
            driver.findElement(By.xpath("(//i[text()='today'])[4]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@title='Selecione um mês'])[4]")));
            driver.findElement(By.xpath("(//select[@title='Selecione um mês'])[4]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//option[text()='dezembro'])[4]")));
            driver.findElement(By.xpath("(//option[text()='dezembro'])[4]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@aria-label='31/12/2022'])[2]")));
            driver.findElement(By.xpath("(//div[@aria-label='31/12/2022'])[2]")).click();
        }

        if (Objects.equals(anoBase, "2021")){
            //Período Execução do Serviço
            //Data Inicial
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[text()='today'])[1]")));
            driver.findElement(By.xpath("(//i[text()='today'])[1]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@title='Selecione um mês'])[1]")));
            driver.findElement(By.xpath("(//select[@title='Selecione um mês'])[1]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//option[text()='janeiro'])[1]")));
            driver.findElement(By.xpath("(//option[text()='janeiro'])[1]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@title='Selecione um ano'])[1]")));
            driver.findElement(By.xpath("(//select[@title='Selecione um ano'])[1]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//option[text()='2021'])[1]")));
            driver.findElement(By.xpath("(//option[text()='2021'])[1]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@aria-label='01/01/2021']")));
            driver.findElement(By.xpath("//div[@aria-label='01/01/2021']")).click();

            //Data Final
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[text()='today'])[2]")));
            driver.findElement(By.xpath("(//i[text()='today'])[2]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@title='Selecione um mês'])[2]")));
            driver.findElement(By.xpath("(//select[@title='Selecione um mês'])[2]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//option[text()='dezembro'])[2]")));
            driver.findElement(By.xpath("(//option[text()='dezembro'])[2]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@title='Selecione um ano'])[2]")));
            driver.findElement(By.xpath("(//select[@title='Selecione um ano'])[2]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//option[text()='2021'])[2]")));
            driver.findElement(By.xpath("(//option[text()='2021'])[2]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@aria-label='31/12/2021']")));
            driver.findElement(By.xpath("//div[@aria-label='31/12/2021']")).click();

            //Período de vigência de Contrato

            //Data Inicial
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[text()='today'])[3]")));
            driver.findElement(By.xpath("(//i[text()='today'])[3]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@title='Selecione um mês'])[3]")));
            driver.findElement(By.xpath("(//select[@title='Selecione um mês'])[3]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//option[text()='janeiro'])[3]")));
            driver.findElement(By.xpath("(//option[text()='janeiro'])[3]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@title='Selecione um ano'])[3]")));
            driver.findElement(By.xpath("(//select[@title='Selecione um ano'])[3]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//option[text()='2021'])[3]")));
            driver.findElement(By.xpath("(//option[text()='2021'])[3]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@aria-label='01/01/2021'])[2]")));
            driver.findElement(By.xpath("(//div[@aria-label='01/01/2021'])[2]")).click();

            //Data Final
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[text()='today'])[4]")));
            driver.findElement(By.xpath("(//i[text()='today'])[4]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@title='Selecione um mês'])[4]")));
            driver.findElement(By.xpath("(//select[@title='Selecione um mês'])[4]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//option[text()='dezembro'])[4]")));
            driver.findElement(By.xpath("(//option[text()='dezembro'])[4]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@title='Selecione um ano'])[4]")));
            driver.findElement(By.xpath("(//select[@title='Selecione um ano'])[4]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//option[text()='2021'])[4]")));
            driver.findElement(By.xpath("(//option[text()='2021'])[4]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@aria-label='31/12/2021'])[2]")));
            driver.findElement(By.xpath("(//div[@aria-label='31/12/2021'])[2]")).click();
        }

        //Salvar
        driver.findElement(By.id("save")).click();

        /* Adicionar cronograma de pagamentos */
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[text()='"+title+"']")));
        driver.findElement(By.xpath("//td[text()='"+title+"']")).click();

        //Adicionar Cronograma de Pagamentos - Sem Data Realizada
        if(Objects.equals(realizado, "Não")){
            wait.until(ExpectedConditions.elementToBeClickable(By.id("btn_new")));
            driver.findElement(By.id("btn_new")).click();

            //Data de vencimento
            if (Objects.equals(anoBase, "2022")){
                //Data de vencimento
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[text()='today'])[1]")));
                driver.findElement(By.xpath("(//i[text()='today'])[1]")).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@title='Selecione um mês'])[1]")));
                driver.findElement(By.xpath("(//select[@title='Selecione um mês'])[1]")).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//option[text()='janeiro'])[1]")));
                driver.findElement(By.xpath("(//option[text()='janeiro'])[1]")).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@title='Selecione um ano'])[1]")));
                driver.findElement(By.xpath("(//select[@title='Selecione um ano'])[1]")).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//option[@value='2022'])[1]")));
                driver.findElement(By.xpath("(//option[@value='2022'])[1]")).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@aria-label='01/01/2022'])[1]")));
                driver.findElement(By.xpath("(//div[@aria-label='01/01/2022'])[1]")).click();
            }

            if (Objects.equals(anoBase, "2021")){
                //Data de vencimento
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[text()='today'])[1]")));
                driver.findElement(By.xpath("(//i[text()='today'])[1]")).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@title='Selecione um mês'])[1]")));
                driver.findElement(By.xpath("(//select[@title='Selecione um mês'])[1]")).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//option[text()='janeiro'])[1]")));
                driver.findElement(By.xpath("(//option[text()='janeiro'])[1]")).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@title='Selecione um ano'])[1]")));
                driver.findElement(By.xpath("(//select[@title='Selecione um ano'])[1]")).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//option[@value='2021'])[1]")));
                driver.findElement(By.xpath("(//option[@value='2021'])[1]")).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@aria-label='01/01/2021'])[1]")));
                driver.findElement(By.xpath("(//div[@aria-label='01/01/2021'])[1]")).click();
            }

            //Valor planejado
            driver.findElement(By.id("planned_value")).sendKeys("30000");

            //Salvar
            driver.findElement(By.id("btn_save")).click();
        }


        //Adicionar Cronograma de Pagamentos - Com Data Realizada
        if(Objects.equals(realizado, "Sim")){
            wait.until(ExpectedConditions.elementToBeClickable(By.id("btn_new")));
            driver.findElement(By.id("btn_new")).click();

            //Data de vencimento
            if (Objects.equals(anoBase, "2022")){
                //Data de vencimento
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[text()='today'])[1]")));
                driver.findElement(By.xpath("(//i[text()='today'])[1]")).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@title='Selecione um mês'])[1]")));
                driver.findElement(By.xpath("(//select[@title='Selecione um mês'])[1]")).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//option[text()='janeiro'])[1]")));
                driver.findElement(By.xpath("(//option[text()='janeiro'])[1]")).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@title='Selecione um ano'])[1]")));
                driver.findElement(By.xpath("(//select[@title='Selecione um ano'])[1]")).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//option[@value='2022'])[1]")));
                driver.findElement(By.xpath("(//option[@value='2022'])[1]")).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@aria-label='01/01/2022'])[1]")));
                driver.findElement(By.xpath("(//div[@aria-label='01/01/2022'])[1]")).click();
            }

            if (Objects.equals(anoBase, "2021")){
                //Data de vencimento
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[text()='today'])[1]")));
                driver.findElement(By.xpath("(//i[text()='today'])[1]")).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@title='Selecione um mês'])[1]")));
                driver.findElement(By.xpath("(//select[@title='Selecione um mês'])[1]")).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//option[text()='janeiro'])[1]")));
                driver.findElement(By.xpath("(//option[text()='janeiro'])[1]")).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@title='Selecione um ano'])[1]")));
                driver.findElement(By.xpath("(//select[@title='Selecione um ano'])[1]")).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//option[@value='2021'])[1]")));
                driver.findElement(By.xpath("(//option[@value='2021'])[1]")).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@aria-label='01/01/2021'])[1]")));
                driver.findElement(By.xpath("(//div[@aria-label='01/01/2021'])[1]")).click();
            }

            //Valor planejado
            driver.findElement(By.id("planned_value")).sendKeys("40000");

            //Data Realizada
            if (Objects.equals(anoBase, "2022")){
                //Data de vencimento
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[text()='today'])[2]")));
                driver.findElement(By.xpath("(//i[text()='today'])[2]")).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@title='Selecione um mês'])[2]")));
                driver.findElement(By.xpath("(//select[@title='Selecione um mês'])[2]")).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//option[text()='janeiro'])[2]")));
                driver.findElement(By.xpath("(//option[text()='janeiro'])[2]")).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@title='Selecione um ano'])[2]")));
                driver.findElement(By.xpath("(//select[@title='Selecione um ano'])[2]")).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//option[@value='2022'])[2]")));
                driver.findElement(By.xpath("(//option[@value='2022'])[2]")).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@aria-label='01/01/2022'])[2]")));
                driver.findElement(By.xpath("(//div[@aria-label='01/01/2022'])[2]")).click();
            }

            if (Objects.equals(anoBase, "2021")){
                //Data de vencimento
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[text()='today'])[2]")));
                driver.findElement(By.xpath("(//i[text()='today'])[2]")).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@title='Selecione um mês'])[2]")));
                driver.findElement(By.xpath("(//select[@title='Selecione um mês'])[2]")).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//option[text()='janeiro'])[2]")));
                driver.findElement(By.xpath("(//option[text()='janeiro'])[2]")).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@title='Selecione um ano'])[2]")));
                driver.findElement(By.xpath("(//select[@title='Selecione um ano'])[2]")).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//option[@value='2021'])[2]")));
                driver.findElement(By.xpath("(//option[@value='2021'])[2]")).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@aria-label='01/01/2021'])[2]")));
                driver.findElement(By.xpath("(//div[@aria-label='01/01/2021'])[2]")).click();
            }

            //Salvar
            driver.findElement(By.id("btn_save")).click();

        }
    }
}
