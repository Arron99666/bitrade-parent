package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QOtcCoin is a Querydsl query type for OtcCoin
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QOtcCoin extends EntityPathBase<OtcCoin> {

    private static final long serialVersionUID = 2146309388L;

    public static final QOtcCoin otcCoin = new QOtcCoin("otcCoin");

    public final NumberPath<java.math.BigDecimal> buyMinAmount = createNumber("buyMinAmount", java.math.BigDecimal.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final EnumPath<cn.ztuo.bitrade.constant.BooleanEnum> isPlatformCoin = createEnum("isPlatformCoin", cn.ztuo.bitrade.constant.BooleanEnum.class);

    public final NumberPath<java.math.BigDecimal> jyRate = createNumber("jyRate", java.math.BigDecimal.class);

    public final StringPath name = createString("name");

    public final StringPath nameCn = createString("nameCn");

    public final NumberPath<java.math.BigDecimal> sellMinAmount = createNumber("sellMinAmount", java.math.BigDecimal.class);

    public final NumberPath<Integer> sort = createNumber("sort", Integer.class);

    public final EnumPath<cn.ztuo.bitrade.constant.CommonStatus> status = createEnum("status", cn.ztuo.bitrade.constant.CommonStatus.class);

    public final StringPath unit = createString("unit");

    public QOtcCoin(String variable) {
        super(OtcCoin.class, forVariable(variable));
    }

    public QOtcCoin(Path<? extends OtcCoin> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOtcCoin(PathMetadata metadata) {
        super(OtcCoin.class, metadata);
    }

}

