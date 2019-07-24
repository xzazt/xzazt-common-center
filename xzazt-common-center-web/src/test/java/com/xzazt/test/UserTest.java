package com.xzazt.test;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xzazt.Application;
import com.xzazt.entity.TbUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})
public class UserTest {
    @Autowired
    private ITbUserService iTbUserService;

    @Test
    public void insert(){
        TbUser tbUser = new TbUser();
        tbUser.setId(UUID.randomUUID().toString());
        tbUser.setLoginName("xz1");
        tbUser.setPassword("xz1");
        tbUser.setRowCreater("11");
        tbUser.setRowModifier("11");
        tbUser.setRowState(1L);
        tbUser.setRowCreateTime(new Date());
        tbUser.setRowModifyTime(new Date());
        iTbUserService.save(tbUser);
    }
    @Test
    public void query(){
        QueryWrapper<TbUser> qw = new QueryWrapper<>();
        qw.eq("row_state",1);
        List<TbUser> list = iTbUserService.list(qw);
        System.out.println(list);


    }
}
