package com.utildemo.strategy;

import android.widget.Toast;

import com.utildemo.MyApplication;
import com.utildemo.interfac.IQuoteStrategy;

import java.math.BigDecimal;

/**
 * Created by ylding on 2019/2/14.
 */
public class NewCustomerQuoteStrategy implements IQuoteStrategy {
    @Override
    public BigDecimal getPrice(BigDecimal originalPrice) {
        Toast.makeText(MyApplication.getContext(), "抱歉！新客户没有折扣！", Toast.LENGTH_LONG).show();
        return originalPrice;
    }
}
