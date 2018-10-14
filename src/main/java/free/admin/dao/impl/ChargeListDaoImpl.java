package free.admin.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import free.admin.dao.ChargeListDao;

@Repository
public class ChargeListDaoImpl implements ChargeListDao
{
	@Autowired
	SqlSession sqlSession;
	@Override
	public String chrList() 
	{
		sqlSession.selectList("Charge.ChargeList");
		return null;
	}

}
