package cn.ztuo.bitrade.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCoin is a Querydsl query type for Coin
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCoin extends EntityPathBase<Coin> {

    private static final long serialVersionUID = 1696734580L;

    public static final QCoin coin = new QCoin("coin");

    public final EnumPath<cn.ztuo.bitrade.constant.BooleanEnum> canAutoWithdraw = createEnum("canAutoWithdraw", cn.ztuo.bitrade.constant.BooleanEnum.class);

    public final EnumPath<cn.ztuo.bitrade.constant.BooleanEnum> canRecharge = createEnum("canRecharge", cn.ztuo.bitrade.constant.BooleanEnum.class);

    public final EnumPath<cn.ztuo.bitrade.constant.BooleanEnum> canTransfer = createEnum("canTransfer", cn.ztuo.bitrade.constant.BooleanEnum.class);

    public final EnumPath<cn.ztuo.bitrade.constant.BooleanEnum> canWithdraw = createEnum("canWithdraw", cn.ztuo.bitrade.constant.BooleanEnum.class);

    public final NumberPath<Double> cnyRate = createNumber("cnyRate", Double.class);

    public final StringPath coldWalletAddress = createString("coldWalletAddress");

    public final EnumPath<cn.ztuo.bitrade.constant.BooleanEnum> enableRpc = createEnum("enableRpc", cn.ztuo.bitrade.constant.BooleanEnum.class);

    public final BooleanPath hasLegal = createBoolean("hasLegal");

    public final EnumPath<cn.ztuo.bitrade.constant.BooleanEnum> isPlatformCoin = createEnum("isPlatformCoin", cn.ztuo.bitrade.constant.BooleanEnum.class);

    public final NumberPath<Double> maxTxFee = createNumber("maxTxFee", Double.class);

    public final NumberPath<java.math.BigDecimal> maxWithdrawAmount = createNumber("maxWithdrawAmount", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> minerFee = createNumber("minerFee", java.math.BigDecimal.class);

    public final NumberPath<Double> minTxFee = createNumber("minTxFee", Double.class);

    public final NumberPath<java.math.BigDecimal> minWithdrawAmount = createNumber("minWithdrawAmount", java.math.BigDecimal.class);

    public final StringPath name = createString("name");

    public final StringPath nameCn = createString("nameCn");

    public final NumberPath<Integer> sort = createNumber("sort", Integer.class);

    public final EnumPath<cn.ztuo.bitrade.constant.CommonStatus> status = createEnum("status", cn.ztuo.bitrade.constant.CommonStatus.class);

    public final StringPath unit = createString("unit");

    public final NumberPath<Double> usdRate = createNumber("usdRate", Double.class);

    public final NumberPath<Integer> withdrawScale = createNumber("withdrawScale", Integer.class);

    public final NumberPath<java.math.BigDecimal> withdrawThreshold = createNumber("withdrawThreshold", java.math.BigDecimal.class);

    public QCoin(String variable) {
        super(Coin.class, forVariable(variable));
    }

    public QCoin(Path<? extends Coin> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCoin(PathMetadata metadata) {
        super(Coin.class, metadata);
    }

}

