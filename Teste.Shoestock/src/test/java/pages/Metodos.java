package pages;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Metodos {
	
WebDriver driver;
	
	public void  abrirNavegador(String urlApp, String navegador){
		if(navegador == "CHROME") {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(urlApp);
		driver.manage().window().maximize();
		
		} else if (navegador =="FIREFOX") {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(urlApp);
			driver.manage().window().maximize();
			
			
			
		}
		else {
			System.out.println("Opçâo Invalida, escolha CHROME ou FIREFOX em navegador");
		}
		
	}
	
	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
		
	}
	
	public void clicar (By elemento) {
		driver.findElement(elemento).click();
			
	}
	public void enter(By elemento) {
		driver.findElement(elemento).isSelected();
		driver.findElement(elemento).sendKeys(Keys.ENTER);
	}
	
public void esperar(int tempo) throws InterruptedException {
		
		Thread.sleep(tempo);
	}
	
	public void fecharNavegador() {
		driver.quit();
	}
	
	public void validarTexto(By elemento, String textoEsperado) {
		String texto = driver.findElement(elemento).getText();
		System.out.println("Texto apresentado na tela: "+ texto);
		assertEquals(textoEsperado, texto);
		
	}
	public void ScreenShot(String nome) throws IOException {
		TakesScreenshot srcShot = ((TakesScreenshot)driver);
		
		File SrcFile = srcShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./src/evidencias/"+nome+".png");
		FileUtils.copyFile(SrcFile, destFile);

}

	public void ScreenShotException(Exception e) throws IOException {
        TakesScreenshot srcShot = ((TakesScreenshot)driver);
		
		File SrcFile = srcShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./src/evidencias/"+e+".png");
		FileUtils.copyFile(SrcFile, destFile);

		
	}
	public void esperarPorElemento(By elemento) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		 wait.until(ExpectedConditions.elementToBeClickable(elemento));
		
		
	}

	
	
	
	
	
	

}
