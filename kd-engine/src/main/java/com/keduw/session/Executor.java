package com.keduw.session;

import com.keduw.pojo.Configuration;
import com.keduw.pojo.MappedStatement;

import java.util.List;

public interface Executor {

    public <E> List<E> query(Configuration configuration, MappedStatement mappedStatement, Object... params) throws Exception;

}
