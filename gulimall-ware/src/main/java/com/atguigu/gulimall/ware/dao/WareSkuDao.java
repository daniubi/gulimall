package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author aikaige
 * @email 804703017@gmail.com
 * @date 2021-02-18 20:20:14
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
