package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAdminAccessLog is a Querydsl query type for AdminAccessLog
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAdminAccessLog extends EntityPathBase<AdminAccessLog> {

    private static final long serialVersionUID = 1717870548L;

    public static final QAdminAccessLog adminAccessLog = new QAdminAccessLog("adminAccessLog");

    public final StringPath accessIp = createString("accessIp");

    public final StringPath accessMethod = createString("accessMethod");

    public final DateTimePath<java.util.Date> accessTime = createDateTime("accessTime", java.util.Date.class);

    public final NumberPath<Long> adminId = createNumber("adminId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final EnumPath<cn.ztuo.bitrade.constant.AdminModule> module = createEnum("module", cn.ztuo.bitrade.constant.AdminModule.class);

    public final StringPath operation = createString("operation");

    public final StringPath uri = createString("uri");

    public QAdminAccessLog(String variable) {
        super(AdminAccessLog.class, forVariable(variable));
    }

    public QAdminAccessLog(Path<? extends AdminAccessLog> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAdminAccessLog(PathMetadata metadata) {
        super(AdminAccessLog.class, metadata);
    }

}

