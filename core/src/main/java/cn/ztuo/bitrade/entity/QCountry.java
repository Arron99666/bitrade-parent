package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCountry is a Querydsl query type for Country
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCountry extends EntityPathBase<Country> {

    private static final long serialVersionUID = -39036461L;

    public static final QCountry country = new QCountry("country");

    public final StringPath areaCode = createString("areaCode");

    public final StringPath enName = createString("enName");

    public final StringPath language = createString("language");

    public final StringPath localCurrency = createString("localCurrency");

    public final NumberPath<Integer> sort = createNumber("sort", Integer.class);

    public final StringPath zhName = createString("zhName");

    public QCountry(String variable) {
        super(Country.class, forVariable(variable));
    }

    public QCountry(Path<? extends Country> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCountry(PathMetadata metadata) {
        super(Country.class, metadata);
    }

}

