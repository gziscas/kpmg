package eface.dao;

import eface.model.ShareHolderList;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ShareHolderListMapper {
    int insert(ShareHolderList record);

    List<ShareHolderList> selectAll();
}