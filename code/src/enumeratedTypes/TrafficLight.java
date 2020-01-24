package enumeratedTypes;

import static enumeratedTypes.Signal.*;

public class TrafficLight
{
	Signal color = RED;
	
	public void change()
	{
		switch(color)
		{
		case RED: color = GREEN; break;
		case GREEN: color = YELLOW; break;
		case YELLOW: color = RED; break;			
		}
	}
	
	public String toString()
	{
		return "The traffic light is " + color;
	}
}
