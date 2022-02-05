package br.mithril.test_FunilInovacao;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.Objects;

import static br.mithril.test_FunilInovacao.test_adicionarIdeia.driver;
import static br.mithril.test_FunilInovacao.test_adicionarIdeia.wait;


public class solicitacaoPropostas {

    public void limparfiltro(){
        driver.findElement(By.id("ideia-year")).clear();
        driver.findElement(By.id("btn_filter"));
    }

    public void telaInicio(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a/span[text()='Funil de inovação']")));
        driver.findElement(By.xpath("//a/span[text()='Funil de inovação']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a/span[text()='Solicitação de Propostas']")));
        driver.findElement(By.xpath("//a/span[text()='Solicitação de Propostas']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("btn_new")));
    }

    public void adicionarProposta(String titulo, String ano) throws InterruptedException {
        telaInicio();
        driver.findElement(By.id("btn_new")).click();

        //Nome da proposta
        wait.until(ExpectedConditions.elementToBeClickable(By.id("nome")));
        driver.findElement(By.id("nome")).sendKeys(titulo);

        //Preencher data - depende
        driver.findElement(By.xpath("//i[text()='today']")).click();
        driver.findElement(By.xpath("//div[@aria-label='31/01/2022']")).click();

        //Associar Ideia
        driver.findElement(By.xpath("//button[text()='Associar Ideia']")).click();
        if (Objects.equals(ano, "2021")){
            if (Objects.equals(titulo, "Aprovada")){
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tr[2]/td")));
                driver.findElement(By.xpath("//tr[2]/td")).click();
            }
            if (Objects.equals(titulo, "Aprovada para cotação")){
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tr[4]/td")));
                driver.findElement(By.xpath("//tr[4]/td")).click();
            }
            if (Objects.equals(titulo, "Banco de Ideias")){
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tr[6]/td")));
                driver.findElement(By.xpath("//tr[6]/td")).click();
            }
            if (Objects.equals(titulo, "Duplicada")){
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tr[8]/td")));
                driver.findElement(By.xpath("//tr[8]/td")).click();
            }
            if (Objects.equals(titulo, "Em análise")){
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tr[10]/td")));
                driver.findElement(By.xpath("//tr[10]/td")).click();
            }
            if (Objects.equals(titulo, "Implementada")){
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tr[12]/td")));
                driver.findElement(By.xpath("//tr[12]/td")).click();
            }
            if (Objects.equals(titulo, "Não iniciada")){
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tr[14]/td")));
                driver.findElement(By.xpath("//tr[14]/td")).click();
            }
            if (Objects.equals(titulo, "Reprovada")){
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tr[16]/td")));
                driver.findElement(By.xpath("//tr[16]/td")).click();
            }
        } else {
            if (Objects.equals(titulo, "Aprovada")){
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tr[1]/td")));
                driver.findElement(By.xpath("//tr[1]/td")).click();
            }
            if (Objects.equals(titulo, "Aprovada para cotação")){
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tr[3]/td")));
                driver.findElement(By.xpath("//tr[3]/td")).click();
            }
            if (Objects.equals(titulo, "Banco de Ideias")){
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tr[5]/td")));
                driver.findElement(By.xpath("//tr[5]/td")).click();
            }
            if (Objects.equals(titulo, "Duplicada")){
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tr[7]/td")));
                driver.findElement(By.xpath("//tr[7]/td")).click();
            }
            if (Objects.equals(titulo, "Em análise")){
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tr[9]/td")));
                driver.findElement(By.xpath("//tr[9]/td")).click();
            }
            if (Objects.equals(titulo, "Implementada")){
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tr[11]/td")));
                driver.findElement(By.xpath("//tr[11]/td")).click();
            }
            if (Objects.equals(titulo, "Não iniciada")){
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tr[13]/td")));
                driver.findElement(By.xpath("//tr[13]/td")).click();
            }
            if (Objects.equals(titulo, "Reprovada")){
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tr[15]/td")));
                driver.findElement(By.xpath("//tr[15]/td")).click();
            }
        }
        //Descrição
        driver.findElement(By.id("descricao")).sendKeys("teste");

        //Enviar
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Enviar']")));
        driver.findElement(By.xpath("//button[text()='Enviar']")).click();

        //Selecionar email
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//md-checkbox[@md-model.bind='supplier'])[3]")));
        driver.findElement(By.xpath("(//md-checkbox[@md-model.bind='supplier'])[3]")).click();

        //Confirmar
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Confirmar']")));
        driver.findElement(By.xpath("//button[text()='Confirmar']")).click();

        //Adicionar confirmação
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tr[1]/td")));
        driver.findElement(By.xpath("//tr[1]/td")).click();

        //Ação
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[text()='mode_edit'])[2]")));
        driver.findElement(By.xpath("(//i[text()='mode_edit'])[2]")).click();
        Thread.sleep(1000);

        if (Objects.equals(ano, "2021")){
            driver.findElement(By.xpath("//i[text()='today']")).click();
            driver.findElement(By.xpath("//div[@title='Mês anterior']")).click();
            driver.findElement(By.xpath("//div[@aria-label='31/12/2021']")).click();
        }

        //Valor
        wait.until(ExpectedConditions.elementToBeClickable(By.id("price")));
        driver.findElement(By.id("price")).sendKeys("1000");

        //Salvar
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("btn_save")));
        driver.findElement(By.id("btn_save")).click();

        //Proposta escolhida
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td/i[@class='material-icons sys au-target']")));
        driver.findElement(By.xpath("//td/i[@class='material-icons sys au-target']")).click();

        //Confirmar
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("btn_save")));
        driver.findElement(By.id("btn_save")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='toast toast-success']")));
        driver.findElement(By.xpath("//div[@class='toast toast-success']"));
    }
}
