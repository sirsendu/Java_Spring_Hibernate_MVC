package com.cc.app.service;

import com.cc.app.db.Domain;
import com.cc.app.db.DomainDAO;

public class NameService {

	private final DomainDAO domainDao;

	public NameService(final DomainDAO domainDao) {
		this.domainDao = domainDao;
	}

	public String getMyName() {
		return ((Domain)(domainDao.findAll().get(0))).getName();
	}
}
