package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSign is a Querydsl query type for Sign
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSign extends EntityPathBase<Sign> {

    private static final long serialVersionUID = 1697205408L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSign sign = new QSign("sign");

    public final NumberPath<java.math.BigDecimal> amount = createNumber("amount", java.math.BigDecimal.class);

    public final QCoin coin;

    public final DateTimePath<java.util.Date> creationTime = createDateTime("creationTime", java.util.Date.class);

    public final DatePath<java.util.Date> endDate = createDate("endDate", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final EnumPath<cn.ztuo.bitrade.constant.SignStatus> status = createEnum("status", cn.ztuo.bitrade.constant.SignStatus.class);

    public QSign(String variable) {
        this(Sign.class, forVariable(variable), INITS);
    }

    public QSign(Path<? extends Sign> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSign(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSign(PathMetadata metadata, PathInits inits) {
        this(Sign.class, metadata, inits);
    }

    public QSign(Class<? extends Sign> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.coin = inits.isInitialized("coin") ? new QCoin(forProperty("coin")) : null;
    }

}

