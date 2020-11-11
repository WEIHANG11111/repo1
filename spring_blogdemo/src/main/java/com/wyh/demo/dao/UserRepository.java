package com.wyh.demo.dao;

import com.wyh.demo.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    //命名规则查询：findBy+属性名称+And+另一个属性名称
    User findByUsernameAndPassword(String username,String password);
}
