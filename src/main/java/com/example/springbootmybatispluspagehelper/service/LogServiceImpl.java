package com.example.springbootmybatispluspagehelper.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.example.springbootmybatispluspagehelper.entity.Log;
import com.example.springbootmybatispluspagehelper.mapper.LogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogServiceImpl implements LogService {
    @Autowired(required = false)
    private LogMapper logMapper;
    /**
     * 保存日志
     *
     * @param log log
     * @return log
     */
    @Override
    public Log saveByLog(Log log) {
        logMapper.insert(log);
        return log;
    }
    /**
     * 根据编号移除
     *
     * @param logId logId
     */
    @Override
    public void removeByLogId(Long logId) {
        logMapper.deleteById(logId);
    }
    /**
     * 移除所有日志
     */
    @Override
    public void removeAllLog() {
        logMapper.deleteAll();
    }
    /**
     * 查询所有日志并分页
     *
     * @param page 分页信息
     * @return Page
     */
    @Override
    public Page<Log> findAllLog(Page<Log> page) {
        return page.setRecords(logMapper.findAll(page));
    }
    /**
     * 查询最新的五条日志
     *
     * @return List
     */
    @Override
    public List<Log> findLogLatest() {
        return logMapper.findTopFive();
    }
    /**
     * 根据编号查询
     *
     * @param logId logId
     * @return Optional
     */
    @Override
    public Log findLogByLogId(Long logId) {
        return logMapper.selectById(logId);
    }
}