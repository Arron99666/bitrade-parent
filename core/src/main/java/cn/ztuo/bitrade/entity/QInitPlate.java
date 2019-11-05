package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QInitPlate is a Querydsl query type for InitPlate
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QInitPlate extends EntityPathBase<InitPlate> {

    private static final long serialVersionUID = -483748125L;

    public static final QInitPlate initPlate = new QInitPlate("initPlate");

    public final StringPath finalPrice = createString("finalPrice");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath initPrice = createString("initPrice");

    public final StringPath interferenceFactor = createString("interferenceFactor");

    public final StringPath relativeTime = createString("relativeTime");

    public final StringPath symbol = createString("symbol");

    public QInitPlate(String variable) {
        super(InitPlate.class, forVariable(variable));
    }

    public QInitPlate(Path<? extends InitPlate> path) {
        super(path.getType(), path.getMetadata());
    }

    public QInitPlate(PathMetadata metadata) {
        super(InitPlate.class, metadata);
    }

}

