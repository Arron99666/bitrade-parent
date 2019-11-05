package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QSysAdvertise is a Querydsl query type for SysAdvertise
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSysAdvertise extends EntityPathBase<SysAdvertise> {

    private static final long serialVersionUID = -2105361475L;

    public static final QSysAdvertise sysAdvertise = new QSysAdvertise("sysAdvertise");

    public final StringPath author = createString("author");

    public final StringPath content = createString("content");

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final StringPath endTime = createString("endTime");

    public final StringPath linkUrl = createString("linkUrl");

    public final StringPath name = createString("name");

    public final StringPath remark = createString("remark");

    public final StringPath serialNumber = createString("serialNumber");

    public final NumberPath<Integer> sort = createNumber("sort", Integer.class);

    public final StringPath startTime = createString("startTime");

    public final EnumPath<cn.ztuo.bitrade.constant.CommonStatus> status = createEnum("status", cn.ztuo.bitrade.constant.CommonStatus.class);

    public final EnumPath<cn.ztuo.bitrade.constant.SysAdvertiseLocation> sysAdvertiseLocation = createEnum("sysAdvertiseLocation", cn.ztuo.bitrade.constant.SysAdvertiseLocation.class);

    public final StringPath url = createString("url");

    public QSysAdvertise(String variable) {
        super(SysAdvertise.class, forVariable(variable));
    }

    public QSysAdvertise(Path<? extends SysAdvertise> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSysAdvertise(PathMetadata metadata) {
        super(SysAdvertise.class, metadata);
    }

}

