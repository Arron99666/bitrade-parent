package cn.ztuo.bitrade.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import cn.ztuo.bitrade.dao.base.BaseDao;
import cn.ztuo.bitrade.entity.DividendStartRecord;

import java.util.List;

/**
 * @author GS
 * @date 2018年03月22日
 */
public interface DividendStartRecordDao extends BaseDao<DividendStartRecord> {

    @Query("select a from DividendStartRecord a where ((a.start<:start and a.end>=:start) or (a.start<:en and a.end>=:en) " +
            " or (a.start>=:start and a.end<:en ) or (a.start<=:start and a.end>:en)) and a.unit=:unit")
    List<DividendStartRecord> findAllByTimeAndUnit(@Param("start") long start, @Param("en") long end, @Param("unit") String unit);
}
