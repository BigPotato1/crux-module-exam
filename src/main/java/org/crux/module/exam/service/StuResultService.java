package org.crux.module.exam.service;

import org.crux.module.exam.dao.StuResultDao;
import org.crux.module.exam.entity.StuResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shenqingwen
 * @date 2020/9/14
 **/
@Service
public class StuResultService {

    //管理员查询考生成绩服务
    @Resource
    StuResultDao stuResultDao;

    public List<StuResult> listStuResult() {
        return stuResultDao.listStuResult();
    }

    //考生查询个人成绩服务
}
