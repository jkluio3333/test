package com.ninefbank.smallpay.channel.core;

import com.ninefbank.smallpay.channel.common.dto.refund.QueryRefundRepDto;
import com.ninefbank.smallpay.channel.common.dto.refund.QueryRefundReqDto;
import com.ninefbank.smallpay.channel.common.dto.refund.RefundRepDto;
import com.ninefbank.smallpay.channel.common.dto.refund.RefundReqDto;
import com.ninefbank.smallpay.channel.common.dto.refund.SupportRefundRepDto;
import com.ninefbank.smallpay.channel.common.dto.refund.SupportRefundReqDto;
import com.ninefbank.smallpay.channel.common.exception.BaseException;



/**
 * 
* @ClassName: IRefundSwap 
* @Description: TODO
* @author mkWang  
* @date 2017年2月14日 下午5:32:42 
*
 */
public interface IRefundSwap {
	/**
	 * 
	* @Title: doRefund 
	* @Description: 退款
	* @param @param reqDto
	* @param @return    设定文件 
	* @return RefundRepDto    返回类型 
	* @throws
	 */
	RefundRepDto doRefund(RefundReqDto reqDto) throws BaseException;
	
	/**
	 * 
	* @Title: queryRefund 
	* @Description: 退款查询
	* @param @param reqDto
	* @param @return    设定文件 
	* @return QueryRefundRepDto    返回类型 
	* @throws
	 */
	QueryRefundRepDto queryRefund(QueryRefundReqDto reqDto) throws BaseException;
    
	/**
	 * 
	* @Title: supportRefund 
	* @Description: 是否支持退款
	* @param @param reqDto
	* @param @return    设定文件 
	* @return RefundRepDto    返回类型 
	* @throws
	 */
	SupportRefundRepDto supportRefund(SupportRefundReqDto reqDto) throws BaseException;
}
