package wang.coisini.mybatis.builder;

import wang.coisini.mybatis.session.Configuration;
import wang.coisini.mybatis.type.TypeAliasRegistry;

/**
 * @description: 构建器的基类，建造者模式
 * @author: w_jingbo
 * @date: 2023/5/20
 * @Copyright: 博客：http://coisini.wang
 */
public abstract class BaseBuilder {

    protected final Configuration configuration;
    protected final TypeAliasRegistry typeAliasRegistry;

    public BaseBuilder(Configuration configuration) {
        this.configuration = configuration;
        this.typeAliasRegistry = this.configuration.getTypeAliasRegistry();
    }

    public Configuration getConfiguration() {
        return configuration;
    }
}
