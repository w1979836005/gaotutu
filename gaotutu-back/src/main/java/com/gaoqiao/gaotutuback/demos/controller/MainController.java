package com.gaoqiao.gaotutuback.demos.controller;

import com.gaoqiao.gaotutuback.demos.common.BaseResponse;
import com.gaoqiao.gaotutuback.demos.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

    /**
     * 健康检查
     */
    @GetMapping("/health")
    public BaseResponse<String> health() {
        return ResultUtils.success("ok");
    }
}

