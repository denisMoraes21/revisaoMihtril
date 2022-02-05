package br.mithril.test_Login;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import static br.mithril.test_FunilInovacao.test_adicionarIdeia.driver;
import static br.mithril.test_FunilInovacao.test_adicionarIdeia.wait;

public class login {
    public void loginSistema(){
        driver.manage().window().maximize();
        driver.get("https://10.0.0.20/#/login");
        driver.findElement(By.id("details-button")).click();
        driver.findElement(By.id("proceed-link")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("name")));
        driver.findElement(By.id("name")).sendKeys("admin");
        driver.findElement(By.id("pw")).sendKeys("tech@1212");
        driver.findElement(By.id("enviar")).click();
    }

}
