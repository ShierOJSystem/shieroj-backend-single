package com.shieroj.judge;

import com.shieroj.model.entity.QuestionSubmit;

/**
 * @author Shier
 * @createTime 2023/8/30 星期三 12:04
 * 判题服务 ：执行代码
 */
public interface JudgeService {
    /**
     * 判题
     *
     * @param questionSubmitId
     * @return
     */
    QuestionSubmit doJudge(long questionSubmitId);
}
