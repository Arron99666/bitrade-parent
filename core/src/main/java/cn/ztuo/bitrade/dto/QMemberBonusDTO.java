package cn.ztuo.bitrade.dto;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMemberBonusDTO is a Querydsl query type for MemberBonusDTO
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMemberBonusDTO extends EntityPathBase<MemberBonusDTO> {

    private static final long serialVersionUID = -350105743L;

    public static final QMemberBonusDTO memberBonusDTO = new QMemberBonusDTO("memberBonusDTO");

    public final StringPath arriveTime = createString("arriveTime");

    public final StringPath coinId = createString("coinId");

    public final StringPath haveTime = createString("haveTime");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> memberId = createNumber("memberId", Long.class);

    public final NumberPath<java.math.BigDecimal> memBouns = createNumber("memBouns", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> total = createNumber("total", java.math.BigDecimal.class);

    public QMemberBonusDTO(String variable) {
        super(MemberBonusDTO.class, forVariable(variable));
    }

    public QMemberBonusDTO(Path<? extends MemberBonusDTO> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMemberBonusDTO(PathMetadata metadata) {
        super(MemberBonusDTO.class, metadata);
    }

}

