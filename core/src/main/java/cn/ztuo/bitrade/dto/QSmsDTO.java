package cn.ztuo.bitrade.dto;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QSmsDTO is a Querydsl query type for SmsDTO
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSmsDTO extends EntityPathBase<SmsDTO> {

    private static final long serialVersionUID = 390406717L;

    public static final QSmsDTO smsDTO = new QSmsDTO("smsDTO");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath keyId = createString("keyId");

    public final StringPath keySecret = createString("keySecret");

    public final StringPath signId = createString("signId");

    public final StringPath smsName = createString("smsName");

    public final StringPath smsStatus = createString("smsStatus");

    public final StringPath templateId = createString("templateId");

    public QSmsDTO(String variable) {
        super(SmsDTO.class, forVariable(variable));
    }

    public QSmsDTO(Path<? extends SmsDTO> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSmsDTO(PathMetadata metadata) {
        super(SmsDTO.class, metadata);
    }

}

