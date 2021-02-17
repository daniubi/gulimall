package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.PmsCommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author aikaige
 * @email sunlightcs@gmail.com
 * @date 2021-02-17 23:09:58
 */
@Mapper
public interface PmsCommentReplayDao extends BaseMapper<PmsCommentReplayEntity> {
	
}
