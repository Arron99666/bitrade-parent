package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRewardPromotionSetting is a Querydsl query type for RewardPromotionSetting
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRewardPromotionSetting extends EntityPathBase<RewardPromotionSetting> {

    private static final long serialVersionUID = 190098847L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRewardPromotionSetting rewardPromotionSetting = new QRewardPromotionSetting("rewardPromotionSetting");

    public final QAdmin admin;

    public final QCoin coin;

    public final NumberPath<Integer> effectiveTime = createNumber("effectiveTime", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath info = createString("info");

    public final EnumPath<cn.ztuo.bitrade.constant.BooleanEnum> status = createEnum("status", cn.ztuo.bitrade.constant.BooleanEnum.class);

    public final EnumPath<cn.ztuo.bitrade.constant.PromotionRewardType> type = createEnum("type", cn.ztuo.bitrade.constant.PromotionRewardType.class);

    public final DateTimePath<java.util.Date> updateTime = createDateTime("updateTime", java.util.Date.class);

    public QRewardPromotionSetting(String variable) {
        this(RewardPromotionSetting.class, forVariable(variable), INITS);
    }

    public QRewardPromotionSetting(Path<? extends RewardPromotionSetting> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRewardPromotionSetting(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRewardPromotionSetting(PathMetadata metadata, PathInits inits) {
        this(RewardPromotionSetting.class, metadata, inits);
    }

    public QRewardPromotionSetting(Class<? extends RewardPromotionSetting> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.admin = inits.isInitialized("admin") ? new QAdmin(forProperty("admin"), inits.get("admin")) : null;
        this.coin = inits.isInitialized("coin") ? new QCoin(forProperty("coin")) : null;
    }

}

