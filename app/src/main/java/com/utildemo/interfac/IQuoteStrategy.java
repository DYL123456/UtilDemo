package com.utildemo.interfac;

import java.math.BigDecimal;

/**
 * Created by ylding on 2019/2/14.
 */

//公共报价策略接口
public interface IQuoteStrategy {
    //获取折后的价格
    BigDecimal getPrice(BigDecimal originalPrice);
}
