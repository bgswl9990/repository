package com.springboot;

import com.bean.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ao
 * @create 2020-11-30  15:13
 */
public class PersonDao {
    public List<Person> queryUserList(){
        ArrayList<Person> result = new ArrayList<Person>();
        //模拟数据库的查询
        for (int i = 0; i<0; i++){
            Person person = new Person();
            person.setUsername("username_" + i);
            person.setPassword("password_" + i);
            person.setAge(i + 1);
            result.add(person);
        }
    return  result;
    }
}
