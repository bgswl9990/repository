package com.service;

import com.bean.Person;
import com.springboot.PersonDao;

import java.util.List;

/**
 * @author ao
 * @create 2020-11-30  15:32
 */
public class Service {
    @Autowired
   private PersonDao personDao;
   private List<Person> queryUserList(){
       //调用userDao中的方法进行查询
        return this.personDao.queryUserList();
   }
}
