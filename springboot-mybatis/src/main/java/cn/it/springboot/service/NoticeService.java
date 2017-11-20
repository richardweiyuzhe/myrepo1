package cn.it.springboot.service;

import java.util.List;
import java.util.Map;

import cn.it.springboot.domain.Notice;

public interface NoticeService {
	
	public List<Notice> findAll();
	
	/** 分页查询公告 */
	public Map<String,Object> findByPage(Integer page, Integer rows);

}
