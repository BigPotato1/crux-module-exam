package org.crux.module.exam.service;

import org.crux.module.exam.dao.ManagerDao;
import org.crux.module.exam.entity.Manager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ManagerService {

    @Resource
    ManagerDao managerDao;

    public int getTotal() {
        return managerDao.getTotal();
    }

    public void addManager(Manager manager) {
        managerDao.addManager(manager);
    }

    public void deleteManager(int id) {
        managerDao.deleteManager(id);
    }

    public void updateManager(Manager manager) {
        managerDao.updateManager(manager);
    }

    //查询管理员的个人信息
    public Manager selectManager(int id) {
        return managerDao.selectManager(id);
    }

//    public List<Manager> list(int start,int count) {
//        return managerDao.list(start,count);
//    }

    //查询所有管理员的信息
    public List<Manager> listManager() {
        return managerDao.listManager();
    }


}
