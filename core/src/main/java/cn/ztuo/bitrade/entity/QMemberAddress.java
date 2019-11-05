package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberAddress is a Querydsl query type for MemberAddress
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMemberAddress extends EntityPathBase<MemberAddress> {

    private static final long serialVersionUID = 144377975L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberAddress memberAddress = new QMemberAddress("memberAddress");

    public final StringPath address = createString("address");

    public final QCoin coin;

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final DateTimePath<java.util.Date> deleteTime = createDateTime("deleteTime", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> memberId = createNumber("memberId", Long.class);

    public final StringPath remark = createString("remark");

    public final EnumPath<cn.ztuo.bitrade.constant.CommonStatus> status = createEnum("status", cn.ztuo.bitrade.constant.CommonStatus.class);

    public QMemberAddress(String variable) {
        this(MemberAddress.class, forVariable(variable), INITS);
    }

    public QMemberAddress(Path<? extends MemberAddress> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberAddress(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberAddress(PathMetadata metadata, PathInits inits) {
        this(MemberAddress.class, metadata, inits);
    }

    public QMemberAddress(Class<? extends MemberAddress> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.coin = inits.isInitialized("coin") ? new QCoin(forProperty("coin")) : null;
    }

}

