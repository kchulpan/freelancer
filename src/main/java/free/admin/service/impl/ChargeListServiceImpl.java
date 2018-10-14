package free.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import free.admin.dao.ChargeListDao;
import free.admin.service.ChargeListService;

@Service
public class ChargeListServiceImpl implements ChargeListService
{
	@Autowired
	ChargeListDao chargeListdDao;
	
	@Override
	public String chrList() 
	{
		chargeListdDao.chrList();
		return null;
	}

}
