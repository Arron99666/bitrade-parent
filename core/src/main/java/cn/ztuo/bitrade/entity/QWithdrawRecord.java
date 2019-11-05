package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QWithdrawRecord is a Querydsl query type for WithdrawRecord
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QWithdrawRecord extends EntityPathBase<WithdrawRecord> {

    private static final long serialVersionUID = 540467998L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QWithdrawRecord withdrawRecord = new QWithdrawRecord("withdrawRecord");

    public final StringPath address = createString("address");

    public final QAdmin admin;

    public final NumberPath<java.math.BigDecimal> arrivedAmount = createNumber("arrivedAmount", java.math.BigDecimal.class);

    public final EnumPath<cn.ztuo.bitrade.constant.BooleanEnum> canAutoWithdraw = createEnum("canAutoWithdraw", cn.ztuo.bitrade.constant.BooleanEnum.class);

    public final QCoin coin;

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final DateTimePath<java.util.Date> dealTime = createDateTime("dealTime", java.util.Date.class);

    public final NumberPath<java.math.BigDecimal> fee = createNumber("fee", java.math.BigDecimal.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final EnumPath<cn.ztuo.bitrade.constant.BooleanEnum> isAuto = createEnum("isAuto", cn.ztuo.bitrade.constant.BooleanEnum.class);

    public final NumberPath<Long> memberId = createNumber("memberId", Long.class);

    public final StringPath remark = createString("remark");

    public final EnumPath<cn.ztuo.bitrade.constant.WithdrawStatus> status = createEnum("status", cn.ztuo.bitrade.constant.WithdrawStatus.class);

    public final NumberPath<java.math.BigDecimal> totalAmount = createNumber("totalAmount", java.math.BigDecimal.class);

    public final StringPath transactionNumber = createString("transactionNumber");

    public QWithdrawRecord(String variable) {
        this(WithdrawRecord.class, forVariable(variable), INITS);
    }

    public QWithdrawRecord(Path<? extends WithdrawRecord> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QWithdrawRecord(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QWithdrawRecord(PathMetadata metadata, PathInits inits) {
        this(WithdrawRecord.class, metadata, inits);
    }

    public QWithdrawRecord(Class<? extends WithdrawRecord> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.admin = inits.isInitialized("admin") ? new QAdmin(forProperty("admin"), inits.get("admin")) : null;
        this.coin = inits.isInitialized("coin") ? new QCoin(forProperty("coin")) : null;
    }

}

