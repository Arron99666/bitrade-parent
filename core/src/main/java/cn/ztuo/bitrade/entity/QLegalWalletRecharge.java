package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLegalWalletRecharge is a Querydsl query type for LegalWalletRecharge
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLegalWalletRecharge extends EntityPathBase<LegalWalletRecharge> {

    private static final long serialVersionUID = 607335318L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLegalWalletRecharge legalWalletRecharge = new QLegalWalletRecharge("legalWalletRecharge");

    public final QAdmin admin;

    public final NumberPath<java.math.BigDecimal> amount = createNumber("amount", java.math.BigDecimal.class);

    public final QCoin coin;

    public final DateTimePath<java.util.Date> creationTime = createDateTime("creationTime", java.util.Date.class);

    public final DateTimePath<java.util.Date> dealTime = createDateTime("dealTime", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QMember member;

    public final StringPath paymentInstrument = createString("paymentInstrument");

    public final EnumPath<cn.ztuo.bitrade.constant.PayMode> payMode = createEnum("payMode", cn.ztuo.bitrade.constant.PayMode.class);

    public final StringPath remark = createString("remark");

    public final EnumPath<cn.ztuo.bitrade.constant.LegalWalletState> state = createEnum("state", cn.ztuo.bitrade.constant.LegalWalletState.class);

    public final DateTimePath<java.util.Date> updateTime = createDateTime("updateTime", java.util.Date.class);

    public QLegalWalletRecharge(String variable) {
        this(LegalWalletRecharge.class, forVariable(variable), INITS);
    }

    public QLegalWalletRecharge(Path<? extends LegalWalletRecharge> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLegalWalletRecharge(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLegalWalletRecharge(PathMetadata metadata, PathInits inits) {
        this(LegalWalletRecharge.class, metadata, inits);
    }

    public QLegalWalletRecharge(Class<? extends LegalWalletRecharge> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.admin = inits.isInitialized("admin") ? new QAdmin(forProperty("admin"), inits.get("admin")) : null;
        this.coin = inits.isInitialized("coin") ? new QCoin(forProperty("coin")) : null;
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member"), inits.get("member")) : null;
    }

}

