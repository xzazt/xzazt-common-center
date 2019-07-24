package com.xzazt.entity;

import lombok.Data;


import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author jobob
 * @since 2019-07-10
 */
@Data
public class TbUser{

    private String id;

    /**
     * 登录名称
     */
    private String loginName;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 行状态
     */
    private Long rowState;

    /**
     * 创建人
     */
    private String rowCreater;

    /**
     * 创建时间
     */
    private Date rowCreateTime;

    /**
     * 修改人
     */
    private String rowModifier;

    /**
     * 修改时间
     */
    private Date rowModifyTime;


}
