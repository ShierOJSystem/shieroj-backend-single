package com.shieroj.model.dto.questionsumbit;

import com.shieroj.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 查询题目提交
 *
 * @author Shier
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class QuestionSubmitQueryRequest extends PageRequest implements Serializable {

    /**
     * 题目 id
     */
    private Long questionId;

    /**
     * 编程语言
     */
    private String submitLanguage;

    /**
     * 提交状态
     */
    private Integer submitState;


    /**
     * 用户 id
     */
    private Long userId;

    private static final long serialVersionUID = 1L;
}