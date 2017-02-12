package me.pixka.hii.r;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import me.pixka.hii.d.Addgoods;

@Repository
public interface AddgoodsRepo extends CrudRepository<Addgoods, Long> {

	@Query("select hour(t.gdate),day(t.gdate),month(t.gdate),year(t.gdate),sum(t.amount) from Addgoods  t where t.device_id = ?1 and t.gdate >= ?2 and t.gdate <= ?3 group by hour(t.gdate),day(t.gdate),month(t.gdate),year(t.gdate) order by year(t.gdate),month(t.gdate),day(t.gdate),hour(t.gdate) ")
	List findGraph(Long device_id, Date sd, Date ed);

}
