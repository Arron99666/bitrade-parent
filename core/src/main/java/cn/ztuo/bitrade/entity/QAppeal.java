package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAppeal is a Querydsl query type for Appeal
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAppeal extends EntityPathBase<Appeal> {

    private static final long serialVersionUID = -1581772878L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAppeal appeal = new QAppeal("appeal");

    public final QAdmin admin;

    public final NumberPath<Long> associateId = createNumber("associateId", Long.class);

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final DateTimePath<java.util.Date> dealWithTime = createDateTime("dealWithTime", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> initiatorId = createNumber("initiatorId", Long.class);

    public final EnumPath<cn.ztuo.bitrade.constant.BooleanEnum> isSuccess = createEnum("isSuccess", cn.ztuo.bitrade.constant.BooleanEnum.class);

    public final QOrder order;

    public final StringPath remark = createString("remark");

    public final EnumPath<cn.ztuo.bitrade.constant.AppealStatus> status = createEnum("status", cn.ztuo.bitrade.constant.AppealStatus.class);

    public QAppeal(String variable) {
        this(Appeal.class, forVariable(variable), INITS);
    }

    public QAppeal(Path<? extends Appeal> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAppeal(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAppeal(PathMetadata metadata, PathInits inits) {
        this(Appeal.class, metadata, inits);
    }

    public QAppeal(Class<? extends Appeal> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.admin = inits.isInitialized("admin") ? new QAdmin(forProperty("admin"), inits.get("admin")) : null;
        this.order = inits.isInitialized("order") ? new QOrder(forProperty("order"), inits.get("order")) : null;
    }

}

