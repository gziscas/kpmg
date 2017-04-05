package eface.dao;

import eface.model.FrPositionList;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface FrPositionListMapper {
    int insert(FrPositionList record);

    List<FrPositionList> selectAll();
}