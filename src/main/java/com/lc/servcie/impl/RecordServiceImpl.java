package com.lc.servcie.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lc.entity.Record;
import com.lc.mapper.RecordMapper;
import com.lc.servcie.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lc
 * @date 2020/12/27 15:24
 */
@Service
public class RecordServiceImpl extends ServiceImpl<RecordMapper, Record> implements RecordService {

    @Autowired
    private RecordMapper recordMapper;

}
