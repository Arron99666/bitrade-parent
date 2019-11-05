package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMemberPromotion is a Querydsl query type for MemberPromotion
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMemberPromotion extends EntityPathBase<MemberPromotion> {

    private static final long serialVersionUID = -365472666L;

    public static final QMemberPromotion memberPromotion = new QMemberPromotion("memberPromotion");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> inviteesId = createNumber("inviteesId", Long.class);

    public final NumberPath<Long> inviterId = createNumber("inviterId", Long.class);

    public final EnumPath<cn.ztuo.bitrade.constant.PromotionLevel> level = createEnum("level", cn.ztuo.bitrade.constant.PromotionLevel.class);

    public QMemberPromotion(String variable) {
        super(MemberPromotion.class, forVariable(variable));
    }

    public QMemberPromotion(Path<? extends MemberPromotion> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMemberPromotion(PathMetadata metadata) {
        super(MemberPromotion.class, metadata);
    }

}

