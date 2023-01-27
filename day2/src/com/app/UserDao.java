package com.app;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public interface UserDao {

	public void addUser(User user) throws DAOException; 
}
