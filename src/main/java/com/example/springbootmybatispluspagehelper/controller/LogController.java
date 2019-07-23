package com.example.springbootmybatispluspagehelper.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.example.springbootmybatispluspagehelper.entity.Log;
import com.example.springbootmybatispluspagehelper.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LogController {
    @Autowired
    private LogService logService;
    /**
     * 日志分页
     *
     * @param model model
     * @param page  当前页码
     * @return 模板路径/themes/{theme}/index
     */
    @GetMapping(value = "logs")
    @ResponseBody
    public Page<Log> index(Model model,
                        @RequestParam(name = "page",required = false, defaultValue = "1") Integer page,
                        @RequestParam(name = "size",required = false, defaultValue = "10") Integer size) {
        //所有日志数据，分页
        Page pageable = new Page(page , size);
        Page<Log> logs = logService.findAllLog(pageable);
        return logs;
    }
}
