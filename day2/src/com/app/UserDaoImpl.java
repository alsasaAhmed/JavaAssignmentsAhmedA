package com.app;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;


public class UserDaoImpl implements UserDao{

	@Override
	public void addUser(User user) throws DAOException {
		
			try {
			FileOutputStream fs = new FileOutputStream("C://mydata/utr");
			}catch(FileNotFoundException e) {
				throw new DAOException("Something went wrong... try after sometime", e);
			}
	}
	
	

}
