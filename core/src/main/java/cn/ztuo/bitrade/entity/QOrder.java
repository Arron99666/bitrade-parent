package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrder is a Querydsl query type for Order
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QOrder extends EntityPathBase<Order> {

    private static final long serialVersionUID = 1070331083L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrder order = new QOrder("order1");

    public final NumberPath<Long> advertiseId = createNumber("advertiseId", Long.class);

    public final EnumPath<cn.ztuo.bitrade.constant.AdvertiseType> advertiseType = createEnum("advertiseType", cn.ztuo.bitrade.constant.AdvertiseType.class);

    public final QAlipay alipay;

    public final QBankInfo bankInfo;

    public final DateTimePath<java.util.Date> cancelTime = createDateTime("cancelTime", java.util.Date.class);

    public final QOtcCoin coin;

    public final NumberPath<java.math.BigDecimal> commission = createNumber("commission", java.math.BigDecimal.class);

    public final StringPath country = createString("country");

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final NumberPath<Long> customerId = createNumber("customerId", Long.class);

    public final StringPath customerName = createString("customerName");

    public final StringPath customerRealName = createString("customerRealName");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<java.math.BigDecimal> maxLimit = createNumber("maxLimit", java.math.BigDecimal.class);

    public final NumberPath<Long> memberId = createNumber("memberId", Long.class);

    public final StringPath memberName = createString("memberName");

    public final StringPath memberRealName = createString("memberRealName");

    public final NumberPath<java.math.BigDecimal> minLimit = createNumber("minLimit", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> money = createNumber("money", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> number = createNumber("number", java.math.BigDecimal.class);

    public final StringPath orderSn = createString("orderSn");

    public final StringPath payMode = createString("payMode");

    public final DateTimePath<java.util.Date> payTime = createDateTime("payTime", java.util.Date.class);

    public final NumberPath<java.math.BigDecimal> price = createNumber("price", java.math.BigDecimal.class);

    public final DateTimePath<java.util.Date> releaseTime = createDateTime("releaseTime", java.util.Date.class);

    public final StringPath remark = createString("remark");

    public final EnumPath<cn.ztuo.bitrade.constant.OrderStatus> status = createEnum("status", cn.ztuo.bitrade.constant.OrderStatus.class);

    public final NumberPath<Integer> timeLimit = createNumber("timeLimit", Integer.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public final QWechatPay wechatPay;

    public QOrder(String variable) {
        this(Order.class, forVariable(variable), INITS);
    }

    public QOrder(Path<? extends Order> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOrder(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOrder(PathMetadata metadata, PathInits inits) {
        this(Order.class, metadata, inits);
    }

    public QOrder(Class<? extends Order> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.alipay = inits.isInitialized("alipay") ? new QAlipay(forProperty("alipay")) : null;
        this.bankInfo = inits.isInitialized("bankInfo") ? new QBankInfo(forProperty("bankInfo")) : null;
        this.coin = inits.isInitialized("coin") ? new QOtcCoin(forProperty("coin")) : null;
        this.wechatPay = inits.isInitialized("wechatPay") ? new QWechatPay(forProperty("wechatPay")) : null;
    }

}

