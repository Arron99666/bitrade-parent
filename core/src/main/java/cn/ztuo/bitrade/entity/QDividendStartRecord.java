package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDividendStartRecord is a Querydsl query type for DividendStartRecord
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDividendStartRecord extends EntityPathBase<DividendStartRecord> {

    private static final long serialVersionUID = -1218070879L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDividendStartRecord dividendStartRecord = new QDividendStartRecord("dividendStartRecord");

    public final QAdmin admin;

    public final NumberPath<java.math.BigDecimal> amount = createNumber("amount", java.math.BigDecimal.class);

    public final DateTimePath<java.util.Date> date = createDateTime("date", java.util.Date.class);

    public final NumberPath<Long> end = createNumber("end", Long.class);

    public final DateTimePath<java.util.Date> endDate = createDateTime("endDate", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<java.math.BigDecimal> rate = createNumber("rate", java.math.BigDecimal.class);

    public final NumberPath<Long> start = createNumber("start", Long.class);

    public final DateTimePath<java.util.Date> startDate = createDateTime("startDate", java.util.Date.class);

    public final StringPath unit = createString("unit");

    public QDividendStartRecord(String variable) {
        this(DividendStartRecord.class, forVariable(variable), INITS);
    }

    public QDividendStartRecord(Path<? extends DividendStartRecord> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDividendStartRecord(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDividendStartRecord(PathMetadata metadata, PathInits inits) {
        this(DividendStartRecord.class, metadata, inits);
    }

    public QDividendStartRecord(Class<? extends DividendStartRecord> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.admin = inits.isInitialized("admin") ? new QAdmin(forProperty("admin"), inits.get("admin")) : null;
    }

}

