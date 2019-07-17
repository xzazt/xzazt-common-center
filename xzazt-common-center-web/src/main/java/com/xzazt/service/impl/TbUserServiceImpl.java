package com.xzazt.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xzazt.entity.TbUser;
import com.xzazt.mapper.TbUserMapper;
import com.xzazt.service.ITbUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-07-10
 */
@Service
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser> implements ITbUserService {

}
