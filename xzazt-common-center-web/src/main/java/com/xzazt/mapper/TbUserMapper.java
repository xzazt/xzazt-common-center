package com.xzazt.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xzazt.entity.TbUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2019-07-10
 */
@Mapper
public interface TbUserMapper extends BaseMapper<TbUser> {

}
