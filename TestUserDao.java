package test.dao;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dao.UserDao;
import pojos.User;
import pojos.UserRole;

class TestUserDao {

	UserDao userDao;
	@BeforeEach
	void setUp() throws Exception {
		userDao = new UserDao();
	}

	@Test
	void testUserRegistration() {
		LocalDate date= LocalDate.parse("2024-05-15");
		userDao.userRegistration(new User("aharnish", "aharnish@gmail.com","1234", 0.0, date, UserRole.valueOf("CUSTOMER")));
	}

}
