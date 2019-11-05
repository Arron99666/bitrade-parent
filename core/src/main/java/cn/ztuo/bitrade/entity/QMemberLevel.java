package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMemberLevel is a Querydsl query type for MemberLevel
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMemberLevel extends EntityPathBase<MemberLevel> {

    private static final long serialVersionUID = -485733177L;

    public static final QMemberLevel memberLevel = new QMemberLevel("memberLevel");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isDefault = createBoolean("isDefault");

    public final StringPath name = createString("name");

    public final StringPath remark = createString("remark");

    public QMemberLevel(String variable) {
        super(MemberLevel.class, forVariable(variable));
    }

    public QMemberLevel(Path<? extends MemberLevel> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMemberLevel(PathMetadata metadata) {
        super(MemberLevel.class, metadata);
    }

}

