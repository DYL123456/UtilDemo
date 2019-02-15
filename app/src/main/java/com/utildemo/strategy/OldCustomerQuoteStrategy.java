package com.utildemo.strategy;

import android.widget.Toast;

import com.utildemo.MyApplication;
import com.utildemo.interfac.IQuoteStrategy;

import java.math.BigDecimal;

/**
 * Created by ylding on 2019/2/14.
 */
public class OldCustomerQuoteStrategy implements IQuoteStrategy {
    @Override
    public BigDecimal getPrice(BigDecimal originalPrice) {
        Toast.makeText(MyApplication.getContext(), "恭喜！老客户享有9折优惠！", Toast.LENGTH_LONG).show();
        return originalPrice;
    }
}
