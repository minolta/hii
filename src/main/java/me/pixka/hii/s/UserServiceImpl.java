package me.pixka.hii.s;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.pixka.hii.d.User;
import me.pixka.hii.r.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public User save(User user) {
		return userDao.save(user);
	}

	public User findByUserName(String userName) {
		return userDao.findByLogin(userName);
	}

}
