/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Car
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 *
 * @author		: nth12
 * @version		: 1.0
 */
public class Car {
	private String company;
	private String model;
	private String color;
	private int maxspeed;
	private int price;
	
	public String getCompany()
	{
		return company;
	}
	public String getModel()
	{
		return model;
	}
	public String getColor()
	{
		return color;
	}
	public int getMaxspeed()
	{
		return maxspeed;
	}
	public int getPrice()
	{
		return price;
	}
	
	public void setCompany(String newCompany)
	{
		company = newCompany;
	}
	public void setModel(String newModel)
	{
		model = newModel;
	}
	public void setColor(String newColor)
	{
		color = newColor;
	}
	public void setMaxspeed(int newMaxspeed)
	{
		maxspeed = newMaxspeed;
	}
	public void setPrice(int newPrice)
	{
		price = newPrice;
	}
}
	
	
	

