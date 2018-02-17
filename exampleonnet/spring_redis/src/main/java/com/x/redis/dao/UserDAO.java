package com.x.redis.dao;

import com.x.redis.obj.User;

public interface UserDAO {
	public User getUser(final long id);

	public void saveUser(User user1);
}
