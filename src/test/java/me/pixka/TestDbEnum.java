package me.pixka;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pi4j.io.gpio.PinMode;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

import me.pixka.device.d.PortConfig;
import me.pixka.device.d.Projects;
import me.pixka.device.s.PortConfigService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDbEnum {

	@Autowired
	private PortConfigService service;

	@Test
	public void t() {

		PortConfig p = new PortConfig();
		p.setName("Delay");
		p.setPin(RaspiPin.GPIO_00.getName());
		p.setProjects(Projects.Het);
		p.setPinmode(PinMode.DIGITAL_OUTPUT);
		p.setShutdownstate(PinState.HIGH);
		p.setStartstate(PinState.HIGH);

		service.save(p);

		List<PortConfig> l = service.all();
		for (PortConfig item : l) {
			System.out.println(item);
			PinMode m = item.getPinmode();
			System.out.println(m);
			
			Projects pj = item.getProjects();
			System.out.println(pj);
		}

	}
}
