package com.utildemo.strategy;

import com.utildemo.interfac.IStrategy;

/**
 * Created by ylding on 2019/2/14.
 */

//策略上下文
public class StrategyContext {
    private IStrategy iStrategy;

    public StrategyContext(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }

    public void contextMethod() {
        iStrategy.algorithMeth();
    }
}
