package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberSignRecord is a Querydsl query type for MemberSignRecord
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMemberSignRecord extends EntityPathBase<MemberSignRecord> {

    private static final long serialVersionUID = -961424117L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberSignRecord memberSignRecord = new QMemberSignRecord("memberSignRecord");

    public final NumberPath<java.math.BigDecimal> amount = createNumber("amount", java.math.BigDecimal.class);

    public final QCoin coin;

    public final DateTimePath<java.util.Date> creationTime = createDateTime("creationTime", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QMember member;

    public final QSign sign;

    public QMemberSignRecord(String variable) {
        this(MemberSignRecord.class, forVariable(variable), INITS);
    }

    public QMemberSignRecord(Path<? extends MemberSignRecord> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberSignRecord(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberSignRecord(PathMetadata metadata, PathInits inits) {
        this(MemberSignRecord.class, metadata, inits);
    }

    public QMemberSignRecord(Class<? extends MemberSignRecord> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.coin = inits.isInitialized("coin") ? new QCoin(forProperty("coin")) : null;
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member"), inits.get("member")) : null;
        this.sign = inits.isInitialized("sign") ? new QSign(forProperty("sign"), inits.get("sign")) : null;
    }

}

