package free.admin.service;

import java.util.HashMap;
import java.util.List;

import free.admin.vo.ChargeListVo;

public interface ChargeListService 
{

	public List<ChargeListVo> chargeList(HashMap<String,Object> map);

}
