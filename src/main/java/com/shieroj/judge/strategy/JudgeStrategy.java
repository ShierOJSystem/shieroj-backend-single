package com.shieroj.judge.strategy;

import com.shieroj.judge.codesandbox.model.JudgeInfo;

/**
 * 判题策略
 * @author Shier
 */
public interface JudgeStrategy {

    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext);
}