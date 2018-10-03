package com.moltimate.moltimatebackend;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BarHibernateDAO {
    @Autowired
    private SessionFactory sessionFactory;

    public void write() {
        Session s = sessionFactory.openSession();
    }
}
