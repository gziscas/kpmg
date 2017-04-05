package eface.dao;

import eface.model.MorDetailList;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface MorDetailListMapper {
    int deleteByPrimaryKey(String morregId);

    int insert(MorDetailList record);

    MorDetailList selectByPrimaryKey(String morregId);

    List<MorDetailList> selectAll();

    int updateByPrimaryKey(MorDetailList record);
}