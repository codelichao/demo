package com.lc.controller;

import com.lc.entity.Record;
import com.lc.servcie.RecordService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author lc
 * @date 2020/12/27 15:36
 */
@RestController
@Api(tags = "消费记录接口")
@RequestMapping("/record")
public class RecordController {

    @Autowired
    private RecordService recordService;

    @ApiOperation(value="保存消费记录")
    @PostMapping("/save")
    public void save(@RequestBody Record record){
        recordService.save(record);
    }

    @ApiOperation(value="删除消费记录")
    @DeleteMapping("/remove")
    public void remove(Integer id){
        recordService.removeById(id);
    }

    @ApiOperation(value="修改消费记录")
    @PostMapping("/update")
    public void update(@RequestBody Record record){
        recordService.updateById(record);
    }

    @ApiOperation(value="查询消费记录")
    @GetMapping("/selectAll")
    public List<Record> selectAll(){
        return recordService.list();
    }
}
