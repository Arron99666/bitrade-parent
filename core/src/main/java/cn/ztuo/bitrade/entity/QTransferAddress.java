package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTransferAddress is a Querydsl query type for TransferAddress
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTransferAddress extends EntityPathBase<TransferAddress> {

    private static final long serialVersionUID = 1325482694L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTransferAddress transferAddress = new QTransferAddress("transferAddress");

    public final StringPath address = createString("address");

    public final QCoin coin;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<java.math.BigDecimal> minAmount = createNumber("minAmount", java.math.BigDecimal.class);

    public final EnumPath<cn.ztuo.bitrade.constant.CommonStatus> status = createEnum("status", cn.ztuo.bitrade.constant.CommonStatus.class);

    public final NumberPath<java.math.BigDecimal> transferFee = createNumber("transferFee", java.math.BigDecimal.class);

    public QTransferAddress(String variable) {
        this(TransferAddress.class, forVariable(variable), INITS);
    }

    public QTransferAddress(Path<? extends TransferAddress> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTransferAddress(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTransferAddress(PathMetadata metadata, PathInits inits) {
        this(TransferAddress.class, metadata, inits);
    }

    public QTransferAddress(Class<? extends TransferAddress> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.coin = inits.isInitialized("coin") ? new QCoin(forProperty("coin")) : null;
    }

}

