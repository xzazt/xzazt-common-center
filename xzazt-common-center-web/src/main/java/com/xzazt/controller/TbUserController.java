package com.xzazt.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xzazt.bean.ResultDTO;
import com.xzazt.constant.ErrorCode;
import com.xzazt.entity.TbUser;
import com.xzazt.test.ITbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @Autowired
    private ITbUserService tbUserService;

    @GetMapping("/get")
    public ResultDTO<List<TbUser>> getUser(){
        ResultDTO<List<TbUser>> resultDTO = new ResultDTO<>();
        resultDTO.setCode(ErrorCode.START_CODE);
        QueryWrapper<TbUser> qw = new QueryWrapper<>();
        qw.eq("row_state",1);

        List<TbUser> list = tbUserService.list(qw);
        resultDTO.setData(list);
        return resultDTO;
        //tbUserService.list()
    }

}
