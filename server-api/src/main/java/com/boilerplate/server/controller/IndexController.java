package com.boilerplate.server.controller;

import com.boilerplate.server.dao.TestMapper;
import com.boilerplate.server.model.TestExample;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试一下
 * Created by sulin on 16/6/5.
 */
@RestController
public class IndexController {

    @Autowired
    private TestMapper testMapper;

    @RequestMapping("/")
    public Object index() {
        TestExample testExample = new TestExample();
        testExample.setLimitStart(1);
        testExample.setLimitEnd(1);
        return testMapper.selectByExample(testExample);
    }

}
