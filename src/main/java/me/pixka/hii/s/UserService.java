package me.pixka.hii.s;

import me.pixka.hii.d.User;

public interface UserService {
	User save(User user);

	User findByUserName(String userName);

}
