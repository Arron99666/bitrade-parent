package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QFinancialItem is a Querydsl query type for FinancialItem
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QFinancialItem extends EntityPathBase<FinancialItem> {

    private static final long serialVersionUID = -1579745351L;

    public static final QFinancialItem financialItem = new QFinancialItem("financialItem");

    public final NumberPath<java.math.BigDecimal> coinMinnum = createNumber("coinMinnum", java.math.BigDecimal.class);

    public final StringPath coinName = createString("coinName");

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final NumberPath<Integer> deadline = createNumber("deadline", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath itemDesc = createString("itemDesc");

    public final StringPath itemId = createString("itemId");

    public final StringPath itemName = createString("itemName");

    public final NumberPath<Integer> itemState = createNumber("itemState", Integer.class);

    public final DateTimePath<java.util.Date> updateTime = createDateTime("updateTime", java.util.Date.class);

    public final NumberPath<Double> yield = createNumber("yield", Double.class);

    public QFinancialItem(String variable) {
        super(FinancialItem.class, forVariable(variable));
    }

    public QFinancialItem(Path<? extends FinancialItem> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFinancialItem(PathMetadata metadata) {
        super(FinancialItem.class, metadata);
    }

}

