package com.yc.C71S3Tstsmuisc.dao;

import com.yc.C71S3Tstsmuisc.bean.Songlist;
import com.yc.C71S3Tstsmuisc.bean.SonglistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SonglistMapper {
    long countByExample(SonglistExample example);

    int deleteByExample(SonglistExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Songlist record);

    int insertSelective(Songlist record);

    List<Songlist> selectByExample(SonglistExample example);

    Songlist selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Songlist record, @Param("example") SonglistExample example);

    int updateByExample(@Param("record") Songlist record, @Param("example") SonglistExample example);

    int updateByPrimaryKeySelective(Songlist record);

    int updateByPrimaryKey(Songlist record);
}