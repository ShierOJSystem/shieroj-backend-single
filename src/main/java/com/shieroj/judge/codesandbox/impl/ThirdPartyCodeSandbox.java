package com.shieroj.judge.codesandbox.impl;


import com.shieroj.judge.codesandbox.CodeSandBox;
import com.shieroj.judge.codesandbox.model.ExecuteCodeRequest;
import com.shieroj.judge.codesandbox.model.ExecuteCodeResponse;
/**
 * 第三方代码沙箱（调用网上现成的代码沙箱）
 */
public class ThirdPartyCodeSandbox implements CodeSandBox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
