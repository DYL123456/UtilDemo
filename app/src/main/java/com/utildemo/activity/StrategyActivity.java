package com.utildemo.activity;

import android.app.Activity;
import android.os.Bundle;

import com.utildemo.interfac.IQuoteStrategy;
import com.utildemo.interfac.IStrategy;
import com.utildemo.strategy.ConcreteStrategy;
import com.utildemo.strategy.NewCustomerQuoteStrategy;
import com.utildemo.strategy.QuoteContext;
import com.utildemo.strategy.StrategyContext;

import java.math.BigDecimal;

/**
 * Created by ylding on 2019/2/14.
 *
 * 现实生活中我们到商场买东西的时候，卖场往往根据不同的客户制定不同的报价策略，比如针对新客户不打折扣，针对老客户打9折，针对VIP客户打8折...
 * 现在我们要做一个报价管理的模块，简要点就是要针对不同的客户，提供不同的折扣报价。
 */
public class StrategyActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //1.创建具体策略实现
        IStrategy iStrategy = new ConcreteStrategy();
        //2.在创建策略上下文的同时，将具体的策略实现对象注入到策略上下文当中
        StrategyContext ctx = new StrategyContext(iStrategy);
        //3.调用上下文对象的方法来完成对具体策略实现的回调
        ctx.contextMethod();


        //两外一套三部曲
        IQuoteStrategy iQuoteStrategy = new NewCustomerQuoteStrategy();
        QuoteContext quoteContext = new QuoteContext(iQuoteStrategy);
        quoteContext.getPrice(new BigDecimal(100));


    }
}
