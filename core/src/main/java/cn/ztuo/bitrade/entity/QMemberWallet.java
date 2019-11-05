package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberWallet is a Querydsl query type for MemberWallet
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMemberWallet extends EntityPathBase<MemberWallet> {

    private static final long serialVersionUID = -1861891306L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberWallet memberWallet = new QMemberWallet("memberWallet");

    public final StringPath address = createString("address");

    public final NumberPath<java.math.BigDecimal> balance = createNumber("balance", java.math.BigDecimal.class);

    public final QCoin coin;

    public final NumberPath<java.math.BigDecimal> frozenBalance = createNumber("frozenBalance", java.math.BigDecimal.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final EnumPath<cn.ztuo.bitrade.constant.BooleanEnum> isLock = createEnum("isLock", cn.ztuo.bitrade.constant.BooleanEnum.class);

    public final NumberPath<Long> memberId = createNumber("memberId", Long.class);

    public final NumberPath<java.math.BigDecimal> toReleased = createNumber("toReleased", java.math.BigDecimal.class);

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public QMemberWallet(String variable) {
        this(MemberWallet.class, forVariable(variable), INITS);
    }

    public QMemberWallet(Path<? extends MemberWallet> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberWallet(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberWallet(PathMetadata metadata, PathInits inits) {
        this(MemberWallet.class, metadata, inits);
    }

    public QMemberWallet(Class<? extends MemberWallet> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.coin = inits.isInitialized("coin") ? new QCoin(forProperty("coin")) : null;
    }

}

