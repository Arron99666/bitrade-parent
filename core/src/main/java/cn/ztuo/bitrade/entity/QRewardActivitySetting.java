package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRewardActivitySetting is a Querydsl query type for RewardActivitySetting
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRewardActivitySetting extends EntityPathBase<RewardActivitySetting> {

    private static final long serialVersionUID = 860556431L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRewardActivitySetting rewardActivitySetting = new QRewardActivitySetting("rewardActivitySetting");

    public final QAdmin admin;

    public final QCoin coin;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath info = createString("info");

    public final EnumPath<cn.ztuo.bitrade.constant.BooleanEnum> status = createEnum("status", cn.ztuo.bitrade.constant.BooleanEnum.class);

    public final EnumPath<cn.ztuo.bitrade.constant.ActivityRewardType> type = createEnum("type", cn.ztuo.bitrade.constant.ActivityRewardType.class);

    public final DateTimePath<java.util.Date> updateTime = createDateTime("updateTime", java.util.Date.class);

    public QRewardActivitySetting(String variable) {
        this(RewardActivitySetting.class, forVariable(variable), INITS);
    }

    public QRewardActivitySetting(Path<? extends RewardActivitySetting> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRewardActivitySetting(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRewardActivitySetting(PathMetadata metadata, PathInits inits) {
        this(RewardActivitySetting.class, metadata, inits);
    }

    public QRewardActivitySetting(Class<? extends RewardActivitySetting> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.admin = inits.isInitialized("admin") ? new QAdmin(forProperty("admin"), inits.get("admin")) : null;
        this.coin = inits.isInitialized("coin") ? new QCoin(forProperty("coin")) : null;
    }

}

