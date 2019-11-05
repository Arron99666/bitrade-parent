package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QWebsiteInformation is a Querydsl query type for WebsiteInformation
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QWebsiteInformation extends EntityPathBase<WebsiteInformation> {

    private static final long serialVersionUID = -1202486476L;

    public static final QWebsiteInformation websiteInformation = new QWebsiteInformation("websiteInformation");

    public final StringPath addressIcon = createString("addressIcon");

    public final StringPath contact = createString("contact");

    public final StringPath copyright = createString("copyright");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath keywords = createString("keywords");

    public final StringPath logo = createString("logo");

    public final StringPath name = createString("name");

    public final StringPath otherInformation = createString("otherInformation");

    public final StringPath postcode = createString("postcode");

    public final StringPath url = createString("url");

    public QWebsiteInformation(String variable) {
        super(WebsiteInformation.class, forVariable(variable));
    }

    public QWebsiteInformation(Path<? extends WebsiteInformation> path) {
        super(path.getType(), path.getMetadata());
    }

    public QWebsiteInformation(PathMetadata metadata) {
        super(WebsiteInformation.class, metadata);
    }

}

