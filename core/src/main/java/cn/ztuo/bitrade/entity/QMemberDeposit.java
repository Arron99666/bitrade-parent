package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMemberDeposit is a Querydsl query type for MemberDeposit
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMemberDeposit extends EntityPathBase<MemberDeposit> {

    private static final long serialVersionUID = -1448443103L;

    public static final QMemberDeposit memberDeposit = new QMemberDeposit("memberDeposit");

    public final StringPath address = createString("address");

    public final NumberPath<java.math.BigDecimal> amount = createNumber("amount", java.math.BigDecimal.class);

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> memberId = createNumber("memberId", Long.class);

    public final StringPath txid = createString("txid");

    public final StringPath unit = createString("unit");

    public QMemberDeposit(String variable) {
        super(MemberDeposit.class, forVariable(variable));
    }

    public QMemberDeposit(Path<? extends MemberDeposit> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMemberDeposit(PathMetadata metadata) {
        super(MemberDeposit.class, metadata);
    }

}

