package com.example.springbootmybatispluspagehelper.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.example.springbootmybatispluspagehelper.entity.Log;

import java.util.List;

public interface LogService {
    Log saveByLog(Log log);

    void removeByLogId(Long logId);

    void removeAllLog();

    Page<Log> findAllLog(Page<Log> page);

    List<Log> findLogLatest();

    Log findLogByLogId(Long logId);
}
