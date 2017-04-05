package eface.dao;

import eface.model.FrinvList;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface FrinvListMapper {
    int insert(FrinvList record);

    List<FrinvList> selectAll();
}