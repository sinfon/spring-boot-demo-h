package com.heiha.example.mapper;

import com.heiha.example.dto.SampleDeleteDTO;
import com.heiha.example.dto.SampleInsertDTO;
import com.heiha.example.dto.SampleUpdateDTO;
import com.heiha.example.dto.SampleUpdateListDTO;
import com.heiha.example.po.Sample;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <br>
 * <b>Project:</b> spring-boot-demo<br>
 * <b>Date:</b> 2017/5/11 15:04<br>
 * <b>Author:</b> heiha<br>
 */
public interface SampleMapper {
    /**
     * Insert sample
     * @param insertInfo
     * @return
     */
    Integer insertSample(SampleInsertDTO insertInfo);

    /**
     * Insert sample list <br>
     * When parameterType is List, XML's parameterType set or not or set irrelevant is no use. <br>
     * see insertSampleList 1 to 5 in XML.
     * @param insertInfoList
     * @return
     */
    Integer insertSampleList(List<SampleInsertDTO> insertInfoList);

    /**
     * Insert sample list
     * @param insertInfoList
     * @return
     */
    Integer insertSampleList2(List<SampleInsertDTO> insertInfoList);

    /**
     * Insert sample list
     * @param insertInfoList
     * @return
     */
    Integer insertSampleList3(List<SampleInsertDTO> insertInfoList);


    /**
     * Insert sample list
     * @param insertInfoList
     * @return
     */
    Integer insertSampleList4(List<SampleInsertDTO> insertInfoList);

    /**
     * Insert sample list
     * @param insertInfoList
     * @return
     */
    Integer insertSampleList5(List<SampleInsertDTO> insertInfoList);

    /**
     * Delete samples which could match given conditions
     * @param condition
     * @return
     */
    Integer deleteSample(SampleDeleteDTO condition);

    /**
     * Update sample by id
     * @param info
     * @return
     */
    Integer updateSample(SampleUpdateDTO info);

    /**
     * Update sample list by id
     * @param infoList
     * @return
     */
    Integer updateSampleList(List<SampleUpdateDTO> infoList);

    /**
     * Update sample list by id
     * @param updateListDTO
     * @return
     */
    Integer updateSampleList2(SampleUpdateListDTO updateListDTO);
//
//    /**
//     * Get sample by id
//     * @param id
//     * @return
//     */
//    Sample getSampleById(Long id);
//
//    /**
//     * Get sample list
//     * @return
//     */
//    List<Sample> listSample();

}
