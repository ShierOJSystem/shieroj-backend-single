package com.shieroj.judge;

import com.shieroj.judge.codesandbox.model.JudgeInfo;
import com.shieroj.judge.strategy.DefaultJudgeStrategy;
import com.shieroj.judge.strategy.JavaLanguageJudgeStrategy;
import com.shieroj.judge.strategy.JudgeContext;
import com.shieroj.judge.strategy.JudgeStrategy;
import com.shieroj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 * @author Shier
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getSubmitLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }
}