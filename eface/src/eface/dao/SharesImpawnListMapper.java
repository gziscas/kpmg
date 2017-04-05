package eface.dao;

import eface.model.SharesImpawnList;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface SharesImpawnListMapper {
    int insert(SharesImpawnList record);

    List<SharesImpawnList> selectAll();
}