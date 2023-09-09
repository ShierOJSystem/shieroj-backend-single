package com.shieroj.model.dto.question;

import lombok.Data;

/**
 * 判题配置
 *
 * @author Shier
 * @createTime 2023/8/25 星期五 19:34
 */

@Data
public class JudgeConfig {

    /**
     * 时间限制 (ms)
     */
    private Long timeLimit;
    /**
     * 内存限制 (KB)
     */
    private Long memoryLimit;
    /**
     * 堆栈限制 (KB)
     */
    private Long stackLimit;

}
