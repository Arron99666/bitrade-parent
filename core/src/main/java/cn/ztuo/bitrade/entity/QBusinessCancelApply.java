package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBusinessCancelApply is a Querydsl query type for BusinessCancelApply
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBusinessCancelApply extends EntityPathBase<BusinessCancelApply> {

    private static final long serialVersionUID = 300449777L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBusinessCancelApply businessCancelApply = new QBusinessCancelApply("businessCancelApply");

    public final DateTimePath<java.util.Date> cancelApplyTime = createDateTime("cancelApplyTime", java.util.Date.class);

    public final StringPath depositRecordId = createString("depositRecordId");

    public final StringPath detail = createString("detail");

    public final DateTimePath<java.util.Date> handleTime = createDateTime("handleTime", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QMember member;

    public final StringPath reason = createString("reason");

    public final EnumPath<cn.ztuo.bitrade.constant.CertifiedBusinessStatus> status = createEnum("status", cn.ztuo.bitrade.constant.CertifiedBusinessStatus.class);

    public QBusinessCancelApply(String variable) {
        this(BusinessCancelApply.class, forVariable(variable), INITS);
    }

    public QBusinessCancelApply(Path<? extends BusinessCancelApply> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBusinessCancelApply(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBusinessCancelApply(PathMetadata metadata, PathInits inits) {
        this(BusinessCancelApply.class, metadata, inits);
    }

    public QBusinessCancelApply(Class<? extends BusinessCancelApply> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member"), inits.get("member")) : null;
    }

}

