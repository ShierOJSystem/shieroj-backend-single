package com.shieroj.judge.strategy;


import com.shieroj.judge.codesandbox.model.JudgeInfo;
import com.shieroj.model.dto.question.JudgeCase;
import com.shieroj.model.entity.Question;
import com.shieroj.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * 上下文（用于定义在策略中传递的参数）
 * @author Shier
 */
@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;

}
