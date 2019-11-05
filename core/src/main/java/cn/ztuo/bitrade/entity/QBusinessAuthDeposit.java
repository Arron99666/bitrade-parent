package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBusinessAuthDeposit is a Querydsl query type for BusinessAuthDeposit
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBusinessAuthDeposit extends EntityPathBase<BusinessAuthDeposit> {

    private static final long serialVersionUID = -1546468685L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBusinessAuthDeposit businessAuthDeposit = new QBusinessAuthDeposit("businessAuthDeposit");

    public final QAdmin admin;

    public final NumberPath<java.math.BigDecimal> amount = createNumber("amount", java.math.BigDecimal.class);

    public final QCoin coin;

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final EnumPath<cn.ztuo.bitrade.constant.CommonStatus> status = createEnum("status", cn.ztuo.bitrade.constant.CommonStatus.class);

    public QBusinessAuthDeposit(String variable) {
        this(BusinessAuthDeposit.class, forVariable(variable), INITS);
    }

    public QBusinessAuthDeposit(Path<? extends BusinessAuthDeposit> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBusinessAuthDeposit(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBusinessAuthDeposit(PathMetadata metadata, PathInits inits) {
        this(BusinessAuthDeposit.class, metadata, inits);
    }

    public QBusinessAuthDeposit(Class<? extends BusinessAuthDeposit> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.admin = inits.isInitialized("admin") ? new QAdmin(forProperty("admin"), inits.get("admin")) : null;
        this.coin = inits.isInitialized("coin") ? new QCoin(forProperty("coin")) : null;
    }

}

