package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberApplication is a Querydsl query type for MemberApplication
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMemberApplication extends EntityPathBase<MemberApplication> {

    private static final long serialVersionUID = 1766291539L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberApplication memberApplication = new QMemberApplication("memberApplication");

    public final EnumPath<cn.ztuo.bitrade.constant.AuditStatus> auditStatus = createEnum("auditStatus", cn.ztuo.bitrade.constant.AuditStatus.class);

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath idCard = createString("idCard");

    public final StringPath identityCardImgFront = createString("identityCardImgFront");

    public final StringPath identityCardImgInHand = createString("identityCardImgInHand");

    public final StringPath identityCardImgReverse = createString("identityCardImgReverse");

    public final QMember member;

    public final StringPath realName = createString("realName");

    public final StringPath rejectReason = createString("rejectReason");

    public final DateTimePath<java.util.Date> updateTime = createDateTime("updateTime", java.util.Date.class);

    public QMemberApplication(String variable) {
        this(MemberApplication.class, forVariable(variable), INITS);
    }

    public QMemberApplication(Path<? extends MemberApplication> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberApplication(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberApplication(PathMetadata metadata, PathInits inits) {
        this(MemberApplication.class, metadata, inits);
    }

    public QMemberApplication(Class<? extends MemberApplication> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member"), inits.get("member")) : null;
    }

}

