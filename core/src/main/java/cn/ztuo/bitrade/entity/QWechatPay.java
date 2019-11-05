package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QWechatPay is a Querydsl query type for WechatPay
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QWechatPay extends BeanPath<WechatPay> {

    private static final long serialVersionUID = 118586015L;

    public static final QWechatPay wechatPay = new QWechatPay("wechatPay");

    public final StringPath qrWeCodeUrl = createString("qrWeCodeUrl");

    public final StringPath wechat = createString("wechat");

    public QWechatPay(String variable) {
        super(WechatPay.class, forVariable(variable));
    }

    public QWechatPay(Path<? extends WechatPay> path) {
        super(path.getType(), path.getMetadata());
    }

    public QWechatPay(PathMetadata metadata) {
        super(WechatPay.class, metadata);
    }

}

