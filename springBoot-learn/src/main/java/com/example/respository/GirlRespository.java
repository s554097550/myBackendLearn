package com.example.respository;

import com.example.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Siwde on 2017/4/10.
 */
public interface GirlRespository extends JpaRepository<Girl,Integer> {
    /**
     * 使用的是spring-data-jpa
     * 1.通过命名：命名规则：查看 http://blog.csdn.net/ming070423/article/details/22086169
     *
     * 2.自己写sql/hql： 方法上加注释@Query("sql/hql")
     *
     */
    public List<Girl> findByAge(Integer age);
}
