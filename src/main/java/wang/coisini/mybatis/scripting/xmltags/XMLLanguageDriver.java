package wang.coisini.mybatis.scripting.xmltags;

import org.dom4j.Element;
import wang.coisini.mybatis.mapping.SqlSource;
import wang.coisini.mybatis.scripting.LanguageDriver;
import wang.coisini.mybatis.session.Configuration;

/**
 * @description: XML语言驱动器
 * @author: w_jingbo
 * @date: 2023/6/12
 * @Copyright: 博客：http://coisini.wang
 */
public class XMLLanguageDriver implements LanguageDriver {

    @Override
    public SqlSource createSqlSource(Configuration configuration, Element script, Class<?> parameterType) {
        // 用XML脚本构建器解析
        XMLScriptBuilder builder = new XMLScriptBuilder(configuration, script, parameterType);
        return builder.parseScriptNode();
    }
}
