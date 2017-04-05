package eface.dao;

import eface.model.LiquidationList;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface LiquidationListMapper {
    int insert(LiquidationList record);

    List<LiquidationList> selectAll();
}