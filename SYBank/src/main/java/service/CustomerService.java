package service;

import commons.DBUtil;
import repository.CustomerDao;

public class CustomerService implements ICustomerService {
	private DBUtil dbUtil;
	private CustomerDao customerDao ;
}
