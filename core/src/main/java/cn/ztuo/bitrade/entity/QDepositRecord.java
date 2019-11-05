package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDepositRecord is a Querydsl query type for DepositRecord
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDepositRecord extends EntityPathBase<DepositRecord> {

    private static final long serialVersionUID = -1402330868L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDepositRecord depositRecord = new QDepositRecord("depositRecord");

    public final NumberPath<java.math.BigDecimal> amount = createNumber("amount", java.math.BigDecimal.class);

    public final QCoin coin;

    public final StringPath id = createString("id");

    public final QMember member;

    public final EnumPath<cn.ztuo.bitrade.constant.DepositStatusEnum> status = createEnum("status", cn.ztuo.bitrade.constant.DepositStatusEnum.class);

    public QDepositRecord(String variable) {
        this(DepositRecord.class, forVariable(variable), INITS);
    }

    public QDepositRecord(Path<? extends DepositRecord> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDepositRecord(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDepositRecord(PathMetadata metadata, PathInits inits) {
        this(DepositRecord.class, metadata, inits);
    }

    public QDepositRecord(Class<? extends DepositRecord> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.coin = inits.isInitialized("coin") ? new QCoin(forProperty("coin")) : null;
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member"), inits.get("member")) : null;
    }

}

