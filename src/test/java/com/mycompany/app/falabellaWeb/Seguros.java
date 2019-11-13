package com.mycompany.app.falabellaWeb;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Seguros {
	
	WebDriver driver;
	String url = "https://compratusoat.com.co";
	WebElement placa,correo,nombres,apellidos,celular,check,aceptar,aceptar2,cotizar,
	tipo,siguiente,cc,ciudad,city,direccion,siguiente2,noGracias,siguiente3;
	
	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@Test
	public void test() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		
		placa = driver.findElement(By.xpath("//*[@id=\"pro2\"]/div[2]/input"));
		correo = driver.findElement(By.xpath("//*[@id=\"mail\"]"));
		nombres = driver.findElement(By.xpath("//*[@id=\"name\"]"));
		apellidos = driver.findElement(By.xpath("//*[@id=\"apellidos\"]"));
		celular = driver.findElement(By.xpath("//*[@id=\"phone\"]"));
		check = driver.findElement(By.xpath("//*[@id=\"accept\"]"));
		cotizar = driver.findElement(By.xpath("//*[@id=\"btsubmit\"]"));
		aceptar = driver.findElement(By.xpath("//*[@id=\"modalTerminos\"]/div/div/div[3]/button[2]"));
		aceptar2 = driver.findElement(By.xpath("//*[@id=\"cookies\"]/button"));
		
	
		placa.sendKeys("DNR328");
		
		correo.sendKeys("asdfghjkl149@gmail.com");
		
		nombres.sendKeys("juan");
		
		apellidos.sendKeys("perez");
		
		celular.click();
		celular.sendKeys("3003333325");
		
		check.click();
		
		aceptar2.click();
		Thread.sleep(1000);
		aceptar.click();
		
		Thread.sleep(1000);
		cotizar.click();
		
		tipo = driver.findElement(By.xpath("//*[@id=\"test5\"]"));
		siguiente = driver.findElement(By.xpath("//*[@id=\"paso1\"]/div[5]/div/div[2]/input[1]"));
		
		
		tipo.click();
		siguiente.click();
		
		cc = driver.findElement(By.xpath("//*[@id=\"cedula\"]"));
		ciudad = driver.findElement(By.xpath("//*[@id=\"inputSelect\"]"));
		direccion = driver.findElement(By.xpath("//*[@id=\"addres\"]"));
		siguiente2 = driver.findElement(By.xpath("//*[@id=\"paso2\"]/div[4]/div/div[2]/input[1]"));
		
		
		cc.clear();
		cc.sendKeys("1000003");
		
		//ciudad.clear();
		ciudad.sendKeys("Bogota D.C.");;
		
		direccion.clear();
		direccion.sendKeys("carrera 1 # 1 - 1 norte");
		
		siguiente2.click();
		
		
		noGracias = driver.findElement(By.xpath("//*[@id=\"paso3\"]/div[3]/div[2]/div/label/span"));
		siguiente3 = driver.findElement(By.xpath("//*[@id=\"paso3\"]/div[4]/div/div[2]/input[1]"));
		
		noGracias.click();
		
		siguiente3.click();
		
		
		
	}
	
	@After
	public void after() {
		//driver.close();
	}

}
