package org.crux.module.exam.dao;

import org.crux.module.exam.entity.Manager;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ManagerDao {
    int getTotal();
    void addManager(Manager manager);
    void deleteManager(int id);
    void updateManager(Manager manager);
    Manager selectManager(int id);
    List<Manager> list(int start,int count);

}
