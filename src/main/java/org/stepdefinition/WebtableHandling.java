package org.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.commonfunction.Commonactions;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

public class WebtableHandling extends Commonactions{

	public static void main(String[] args) throws InterruptedException, IOException {

		String ss ="hi this is yuvaraj";
		String[] split = ss.split(" ");
		
		
		HashMap<Integer, String> hk = new HashMap<Integer, String>();
		hk.put(101, "yuvaraj");
		hk.put(102, "narayanan");
		hk.put(101, "narayanan");

		System.out.println(hk);
		
		RandomAccessFile r = new RandomAccessFile(".//data//notes.txt", "r");
		String s;
		s=r.readLine();
		
		launch("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> row = driver.findElements(By.xpath("(//table)[1]//tr"));
		int rowsize = row.size();
		List<WebElement> col = driver.findElements(By.xpath("(//table)[1]//tr[1]/td"));
		int colsize = col.size();

		for(int i=1;i<rowsize;i++)
		{
			for(int j=1;j<colsize;j++)
			{
				WebElement value = driver.findElement(By.xpath("(//table)[1]//tbody/tr["+i+"]/td["+j+"]"));
				String text = value.getText();
				if(text.equals(s))
				{
					WebElement Neededvalue = driver.findElement(By.xpath("(//table)[1]//tbody/tr["+i+"]"));
					System.out.println(Neededvalue.getText());
				}
			}
		}
		
	}

}
