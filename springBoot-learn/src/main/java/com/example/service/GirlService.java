package com.example.service;

import com.example.domain.Girl;
import com.example.enums.ResultEnum;
import com.example.exception.GirlException;
import com.example.respository.GirlRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Siwde on 2017/4/11.
 */
@Service
public class GirlService {

    @Autowired
    private GirlRespository girlRespository;

    @Transactional
    public void addTwo(){
        Girl girlA = new Girl();
        girlA.setName("呵呵");
        girlA.setAge(12);
        girlA.setCupSize("F");
        girlRespository.save(girlA);

        Girl girlB = new Girl();
        girlB.setName("哈哈");
        girlB.setAge(14);
        girlB.setCupSize("D");
        girlRespository.save(girlB);
    }

    public void getAge(Integer id) throws Exception{
        Girl girl = girlRespository.findOne(id);
        Integer age = girl.getAge();
        //我想要不同的异常返回不同的错误码，而不是都相同
        if(age < 10){
            //throw new Exception("你还在上小学");
            //throw new GirlException("你还是小学生！",100);
            throw new GirlException(ResultEnum.S_SCHOOL);
        }else
            if (age > 10&&age < 18){
               // throw new Exception("你还中学生");
               // throw new GirlException("你还是中学生！",101);
                throw new GirlException(ResultEnum.M_SCHOOL);
            }
    }

    /**
     * 查询一个女孩
     * @param id
     * @return
     */
    public Girl getOneGirl(Integer id){
        return girlRespository.findOne(id);
    }
}
