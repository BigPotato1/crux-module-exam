package org.crux.module.exam.dao;

import org.crux.module.exam.entity.TaoTi;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: shenqingwen
 * Date: 2020/9/10
 */
//对课程相应的套题进行增删改查
@Repository
public interface TaoTiDao {

    int getTotal();

    void addTaoTi(TaoTi taoTi);

    void deleteTaoTi(int id);

    void updateTaoTi(TaoTi taoTi);

    TaoTi selectTaoTi(int id);

    List<TaoTi> list(int start, int count);

}
