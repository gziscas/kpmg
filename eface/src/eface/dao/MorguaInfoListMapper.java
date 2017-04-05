package eface.dao;

import eface.model.MorguaInfoList;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface MorguaInfoListMapper {
    int deleteByPrimaryKey(String morregId);

    int insert(MorguaInfoList record);

    MorguaInfoList selectByPrimaryKey(String morregId);

    List<MorguaInfoList> selectAll();

    int updateByPrimaryKey(MorguaInfoList record);
}