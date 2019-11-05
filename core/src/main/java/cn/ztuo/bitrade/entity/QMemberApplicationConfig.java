package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMemberApplicationConfig is a Querydsl query type for MemberApplicationConfig
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMemberApplicationConfig extends EntityPathBase<MemberApplicationConfig> {

    private static final long serialVersionUID = -1558766219L;

    public static final QMemberApplicationConfig memberApplicationConfig = new QMemberApplicationConfig("memberApplicationConfig");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final EnumPath<cn.ztuo.bitrade.constant.BooleanEnum> promotionOn = createEnum("promotionOn", cn.ztuo.bitrade.constant.BooleanEnum.class);

    public final EnumPath<cn.ztuo.bitrade.constant.BooleanEnum> rechargeCoinOn = createEnum("rechargeCoinOn", cn.ztuo.bitrade.constant.BooleanEnum.class);

    public final EnumPath<cn.ztuo.bitrade.constant.BooleanEnum> transactionOn = createEnum("transactionOn", cn.ztuo.bitrade.constant.BooleanEnum.class);

    public final EnumPath<cn.ztuo.bitrade.constant.BooleanEnum> withdrawCoinOn = createEnum("withdrawCoinOn", cn.ztuo.bitrade.constant.BooleanEnum.class);

    public QMemberApplicationConfig(String variable) {
        super(MemberApplicationConfig.class, forVariable(variable));
    }

    public QMemberApplicationConfig(Path<? extends MemberApplicationConfig> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMemberApplicationConfig(PathMetadata metadata) {
        super(MemberApplicationConfig.class, metadata);
    }

}

