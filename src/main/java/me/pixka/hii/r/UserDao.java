package me.pixka.hii.r;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import me.pixka.hii.d.User;

@Repository
public interface UserDao extends CrudRepository<User, Long> {

	User findByLogin(String userName);

}
