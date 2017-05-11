package com.heiha.example.mapper;

import com.heiha.example.SampleMysqlMybatisApplication;
import com.heiha.example.dto.SampleInsertDTO;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * <br>
 * <b>Project:</b> spring-boot-demo<br>
 * <b>Date:</b> 2017/5/11 16:25<br>
 * <b>Author:</b> heiha<br>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SampleMysqlMybatisApplication.class)
@MapperScan("com.heiha.example.mapper")
public class SampleMapperTest {

    @Autowired
    private SampleMapper sampleMapper;

    @Test
    public void sqlOperations() {
        SampleInsertDTO insertInfo = new SampleInsertDTO();
        insertInfo.setCreateUserId("qqq");
        insertInfo.setVersion("1");
        System.out.println(sampleMapper.insertSample(insertInfo));


        SampleInsertDTO insertInfo2 = new SampleInsertDTO();
        insertInfo2.setCreateUserId("www");
        insertInfo2.setVersion("2");
        List<SampleInsertDTO> list = new ArrayList<>();
        list.add(insertInfo);
        list.add(insertInfo2);
        System.out.println(sampleMapper.insertSampleList(list));
    }

}