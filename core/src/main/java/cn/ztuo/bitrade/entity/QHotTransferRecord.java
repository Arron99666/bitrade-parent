package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QHotTransferRecord is a Querydsl query type for HotTransferRecord
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QHotTransferRecord extends EntityPathBase<HotTransferRecord> {

    private static final long serialVersionUID = -2132499514L;

    public static final QHotTransferRecord hotTransferRecord = new QHotTransferRecord("hotTransferRecord");

    public final NumberPath<Long> adminId = createNumber("adminId", Long.class);

    public final NumberPath<java.math.BigDecimal> amount = createNumber("amount", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> balance = createNumber("balance", java.math.BigDecimal.class);

    public final StringPath coldAddress = createString("coldAddress");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<java.math.BigDecimal> minerFee = createNumber("minerFee", java.math.BigDecimal.class);

    public final StringPath transactionNumber = createString("transactionNumber");

    public final DateTimePath<java.util.Date> transferTime = createDateTime("transferTime", java.util.Date.class);

    public final StringPath unit = createString("unit");

    public QHotTransferRecord(String variable) {
        super(HotTransferRecord.class, forVariable(variable));
    }

    public QHotTransferRecord(Path<? extends HotTransferRecord> path) {
        super(path.getType(), path.getMetadata());
    }

    public QHotTransferRecord(PathMetadata metadata) {
        super(HotTransferRecord.class, metadata);
    }

}

