package com.revature.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.sql.JoinType;

import com.revature.domain.User;
import com.revature.util.HibernateUtil;

public class UserDaoImpl implements UserDAO{

	public User addUser(User user) {
		Session session = HibernateUtil.getSession();
		try {
			Transaction tx = (Transaction) session.beginTransaction();
			int id = (Integer) session.save(user);
			tx.commit();
			user.setId(id);
			return user;
		}
		finally {
			session.close();
		}
	}

	public List<User> getAllUsers() {
		Session session = HibernateUtil.getSession();
		try {
			Criteria criteria = session.createCriteria(User.class)
					.createAlias("followers", "creeps", JoinType.LEFT_OUTER_JOIN);
			List<User> users = criteria.list();
			return users;
		}
		finally {
			session.close();
		}
	}

	public User updateUser(User user) {
		return null;
	}

	public User getUserById(int id) {
		return null;
	}

	public User getUserByUsername(String username) {
		return null;
	}

	public User addFollower(User user, User follower) {
		return null;
	}

}
