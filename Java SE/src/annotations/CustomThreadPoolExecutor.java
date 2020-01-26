package annotations;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CustomThreadPoolExecutor extends ThreadPoolExecutor
{

	public CustomThreadPoolExecutor(int corePoolSize) 
	{
        super(corePoolSize, Integer.MAX_VALUE, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
	}
	
	@Override
    public void execute(Runnable command) 
	{
		if(command != null)
		{
			Class<? extends Runnable> c = command.getClass();
			if(c.isAnnotationPresent(Repeat.class))
			{
				Repeat repeat = c.getAnnotation(Repeat.class);
				for(int i=0; i<repeat.count(); i++)
					super.execute(command);
			}
		}
    }

}
