package wang.coisini.mybatis.session.defaults;

import wang.coisini.mybatis.binding.MapperRegistry;
import wang.coisini.mybatis.session.SqlSession;

/**
 * @description: 默认SqlSession实现类
 * @author: w_jingbo
 * @date: 2023/5/20
 * @Copyright: 博客：http://coisini.wang
 */
public class DefaultSqlSession implements SqlSession {

    /**
     * 映射器注册机
     */
    private MapperRegistry mapperRegistry;

    public DefaultSqlSession(MapperRegistry mapperRegistry) {
        this.mapperRegistry = mapperRegistry;
    }

    @Override
    public <T> T selectOne(String statement) {
        return (T) ("你被代理了！" + statement);
    }

    @Override
    public <T> T selectOne(String statement, Object parameter) {
        return (T) ("你被代理了！" + "方法：" + statement + " 入参：" + parameter);
    }


    //获取映射器代理
    @Override
    public <T> T getMapper(Class<T> type) {
        return mapperRegistry.getMapper(type, this);
    }
}
