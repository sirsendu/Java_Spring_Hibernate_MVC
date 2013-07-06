package com.cc.app.db;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for Domain entities. Transaction control of the
 * save(), update() and delete() operations can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.cc.app.Domain
 * @author Sirsendu Konar
 */
public class DomainDAO {
    private static final Logger log = LoggerFactory.getLogger(DomainDAO.class);

    public Session getSession() {
        return HibernateSessionFactory.getSession();
    }

    public List findAll() {
        log.debug("finding all Domain instances");
        try {
            String queryString = "from Domain";
            Query queryObject = getSession().createQuery(queryString);
            return queryObject.list();
        } catch (RuntimeException re) {
            log.error("find all failed", re);
            throw re;
        }
    }
}