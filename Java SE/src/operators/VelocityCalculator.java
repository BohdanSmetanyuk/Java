package operators;

public class VelocityCalculator
{
	static float velocity (float d, float t)
	{
		if(t == 0)
			return 0f;
		else 
			return d/t;
	} 
}
