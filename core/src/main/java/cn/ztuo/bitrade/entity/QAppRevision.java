package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAppRevision is a Querydsl query type for AppRevision
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAppRevision extends EntityPathBase<AppRevision> {

    private static final long serialVersionUID = -1364688679L;

    public static final QAppRevision appRevision = new QAppRevision("appRevision");

    public final StringPath downloadUrl = createString("downloadUrl");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final EnumPath<cn.ztuo.bitrade.constant.Platform> platform = createEnum("platform", cn.ztuo.bitrade.constant.Platform.class);

    public final DateTimePath<java.util.Date> publishTime = createDateTime("publishTime", java.util.Date.class);

    public final StringPath remark = createString("remark");

    public final StringPath version = createString("version");

    public QAppRevision(String variable) {
        super(AppRevision.class, forVariable(variable));
    }

    public QAppRevision(Path<? extends AppRevision> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAppRevision(PathMetadata metadata) {
        super(AppRevision.class, metadata);
    }

}

