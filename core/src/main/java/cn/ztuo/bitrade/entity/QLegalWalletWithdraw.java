package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLegalWalletWithdraw is a Querydsl query type for LegalWalletWithdraw
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLegalWalletWithdraw extends EntityPathBase<LegalWalletWithdraw> {

    private static final long serialVersionUID = 473284601L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLegalWalletWithdraw legalWalletWithdraw = new QLegalWalletWithdraw("legalWalletWithdraw");

    public final QAdmin admin;

    public final NumberPath<java.math.BigDecimal> amount = createNumber("amount", java.math.BigDecimal.class);

    public final QCoin coin;

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final DateTimePath<java.util.Date> dealTime = createDateTime("dealTime", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QMember member;

    public final StringPath paymentInstrument = createString("paymentInstrument");

    public final EnumPath<cn.ztuo.bitrade.constant.PayMode> payMode = createEnum("payMode", cn.ztuo.bitrade.constant.PayMode.class);

    public final StringPath remark = createString("remark");

    public final DateTimePath<java.util.Date> remitTime = createDateTime("remitTime", java.util.Date.class);

    public final EnumPath<cn.ztuo.bitrade.constant.WithdrawStatus> status = createEnum("status", cn.ztuo.bitrade.constant.WithdrawStatus.class);

    public QLegalWalletWithdraw(String variable) {
        this(LegalWalletWithdraw.class, forVariable(variable), INITS);
    }

    public QLegalWalletWithdraw(Path<? extends LegalWalletWithdraw> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLegalWalletWithdraw(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLegalWalletWithdraw(PathMetadata metadata, PathInits inits) {
        this(LegalWalletWithdraw.class, metadata, inits);
    }

    public QLegalWalletWithdraw(Class<? extends LegalWalletWithdraw> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.admin = inits.isInitialized("admin") ? new QAdmin(forProperty("admin"), inits.get("admin")) : null;
        this.coin = inits.isInitialized("coin") ? new QCoin(forProperty("coin")) : null;
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member"), inits.get("member")) : null;
    }

}

