package com.girl2.service;

import com.girl2.dao.Girl2Repository;
import com.girl2.entit.Girl2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import javax.validation.constraints.Max;
import java.util.List;

@Service
public class Girl2Service {
    @Autowired
    Girl2Repository girl2Repository;

    @Transactional
    public void insertTest(){
        Girl2 girl2 = new Girl2();
        Girl2 girl3 = new Girl2();

        girl2.setAge(20);
        girl2.setGirl2C("D");
        girl2Repository.save(girl2);

        girl3.setAge(23);
        girl3.setGirl2C("F");
        girl2Repository.save(girl3);
    }
}
