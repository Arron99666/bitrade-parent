package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAdmin is a Querydsl query type for Admin
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAdmin extends EntityPathBase<Admin> {

    private static final long serialVersionUID = 1056993484L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAdmin admin = new QAdmin("admin");

    public final StringPath avatar = createString("avatar");

    public final QDepartment department;

    public final StringPath email = createString("email");

    public final EnumPath<cn.ztuo.bitrade.constant.CommonStatus> enable = createEnum("enable", cn.ztuo.bitrade.constant.CommonStatus.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastLoginIp = createString("lastLoginIp");

    public final DateTimePath<java.util.Date> lastLoginTime = createDateTime("lastLoginTime", java.util.Date.class);

    public final StringPath mobilePhone = createString("mobilePhone");

    public final StringPath password = createString("password");

    public final StringPath qq = createString("qq");

    public final StringPath realName = createString("realName");

    public final NumberPath<Long> roleId = createNumber("roleId", Long.class);

    public final EnumPath<cn.ztuo.bitrade.constant.CommonStatus> status = createEnum("status", cn.ztuo.bitrade.constant.CommonStatus.class);

    public final StringPath username = createString("username");

    public QAdmin(String variable) {
        this(Admin.class, forVariable(variable), INITS);
    }

    public QAdmin(Path<? extends Admin> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAdmin(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAdmin(PathMetadata metadata, PathInits inits) {
        this(Admin.class, metadata, inits);
    }

    public QAdmin(Class<? extends Admin> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.department = inits.isInitialized("department") ? new QDepartment(forProperty("department")) : null;
    }

}

