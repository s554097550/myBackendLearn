package com.example.controller;

import com.example.domain.Girl;
import com.example.domain.Result;
import com.example.respository.GirlRespository;
import com.example.service.GirlService;
import com.example.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Siwde on 2017/4/10.
 */
@RestController
public class GirlController {
    @Autowired
    private GirlRespository girlRespository;

    @Autowired
    private GirlService girlService;

    //查询所有女孩
    @GetMapping(value = "/girls")
    public List<Girl> getGirls(){

        return girlRespository.findAll();
    }

//    /**
//     * 添加一个女孩
//     * @param name
//     * @param age
//     * @param cupSize
//     * @return
//     */
//    @PostMapping(value = "girls")
//    public Girl girlAdd(@RequestParam("name")String name,
//                          @RequestParam("age")Integer age,
//                          @RequestParam("cupSize")String cupSize){
//        Girl girl = new Girl();
//        girl.setName(name);
//        girl.setAge(age);
//        girl.setCupSize(cupSize);
//        return girlRespository.save(girl);
//
//    }

    /**
     * 添加一个女孩(对象方式)
     * @param girl
     * @return
     */
    @PostMapping(value = "girls")
    public Result<Girl> girlAdd(@Valid Girl girl,BindingResult bindingResult){

        if(bindingResult.hasErrors()){
//            Result result = new Result(1,bindingResult.getFieldError().getDefaultMessage(),null);
//            return result;
            return ResultUtils.error(1,bindingResult.getFieldError().getDefaultMessage());
        }
        girl.setName(girl.getName());
        girl.setAge(girl.getAge());
        girl.setCupSize(girl.getCupSize());
//        Result result = new Result(0,"成功",girl);
//        return result;
        return ResultUtils.success(girlRespository.save(girl));
    }

    //删除一个女生
    @DeleteMapping(value = "/girls/{id}")
    public void deleteOneGirl(@PathVariable("id")Integer id){
         girlRespository.delete(id);
    }

    //更新一个女生
    @PutMapping(value = "/girls/{id}")
    public Girl updateOneGirl(@PathVariable("id")Integer id,
                              @RequestParam("name")String name,
                              @RequestParam("age")Integer age,
                              @RequestParam("cupSize")String cupSize){
        Girl girl = new Girl();
        girl.setId(id);
        girl.setName(name);
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return girlRespository.save(girl);

    }

    //根据id查询女孩
    @GetMapping(value = "/girls/{id}")
    public Girl getOneGirl(@PathVariable("id")Integer id){

        return girlRespository.findOne(id);
    }

    //根据年龄查询女孩
    @GetMapping(value = "/girls/age/{age}")
    public List<Girl> getGirlByName(@PathVariable("age")Integer age){

        return girlRespository.findByAge(age);
    }

    @GetMapping(value = "girls/getAge/{id}")
    public void getAge(@PathVariable("id")Integer id) throws Exception{
        girlService.getAge(id);
    }
}
