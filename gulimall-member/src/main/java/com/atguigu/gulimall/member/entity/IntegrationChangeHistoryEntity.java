package com.atguigu.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ???ֱ仯??ʷ??¼
 * 
 * @author aikaige
 * @email 804703017@gmail.com
 * @date 2021-02-18 19:52:53
 */
@Data
@TableName("ums_integration_change_history")
public class IntegrationChangeHistoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * member_id
	 */
	private Long memberId;
	/**
	 * create_time
	 */
	private Date createTime;
	/**
	 * ?仯??ֵ
	 */
	private Integer changeCount;
	/**
	 * ??ע
	 */
	private String note;
	/**
	 * ??Դ[0->???1->????Ա?޸?;2->?]
	 */
	private Integer sourceTyoe;

}
