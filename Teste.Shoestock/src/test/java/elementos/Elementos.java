package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	public By campoBusca = By.id("search-input");
	public By btnBuscar = By.cssSelector("div.breakpoint div.header-row section.search section.search-field form.wrapper.search-form:nth-child(2) div.input-label:nth-child(3) > button.button.no-border.ns-icon.ns-icon-search");
	
	public By btnCookies = By.cssSelector("body > section > div > div.cookie-notification-button");
	public By primeiroProduto = By.cssSelector("#item-list > div > div > div.item-card__images");
	
	public By cor1 = By.xpath("/html/body/div[2]/main/div[2]/section/section[3]/section[1]/div/ul/li[1]/a");
	public By cor2 = By.xpath("/html/body/div[2]/main/div[2]/section/section[3]/section[1]/div/ul/li[2]/a");
	public By cor3 = By.xpath("/html/body/div[2]/main/div[2]/section/section[3]/section[1]/div/ul/li[3]/a");
	
	public By tamanho38 = By.linkText("38");
	public By tamanho39 = By.linkText("39");
	public By tamanho40 = By.linkText("40");
	
	
	public By btnComprar = By.cssSelector("#buy-button-now > span");
	
	
	public By retornoProduto= By.cssSelector("body > div.main > div.cart.breakpoint.main > div.cart__content > div.cart__items > div.product-items > div > div.product-item__details > div > div > h3");
	
	
}