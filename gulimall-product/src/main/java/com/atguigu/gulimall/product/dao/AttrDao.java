package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author aikaige
 * @email sunlightcs@gmail.com
 * @date 2021-02-18 10:56:50
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
