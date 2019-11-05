package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAdvertise is a Querydsl query type for Advertise
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAdvertise extends EntityPathBase<Advertise> {

    private static final long serialVersionUID = -902394076L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAdvertise advertise = new QAdvertise("advertise");

    public final EnumPath<cn.ztuo.bitrade.constant.AdvertiseType> advertiseType = createEnum("advertiseType", cn.ztuo.bitrade.constant.AdvertiseType.class);

    public final EnumPath<cn.ztuo.bitrade.constant.BooleanEnum> auto = createEnum("auto", cn.ztuo.bitrade.constant.BooleanEnum.class);

    public final StringPath autoword = createString("autoword");

    public final QOtcCoin coin;

    public final StringPath coinUnit = createString("coinUnit");

    public final QCountry country;

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final NumberPath<java.math.BigDecimal> dealAmount = createNumber("dealAmount", java.math.BigDecimal.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final EnumPath<cn.ztuo.bitrade.constant.AdvertiseLevel> level = createEnum("level", cn.ztuo.bitrade.constant.AdvertiseLevel.class);

    public final StringPath limitMoney = createString("limitMoney");

    public final NumberPath<java.math.BigDecimal> maxLimit = createNumber("maxLimit", java.math.BigDecimal.class);

    public final QMember member;

    public final NumberPath<java.math.BigDecimal> minLimit = createNumber("minLimit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> number = createNumber("number", java.math.BigDecimal.class);

    public final StringPath payMode = createString("payMode");

    public final NumberPath<java.math.BigDecimal> premiseRate = createNumber("premiseRate", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> price = createNumber("price", java.math.BigDecimal.class);

    public final EnumPath<cn.ztuo.bitrade.constant.PriceType> priceType = createEnum("priceType", cn.ztuo.bitrade.constant.PriceType.class);

    public final NumberPath<java.math.BigDecimal> remainAmount = createNumber("remainAmount", java.math.BigDecimal.class);

    public final StringPath remark = createString("remark");

    public final EnumPath<cn.ztuo.bitrade.constant.AdvertiseControlStatus> status = createEnum("status", cn.ztuo.bitrade.constant.AdvertiseControlStatus.class);

    public final NumberPath<Integer> timeLimit = createNumber("timeLimit", Integer.class);

    public final DateTimePath<java.util.Date> updateTime = createDateTime("updateTime", java.util.Date.class);

    public final StringPath username = createString("username");

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QAdvertise(String variable) {
        this(Advertise.class, forVariable(variable), INITS);
    }

    public QAdvertise(Path<? extends Advertise> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAdvertise(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAdvertise(PathMetadata metadata, PathInits inits) {
        this(Advertise.class, metadata, inits);
    }

    public QAdvertise(Class<? extends Advertise> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.coin = inits.isInitialized("coin") ? new QOtcCoin(forProperty("coin")) : null;
        this.country = inits.isInitialized("country") ? new QCountry(forProperty("country")) : null;
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member"), inits.get("member")) : null;
    }

}

