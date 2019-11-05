package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QBankInfo is a Querydsl query type for BankInfo
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QBankInfo extends BeanPath<BankInfo> {

    private static final long serialVersionUID = 1597417069L;

    public static final QBankInfo bankInfo = new QBankInfo("bankInfo");

    public final StringPath bank = createString("bank");

    public final StringPath branch = createString("branch");

    public final StringPath cardNo = createString("cardNo");

    public QBankInfo(String variable) {
        super(BankInfo.class, forVariable(variable));
    }

    public QBankInfo(Path<? extends BankInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBankInfo(PathMetadata metadata) {
        super(BankInfo.class, metadata);
    }

}

