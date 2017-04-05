package eface.dao;

import eface.model.SharesFrostList;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface SharesFrostListMapper {
    int deleteByPrimaryKey(String froDocno);

    int insert(SharesFrostList record);

    SharesFrostList selectByPrimaryKey(String froDocno);

    List<SharesFrostList> selectAll();

    int updateByPrimaryKey(SharesFrostList record);
}