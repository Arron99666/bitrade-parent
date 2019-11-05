package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QDataDictionary is a Querydsl query type for DataDictionary
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDataDictionary extends EntityPathBase<DataDictionary> {

    private static final long serialVersionUID = 1873977091L;

    public static final QDataDictionary dataDictionary = new QDataDictionary("dataDictionary");

    public final StringPath bond = createString("bond");

    public final StringPath comment = createString("comment");

    public final DateTimePath<java.util.Date> creationTime = createDateTime("creationTime", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.util.Date> updateTime = createDateTime("updateTime", java.util.Date.class);

    public final StringPath value = createString("value");

    public QDataDictionary(String variable) {
        super(DataDictionary.class, forVariable(variable));
    }

    public QDataDictionary(Path<? extends DataDictionary> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDataDictionary(PathMetadata metadata) {
        super(DataDictionary.class, metadata);
    }

}

