package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSysPermission is a Querydsl query type for SysPermission
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSysPermission extends EntityPathBase<SysPermission> {

    private static final long serialVersionUID = -1431395079L;

    public static final QSysPermission sysPermission = new QSysPermission("sysPermission");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final NumberPath<Long> parentId = createNumber("parentId", Long.class);

    public final ListPath<SysRole, QSysRole> roles = this.<SysRole, QSysRole>createList("roles", SysRole.class, QSysRole.class, PathInits.DIRECT2);

    public final NumberPath<Integer> sort = createNumber("sort", Integer.class);

    public final StringPath title = createString("title");

    public QSysPermission(String variable) {
        super(SysPermission.class, forVariable(variable));
    }

    public QSysPermission(Path<? extends SysPermission> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSysPermission(PathMetadata metadata) {
        super(SysPermission.class, metadata);
    }

}

