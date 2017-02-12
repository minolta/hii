package me.pixka.hii.s;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.pixka.hii.r.AddgoodsRepo;

@Service
@Transactional
public class GoodsService {

	@Autowired
	private AddgoodsRepo dao;

	public List findGraph(Long device_id, Date sd, Date ed) {
		return dao.findGraph(device_id, sd, ed);

	}

}
