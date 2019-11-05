package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QSysHelp is a Querydsl query type for SysHelp
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSysHelp extends EntityPathBase<SysHelp> {

    private static final long serialVersionUID = 1559418347L;

    public static final QSysHelp sysHelp = new QSysHelp("sysHelp");

    public final StringPath author = createString("author");

    public final StringPath content = createString("content");

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath imgUrl = createString("imgUrl");

    public final StringPath isTop = createString("isTop");

    public final NumberPath<Integer> sort = createNumber("sort", Integer.class);

    public final EnumPath<cn.ztuo.bitrade.constant.CommonStatus> status = createEnum("status", cn.ztuo.bitrade.constant.CommonStatus.class);

    public final EnumPath<cn.ztuo.bitrade.constant.SysHelpClassification> sysHelpClassification = createEnum("sysHelpClassification", cn.ztuo.bitrade.constant.SysHelpClassification.class);

    public final StringPath title = createString("title");

    public QSysHelp(String variable) {
        super(SysHelp.class, forVariable(variable));
    }

    public QSysHelp(Path<? extends SysHelp> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSysHelp(PathMetadata metadata) {
        super(SysHelp.class, metadata);
    }

}

