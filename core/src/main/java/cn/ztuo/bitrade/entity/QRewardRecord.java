package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRewardRecord is a Querydsl query type for RewardRecord
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRewardRecord extends EntityPathBase<RewardRecord> {

    private static final long serialVersionUID = 127673411L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRewardRecord rewardRecord = new QRewardRecord("rewardRecord");

    public final NumberPath<java.math.BigDecimal> amount = createNumber("amount", java.math.BigDecimal.class);

    public final QCoin coin;

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QMember member;

    public final StringPath remark = createString("remark");

    public final EnumPath<cn.ztuo.bitrade.constant.RewardRecordType> type = createEnum("type", cn.ztuo.bitrade.constant.RewardRecordType.class);

    public QRewardRecord(String variable) {
        this(RewardRecord.class, forVariable(variable), INITS);
    }

    public QRewardRecord(Path<? extends RewardRecord> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRewardRecord(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRewardRecord(PathMetadata metadata, PathInits inits) {
        this(RewardRecord.class, metadata, inits);
    }

    public QRewardRecord(Class<? extends RewardRecord> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.coin = inits.isInitialized("coin") ? new QCoin(forProperty("coin")) : null;
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member"), inits.get("member")) : null;
    }

}

