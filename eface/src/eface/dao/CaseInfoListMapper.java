package eface.dao;

import eface.model.CaseInfoList;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface CaseInfoListMapper {
    int insert(CaseInfoList record);

    List<CaseInfoList> selectAll();
}