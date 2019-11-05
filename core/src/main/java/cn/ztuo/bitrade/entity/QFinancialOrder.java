package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QFinancialOrder is a Querydsl query type for FinancialOrder
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QFinancialOrder extends EntityPathBase<FinancialOrder> {

    private static final long serialVersionUID = -1721985176L;

    public static final QFinancialOrder financialOrder = new QFinancialOrder("financialOrder");

    public final StringPath coinName = createString("coinName");

    public final NumberPath<java.math.BigDecimal> coinNum = createNumber("coinNum", java.math.BigDecimal.class);

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final NumberPath<Integer> frozenDays = createNumber("frozenDays", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath itemId = createString("itemId");

    public final NumberPath<Long> memberId = createNumber("memberId", Long.class);

    public final NumberPath<Long> orderNo = createNumber("orderNo", Long.class);

    public final NumberPath<Integer> orderState = createNumber("orderState", Integer.class);

    public final NumberPath<Double> orderUsdtRate = createNumber("orderUsdtRate", Double.class);

    public final DateTimePath<java.util.Date> planRevenueTime = createDateTime("planRevenueTime", java.util.Date.class);

    public final NumberPath<java.math.BigDecimal> realIncome = createNumber("realIncome", java.math.BigDecimal.class);

    public final DateTimePath<java.util.Date> updateTime = createDateTime("updateTime", java.util.Date.class);

    public QFinancialOrder(String variable) {
        super(FinancialOrder.class, forVariable(variable));
    }

    public QFinancialOrder(Path<? extends FinancialOrder> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFinancialOrder(PathMetadata metadata) {
        super(FinancialOrder.class, metadata);
    }

}

