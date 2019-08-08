package com.hnisc.daoImpl;

import com.hnisc.dao.UserDao;
import com.hnisc.entity.User;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

/**
 * @author lh141
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
    @Override
    public User getUser(Integer userId) {
        return this.getHibernateTemplate().get(User.class,userId);
    }

    @Override
    public void saveUser(User user) {
        this.getHibernateTemplate().save(user);
    }

}
