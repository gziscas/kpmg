package eface.dao;

import eface.model.FiliationList;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface FiliationListMapper {
    int insert(FiliationList record);

    List<FiliationList> selectAll();
}