package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBusinessAuthApply is a Querydsl query type for BusinessAuthApply
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBusinessAuthApply extends EntityPathBase<BusinessAuthApply> {

    private static final long serialVersionUID = -26398525L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBusinessAuthApply businessAuthApply = new QBusinessAuthApply("businessAuthApply");

    public final NumberPath<java.math.BigDecimal> amount = createNumber("amount", java.math.BigDecimal.class);

    public final DateTimePath<java.util.Date> auditingTime = createDateTime("auditingTime", java.util.Date.class);

    public final StringPath authInfo = createString("authInfo");

    public final QBusinessAuthDeposit businessAuthDeposit;

    public final EnumPath<cn.ztuo.bitrade.constant.CertifiedBusinessStatus> certifiedBusinessStatus = createEnum("certifiedBusinessStatus", cn.ztuo.bitrade.constant.CertifiedBusinessStatus.class);

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final StringPath depositRecordId = createString("depositRecordId");

    public final StringPath detail = createString("detail");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QMember member;

    public final DateTimePath<java.util.Date> updateTime = createDateTime("updateTime", java.util.Date.class);

    public QBusinessAuthApply(String variable) {
        this(BusinessAuthApply.class, forVariable(variable), INITS);
    }

    public QBusinessAuthApply(Path<? extends BusinessAuthApply> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBusinessAuthApply(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBusinessAuthApply(PathMetadata metadata, PathInits inits) {
        this(BusinessAuthApply.class, metadata, inits);
    }

    public QBusinessAuthApply(Class<? extends BusinessAuthApply> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.businessAuthDeposit = inits.isInitialized("businessAuthDeposit") ? new QBusinessAuthDeposit(forProperty("businessAuthDeposit"), inits.get("businessAuthDeposit")) : null;
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member"), inits.get("member")) : null;
    }

}

