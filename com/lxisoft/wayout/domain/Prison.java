package com.lxisoft.wayout.domain;

/**
*Setting and getting of  variables prisoner and hall in class Prison.
*@author Aparna.
*@author Manoj.
*/

public class Prison
{ 
	
/**
*Declaration of variable prisoner of type Prisoner.
*/
    private Prisoner prisoner;
/**
*Declaration of variable and hall of type Hall.
*/
	private Hall hall;
/**
*Setting prisoner.
*@param prisoner (Passing parameter prisoner).
*/
    public void setPrisoner(Prisoner prisoner)
    {
    this.prisoner=prisoner;
	}
/**
*Getting prisoner.
*@return prisoner (Returning the value prisoner).
*/
	
	public Prisoner getPrisoner()
	{

		return this.prisoner;
	}
/**
*Setting hall.
*@param hall (Passing parameter hall).
*/
	public void setHall(Hall hall)
	{
	this.hall=hall;
	}
/**
*Getting hall.
*@return hall (Returning the value hall).
*/
	public Hall getHall()
	{

	return this.hall;
	}

}
