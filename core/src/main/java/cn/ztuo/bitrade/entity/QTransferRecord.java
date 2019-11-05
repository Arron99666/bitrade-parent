package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTransferRecord is a Querydsl query type for TransferRecord
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTransferRecord extends EntityPathBase<TransferRecord> {

    private static final long serialVersionUID = -1132223681L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTransferRecord transferRecord = new QTransferRecord("transferRecord");

    public final StringPath address = createString("address");

    public final NumberPath<java.math.BigDecimal> amount = createNumber("amount", java.math.BigDecimal.class);

    public final QCoin coin;

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final NumberPath<java.math.BigDecimal> fee = createNumber("fee", java.math.BigDecimal.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> memberId = createNumber("memberId", Long.class);

    public final StringPath orderSn = createString("orderSn");

    public final StringPath remark = createString("remark");

    public QTransferRecord(String variable) {
        this(TransferRecord.class, forVariable(variable), INITS);
    }

    public QTransferRecord(Path<? extends TransferRecord> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTransferRecord(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTransferRecord(PathMetadata metadata, PathInits inits) {
        this(TransferRecord.class, metadata, inits);
    }

    public QTransferRecord(Class<? extends TransferRecord> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.coin = inits.isInitialized("coin") ? new QCoin(forProperty("coin")) : null;
    }

}

