package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMemberTransaction is a Querydsl query type for MemberTransaction
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMemberTransaction extends EntityPathBase<MemberTransaction> {

    private static final long serialVersionUID = -1941682719L;

    public static final QMemberTransaction memberTransaction = new QMemberTransaction("memberTransaction");

    public final StringPath address = createString("address");

    public final NumberPath<java.math.BigDecimal> amount = createNumber("amount", java.math.BigDecimal.class);

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final StringPath discountFee = createString("discountFee");

    public final NumberPath<java.math.BigDecimal> fee = createNumber("fee", java.math.BigDecimal.class);

    public final NumberPath<Integer> flag = createNumber("flag", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> memberId = createNumber("memberId", Long.class);

    public final StringPath realFee = createString("realFee");

    public final StringPath symbol = createString("symbol");

    public final EnumPath<cn.ztuo.bitrade.constant.TransactionType> type = createEnum("type", cn.ztuo.bitrade.constant.TransactionType.class);

    public QMemberTransaction(String variable) {
        super(MemberTransaction.class, forVariable(variable));
    }

    public QMemberTransaction(Path<? extends MemberTransaction> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMemberTransaction(PathMetadata metadata) {
        super(MemberTransaction.class, metadata);
    }

}

