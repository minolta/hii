package me.pixka;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import me.pixka.device.c.DeviceconfigUtil;
import me.pixka.device.d.Deviceconfig;
import me.pixka.device.task.LoadDeviceConfigTask;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Testloaddeviceconfig {

	@Autowired
	private DeviceconfigUtil du;
	@Autowired
	private LoadDeviceConfigTask task;
	@Test
	public void test()
	{
		
		
		List<Deviceconfig> list = du.loadsfromhttp("http://pixka.me:3333/deviceconfig/loads/", "98ded014a86e", 336L);
		 for(Deviceconfig i : list)
		 {
			 System.out.println(i);
		 }
		 
	
	
	}
}
