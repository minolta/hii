package me.pixka.hii.c;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import me.pixka.hii.d.Getgoods;
import me.pixka.hii.d.GoodDatas;
import me.pixka.hii.s.GoodsService;

@RestController
public class GoodControl {

	@Autowired
	private GoodsService service;

	@CrossOrigin
	@RequestMapping(value = "/rest/getgoods", method = RequestMethod.POST)
	@ResponseBody
	/**
	 * ใช้สำหรับ ดึงผลผลิตในช่วงออกมา แสดงใน graph
	 * 
	 * @param device
	 * @return
	 * @throws JsonProcessingException
	 * @throws IOException
	 */
	public List add(@RequestBody Getgoods device) throws JsonProcessingException, IOException {
		System.out.println(device);
		// return deviceservice.add(device);

		List list = service.findGraph(device.getDevice().getId(), device.getSdate(), device.getEdate());
		List buf = new ArrayList();

		Iterator items = list.iterator();
		while (items.hasNext()) {

			// System.out.println(items.next());
			Object[] o = (Object[]) items.next();
			GoodDatas item = new GoodDatas();
			item.setH(Long.valueOf(o[0].toString()));
			item.setD(Long.valueOf(o[1].toString()));
			item.setM(Long.valueOf(o[2].toString()));
			item.setY(Long.valueOf(o[3].toString()));
			item.setAmount(new BigDecimal(o[4].toString()));
			buf.add(item);

		}

		return buf;
	}
}
