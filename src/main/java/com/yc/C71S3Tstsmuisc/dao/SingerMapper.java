package com.yc.C71S3Tstsmuisc.dao;

import com.yc.C71S3Tstsmuisc.bean.Singer;
import com.yc.C71S3Tstsmuisc.bean.SingerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SingerMapper {
    long countByExample(SingerExample example);

    int deleteByExample(SingerExample example);

    int deleteByPrimaryKey(Integer sId);

    int insert(Singer record);

    int insertSelective(Singer record);

    List<Singer> selectByExample(SingerExample example);

    Singer selectByPrimaryKey(Integer sId);

    int updateByExampleSelective(@Param("record") Singer record, @Param("example") SingerExample example);

    int updateByExample(@Param("record") Singer record, @Param("example") SingerExample example);

    int updateByPrimaryKeySelective(Singer record);

    int updateByPrimaryKey(Singer record);
}