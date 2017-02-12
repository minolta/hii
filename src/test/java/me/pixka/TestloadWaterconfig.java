package me.pixka;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import me.pixka.device.d.Watertiming;
import me.pixka.device.task.LoadWatertimingConfigTask;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestloadWaterconfig {

	@Autowired
	private LoadWatertimingConfigTask task;

	@Test
	public void test() {

		task.setMac("98ded014a86e");
		task.setUrl("http://pixka.me:3333//water/load/");
		List list = task.load(0L);

		List<Watertiming> items = list;

		for (Watertiming i : items) {
			System.out.println(i);
		}

	}
}
