package br.mithril.test_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.InputEvent;
import java.time.Duration;

public class loginSistema {

   private static final ChromeDriver driver = new ChromeDriver();
   private static final WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(20));

   public static void main(String[] args) throws AWTException, InterruptedException {
      //login();
      //adicionarIdeia();
      //adicionarProposta();
      //adicionarFaturamento();
      //adicionarProjeto();
      //adicionarAnoBase();
      //adicionarTermoAditivo();
      //adicionarDepositoFNDCT();
      //adicionarDepositoProgramaPrioritario();
      //adicionarContratos();
      //adicionarOutrosContratos();
   }

   /*
   public static void login(){
      driver.manage().window().maximize();
      driver.get("https://10.0.0.20/#/login");
      driver.findElement(By.id("details-button")).click();
      driver.findElement(By.id("proceed-link")).click();
      wait.until(ExpectedConditions.elementToBeClickable(By.id("name")));
      driver.findElement(By.id("name")).sendKeys("admin");
      driver.findElement(By.id("pw")).sendKeys("tech@1212");
      driver.findElement(By.id("enviar")).click();
   }

    */

   /*
   public static void adicionarIdeia(){
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a/span[text()='Funil de inovação']")));
      driver.findElement(By.xpath("//a/span[text()='Funil de inovação']")).click();
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a/span[text()='Avaliação de Ideias']")));
      driver.findElement(By.xpath("//a/span[text()='Avaliação de Ideias']")).click();
      wait.until(ExpectedConditions.elementToBeClickable(By.id("btn_new")));
      driver.findElement(By.id("btn_new")).click();
      //Mudar nome da ideia
      wait.until(ExpectedConditions.elementToBeClickable(By.id("nome")));
      driver.findElement(By.id("nome")).sendKeys("a");
      //Mudar situação
      driver.findElement(By.xpath("//input[@readonly='true' and @value='Banco de Ideias']")).click();
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li/span[text()='Não iniciada']")));
      driver.findElement(By.xpath("//li/span[text()='Não iniciada']")).click();
      //Mudar nome do colaborador
      driver.findElement(By.id("colaborador")).sendKeys("teste");
      //Mudar matricula
      driver.findElement(By.id("matricula")).sendKeys("1234");
      //Mudar Origem da Ideia
      driver.findElement(By.id("origin")).sendKeys("teste");
      //Mudar Ano Base
      driver.findElement(By.id("year")).sendKeys("2022");
      //Mudar Descrição
      driver.findElement(By.id("descricao")).sendKeys("teste");
      driver.findElement(By.xpath("//button[@class='btn btn-success au-target']")).click();
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='toast toast-success']")));
      driver.findElement(By.xpath("//div[@class='toast toast-success']")).click();
   }

    */

   /*
   public static void adicionarProposta(){
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a/span[text()='Funil de inovação']")));
      driver.findElement(By.xpath("//a/span[text()='Funil de inovação']")).click();
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a/span[text()='Solicitação de Propostas']")));
      driver.findElement(By.xpath("//a/span[text()='Solicitação de Propostas']")).click();
      wait.until(ExpectedConditions.elementToBeClickable(By.id("btn_new")));
      driver.findElement(By.id("btn_new")).click();
      //Nome da proposta
      wait.until(ExpectedConditions.elementToBeClickable(By.id("nome")));
      driver.findElement(By.id("nome")).sendKeys("a");
      //Preencher data
      driver.findElement(By.xpath("//i[text()='today']")).click();
      driver.findElement(By.xpath("//div[@aria-label='31/01/2022']")).click();
      //Associar Ideia
      driver.findElement(By.xpath("//button[text()='Associar Ideia']")).click();
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tr[1]/td")));
      driver.findElement(By.xpath("//tr[1]/td")).click();
      //Descrição
      driver.findElement(By.id("descricao")).sendKeys("teste");
      //Salvar
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@click.delegate='save()']")));
      driver.findElement(By.xpath("//button[@click.delegate='save()']")).click();
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='toast toast-success']")));
      driver.findElement(By.xpath("//div[@class='toast toast-success']"));
   }

    */

   /*
   public static void adicionarFaturamento(){
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a/span[contains(text(),'Faturamentos')]")));
      driver.findElement(By.xpath("//a/span[contains(text(),'Faturamentos')]")).click();
      wait.until(ExpectedConditions.elementToBeClickable(By.id("btn_new")));
      driver.findElement(By.id("btn_new")).click();
      //Ano base
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Insira o ano base']")));
      driver.findElement(By.xpath("//input[@placeholder='Insira o ano base']")).sendKeys("2022");
      //Data inicial
      driver.findElement(By.xpath("//div/div[1]/mdx-datepicker/div/i[text()='today']")).click();
      driver.findElement(By.xpath("//div[@aria-label='01/01/2022']")).click();
      //Data final
      driver.findElement(By.xpath("//div/div[3]/mdx-datepicker/div/i[text()='today']")).click();
      driver.findElement(By.xpath("(//select[@class='picker__select--month browser-default'])[2]")).click();
      driver.findElement(By.xpath("(//select[@class='picker__select--month browser-default'])[2]/option[text()='dezembro']")).click();
      driver.findElement(By.xpath("//div[@aria-label='31/12/2022']")).click();
      //Tipo
      driver.findElement(By.xpath("//input[@value='Selecione o Tipo']")).click();
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/div/ul/li/span[text()='PPB']")));
      driver.findElement(By.xpath("//div/div/ul/li/span[text()='PPB']")).click();
      //Nome do produto
      driver.findElement(By.xpath("//input[@name='product-name']")).sendKeys("a");
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
      driver.findElement(By.id("btn_save")).click();
   }

    */

   /*
   public static void adicionarProjeto(){
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a/span[text()='Projetos'])[1]")));
      driver.findElement(By.xpath("(//a/span[text()='Projetos'])[1]")).click();
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a/span[text()='Projetos'])[2]")));
      driver.findElement(By.xpath("(//a/span[text()='Projetos'])[2]")).click();
      wait.until(ExpectedConditions.elementToBeClickable(By.id("btn_create")));
      driver.findElement(By.id("btn_create")).click();
      //Solicitação da Proposta
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Solicitação da Proposta' and @class='select-dropdown']")));
      driver.findElement(By.xpath("//input[@value='Solicitação da Proposta' and @class='select-dropdown']")).click();
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li/span[text()='Proposta 04']")));
      driver.findElement(By.xpath("//li/span[text()='Proposta 04']")).click();
      //Título
      driver.findElement(By.id("nome")).sendKeys("a");
      //Área de Aplicação
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Selecione a Área de Aplicação' and @class='select-dropdown']")));
      driver.findElement(By.xpath("//input[@value='Selecione a Área de Aplicação' and @class='select-dropdown']")).click();
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li/span[text()='Interno']")));
      driver.findElement(By.xpath("//li/span[text()='Interno']")).click();
      //Enquadrabilidade
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Selecione a Enquadrabilidade' and @class='select-dropdown']")));
      driver.findElement(By.xpath("//input[@value='Selecione a Enquadrabilidade' and @class='select-dropdown']")).click();
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li/span[text()='Pesquisa Básica']")));
      driver.findElement(By.xpath("//li/span[text()='Pesquisa Básica']")).click();
      //Período inicial
      driver.findElement(By.xpath("(//div/i[text()='today'])[1]")).click();
      driver.findElement(By.xpath("//div[@aria-label='01/01/2022']")).click();
      //Período final
      driver.findElement(By.xpath("(//div/i[text()='today'])[2]")).click();
      driver.findElement(By.xpath("(//select[@class='picker__select--month browser-default'])[2]")).click();
      driver.findElement(By.xpath("(//select[@class='picker__select--month browser-default'])[2]/option[text()='dezembro']")).click();
      driver.findElement(By.xpath("//div[@aria-label='31/12/2022']")).click();
      //Tipo
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Selecione o Tipo' and @class='select-dropdown']")));
      driver.findElement(By.xpath("//input[@value='Selecione o Tipo' and @class='select-dropdown']")).click();
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li/span[text()='PPB'])[2]")));
      driver.findElement(By.xpath("(//li/span[text()='PPB'])[2]")).click();
      //Região Metropolitana
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Sim' and @class='select-dropdown']")));
      driver.findElement(By.xpath("//input[@value='Sim' and @class='select-dropdown']")).click();
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li/span[text()='Sim']")));
      driver.findElement(By.xpath("//li/span[text()='Sim']")).click();
      driver.findElement(By.id("save")).click();
   }

    */

   /*
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

    */

   /*
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

    */

   /*
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

    */

   /*
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

    */

   /*
   public static void adicionarContratos(){
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a/span[text()='Dispêndios'])[1]")));
      driver.findElement(By.xpath("(//a/span[text()='Dispêndios'])[1]")).click();
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a/span[text()='Contratos']")));
      driver.findElement(By.xpath("//a/span[text()='Contratos']")).click();
      wait.until(ExpectedConditions.elementToBeClickable(By.id("btn_create")));
      driver.findElement(By.id("btn_create")).click();
      //Descrição resumida
      wait.until(ExpectedConditions.elementToBeClickable(By.id("brief_description")));
      driver.findElement(By.id("brief_description")).sendKeys("Cronograma 2022");
      //Obrjeto do Contrato
      wait.until(ExpectedConditions.elementToBeClickable(By.id("object_contract")));
      driver.findElement(By.id("object_contract")).sendKeys("Cronograma 2022");
      //Ano Base
      driver.findElement(By.xpath("//input[@id='base_year']")).clear();
      driver.findElement(By.xpath("//input[@id='base_year']")).sendKeys("2022");
      //Classe do Projeto
      driver.findElement(By.xpath("//input[@value='Selecione a Classe do Projeto']")).click();
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li/span[text()='Interno']")));
      driver.findElement(By.xpath("//li/span[text()='Interno']")).click();
      //Value
      driver.findElement(By.id("value")).sendKeys("1000");
      //Tipo de dispêndio
      driver.findElement(By.xpath("//input[@value='Selecione o Tipo de Dispêndio']")).click();
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li/span[text()='Treinamentos']")));
      driver.findElement(By.xpath("//li/span[text()='Treinamentos']")).click();
      //Data inicial Execução do Serviço
      driver.findElement(By.xpath("(//i[text()='today'])[1]")).click();
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@aria-label='01/01/2022'])[1]")));
      driver.findElement(By.xpath("(//div[@aria-label='01/01/2022'])[1]")).click();
      //Data final Execução do Serviço
      driver.findElement(By.xpath("(//i[text()='today'])[2]")).click();
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@aria-label='31/01/2022'])[2]")));
      driver.findElement(By.xpath("(//div[@aria-label='31/01/2022'])[2]")).click();
      //Data inicial Vigência do Contrato
      driver.findElement(By.xpath("(//i[text()='today'])[3]")).click();
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@aria-label='01/01/2022'])[3]")));
      driver.findElement(By.xpath("(//div[@aria-label='01/01/2022'])[3]")).click();
      //Data final Vigência do Contrato
      driver.findElement(By.xpath("(//i[text()='today'])[4]")).click();
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@aria-label='31/01/2022'])[4]")));
      driver.findElement(By.xpath("(//div[@aria-label='31/01/2022'])[4]")).click();
      driver.findElement(By.id("save")).click();

      //Adicionar Cronograma de Pagamentos [1]
      wait.until(ExpectedConditions.elementToBeClickable(By.id("btn_new")));
      driver.findElement(By.id("btn_new")).click();
      //Data de vencimento
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[text()='today'])[1]")));
      driver.findElement(By.xpath("(//i[text()='today'])[1]")).click();
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@aria-label='01/01/2022'])[1]")));
      driver.findElement(By.xpath("(//div[@aria-label='01/01/2022'])[1]")).click();
      //Valor planejado
      driver.findElement(By.id("planned_value")).sendKeys("300");
      driver.findElement(By.id("btn_save")).click();

      //Adicionar Cronograma de Pagamentos [2]
      wait.until(ExpectedConditions.elementToBeClickable(By.id("btn_add_payment_schedule")));
      driver.findElement(By.id("btn_add_payment_schedule")).click();
      //Data de vencimento
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[text()='today'])[1]")));
      driver.findElement(By.xpath("(//i[text()='today'])[1]")).click();
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@aria-label='01/01/2022'])[1]")));
      driver.findElement(By.xpath("(//div[@aria-label='01/01/2022'])[1]")).click();
      //Valor planejado
      driver.findElement(By.id("planned_value")).sendKeys("400");
      driver.findElement(By.id("btn_save")).click();
   }

    */

   /*
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

    */
}
