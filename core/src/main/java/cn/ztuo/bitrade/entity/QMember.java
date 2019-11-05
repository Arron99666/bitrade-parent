package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMember is a Querydsl query type for Member
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMember extends EntityPathBase<Member> {

    private static final long serialVersionUID = -1248473923L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMember member = new QMember("member1");

    public final QAlipay alipay;

    public final NumberPath<Integer> appealSuccessTimes = createNumber("appealSuccessTimes", Integer.class);

    public final NumberPath<Integer> appealTimes = createNumber("appealTimes", Integer.class);

    public final DateTimePath<java.util.Date> applicationTime = createDateTime("applicationTime", java.util.Date.class);

    public final StringPath avatar = createString("avatar");

    public final QBankInfo bankInfo;

    public final DateTimePath<java.util.Date> certifiedBusinessApplyTime = createDateTime("certifiedBusinessApplyTime", java.util.Date.class);

    public final DateTimePath<java.util.Date> certifiedBusinessCheckTime = createDateTime("certifiedBusinessCheckTime", java.util.Date.class);

    public final EnumPath<cn.ztuo.bitrade.constant.CertifiedBusinessStatus> certifiedBusinessStatus = createEnum("certifiedBusinessStatus", cn.ztuo.bitrade.constant.CertifiedBusinessStatus.class);

    public final QCountry country;

    public final StringPath email = createString("email");

    public final NumberPath<Integer> firstLevel = createNumber("firstLevel", Integer.class);

    public final DateTimePath<java.util.Date> googleDate = createDateTime("googleDate", java.util.Date.class);

    public final StringPath googleKey = createString("googleKey");

    public final NumberPath<Integer> googleState = createNumber("googleState", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath idNumber = createString("idNumber");

    public final NumberPath<Long> inviterId = createNumber("inviterId", Long.class);

    public final StringPath jyPassword = createString("jyPassword");

    public final DateTimePath<java.util.Date> lastLoginTime = createDateTime("lastLoginTime", java.util.Date.class);

    public final QLocation location;

    public final NumberPath<Integer> loginCount = createNumber("loginCount", Integer.class);

    public final StringPath margin = createString("margin");

    public final EnumPath<cn.ztuo.bitrade.constant.MemberLevelEnum> memberLevel = createEnum("memberLevel", cn.ztuo.bitrade.constant.MemberLevelEnum.class);

    public final StringPath mobilePhone = createString("mobilePhone");

    public final StringPath password = createString("password");

    public final StringPath promotionCode = createString("promotionCode");

    public final EnumPath<cn.ztuo.bitrade.constant.BooleanEnum> publishAdvertise = createEnum("publishAdvertise", cn.ztuo.bitrade.constant.BooleanEnum.class);

    public final StringPath realName = createString("realName");

    public final EnumPath<cn.ztuo.bitrade.constant.RealNameStatus> realNameStatus = createEnum("realNameStatus", cn.ztuo.bitrade.constant.RealNameStatus.class);

    public final DateTimePath<java.util.Date> registrationTime = createDateTime("registrationTime", java.util.Date.class);

    public final StringPath salt = createString("salt");

    public final NumberPath<Integer> secondLevel = createNumber("secondLevel", Integer.class);

    public final BooleanPath signInAbility = createBoolean("signInAbility");

    public final EnumPath<cn.ztuo.bitrade.constant.CommonStatus> status = createEnum("status", cn.ztuo.bitrade.constant.CommonStatus.class);

    public final StringPath superPartner = createString("superPartner");

    public final NumberPath<Integer> thirdLevel = createNumber("thirdLevel", Integer.class);

    public final StringPath token = createString("token");

    public final DateTimePath<java.util.Date> tokenExpireTime = createDateTime("tokenExpireTime", java.util.Date.class);

    public final NumberPath<Integer> transactions = createNumber("transactions", Integer.class);

    public final EnumPath<cn.ztuo.bitrade.constant.BooleanEnum> transactionStatus = createEnum("transactionStatus", cn.ztuo.bitrade.constant.BooleanEnum.class);

    public final StringPath username = createString("username");

    public final QWechatPay wechatPay;

    public QMember(String variable) {
        this(Member.class, forVariable(variable), INITS);
    }

    public QMember(Path<? extends Member> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMember(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMember(PathMetadata metadata, PathInits inits) {
        this(Member.class, metadata, inits);
    }

    public QMember(Class<? extends Member> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.alipay = inits.isInitialized("alipay") ? new QAlipay(forProperty("alipay")) : null;
        this.bankInfo = inits.isInitialized("bankInfo") ? new QBankInfo(forProperty("bankInfo")) : null;
        this.country = inits.isInitialized("country") ? new QCountry(forProperty("country")) : null;
        this.location = inits.isInitialized("location") ? new QLocation(forProperty("location")) : null;
        this.wechatPay = inits.isInitialized("wechatPay") ? new QWechatPay(forProperty("wechatPay")) : null;
    }

}

