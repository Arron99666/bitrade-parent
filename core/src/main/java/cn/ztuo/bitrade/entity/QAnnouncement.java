package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAnnouncement is a Querydsl query type for Announcement
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAnnouncement extends EntityPathBase<Announcement> {

    private static final long serialVersionUID = -1414780630L;

    public static final QAnnouncement announcement = new QAnnouncement("announcement");

    public final StringPath content = createString("content");

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath imgUrl = createString("imgUrl");

    public final BooleanPath isShow = createBoolean("isShow");

    public final StringPath isTop = createString("isTop");

    public final NumberPath<Integer> sort = createNumber("sort", Integer.class);

    public final StringPath title = createString("title");

    public QAnnouncement(String variable) {
        super(Announcement.class, forVariable(variable));
    }

    public QAnnouncement(Path<? extends Announcement> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAnnouncement(PathMetadata metadata) {
        super(Announcement.class, metadata);
    }

}

