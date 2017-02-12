package me.pixka.hii.s;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.pixka.hii.d.Addgoods;
import me.pixka.hii.r.AddgoodsRepo;

@Service
@Transactional
public class AddgoodsService {

	@Autowired
	private AddgoodsRepo dao;

	public Object save(Addgoods o) {
		return dao.save(o);
	}

}
