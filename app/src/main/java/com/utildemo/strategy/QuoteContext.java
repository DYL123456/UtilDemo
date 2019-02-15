package com.utildemo.strategy;

import com.utildemo.interfac.IQuoteStrategy;

import java.math.BigDecimal;

/**
 * Created by ylding on 2019/2/14.
 */

//报价上下文角色
public class QuoteContext {
    //持有一个具体的报价策略
    private IQuoteStrategy quoteStrategy;

    //注入报价策略
    public QuoteContext(IQuoteStrategy quoteStrategy) {
        this.quoteStrategy = quoteStrategy;
    }

    //回调具体报价策略的方法
    public BigDecimal getPrice(BigDecimal bigDecimal){
        return quoteStrategy.getPrice(bigDecimal);
    }
}
