package com.xzazt.controller;


import com.xzazt.bean.ResultDTO;
import com.xzazt.constant.ErrorCode;
import com.xzazt.service.ITbUserService;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2019-07-10
 */
@RequestMapping("/user")
@RestController
public class TbUserController{

    @AutoConfigureOrder
    private ITbUserService tbUserService;

    @GetMapping("/get")
    public ResultDTO<String> getUser(){
        ResultDTO<String> resultDTO = new ResultDTO<>();
        resultDTO.setCode(ErrorCode.START_CODE);
        resultDTO.setData("success!!!");
        return resultDTO;
        //tbUserService.list()
    }

}
