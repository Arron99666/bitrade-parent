package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSysRole is a Querydsl query type for SysRole
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSysRole extends EntityPathBase<SysRole> {

    private static final long serialVersionUID = 1559725856L;

    public static final QSysRole sysRole = new QSysRole("sysRole");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<SysPermission, QSysPermission> permissions = this.<SysPermission, QSysPermission>createList("permissions", SysPermission.class, QSysPermission.class, PathInits.DIRECT2);

    public final StringPath role = createString("role");

    public QSysRole(String variable) {
        super(SysRole.class, forVariable(variable));
    }

    public QSysRole(Path<? extends SysRole> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSysRole(PathMetadata metadata) {
        super(SysRole.class, metadata);
    }

}

