package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAlipay is a Querydsl query type for Alipay
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QAlipay extends BeanPath<Alipay> {

    private static final long serialVersionUID = -1585664915L;

    public static final QAlipay alipay = new QAlipay("alipay");

    public final StringPath aliNo = createString("aliNo");

    public final StringPath qrCodeUrl = createString("qrCodeUrl");

    public QAlipay(String variable) {
        super(Alipay.class, forVariable(variable));
    }

    public QAlipay(Path<? extends Alipay> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAlipay(PathMetadata metadata) {
        super(Alipay.class, metadata);
    }

}

