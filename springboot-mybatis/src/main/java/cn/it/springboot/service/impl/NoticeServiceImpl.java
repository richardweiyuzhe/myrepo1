package cn.it.springboot.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.it.springboot.domain.Notice;
import cn.it.springboot.mapper.NoticeMapper;
import cn.it.springboot.service.NoticeService;

@Service
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	private NoticeMapper noticeMapper;
	@Override
	public List<Notice> findAll() {
		return noticeMapper.findAll();
	}
	@Override
	public Map<String, Object> findByPage(Integer page, Integer rows) {
		/** 创建Map集合封装响应数据 */
		Map<String,Object> data = new HashMap<>();
		/** 统计查询 */
		Long count = noticeMapper.count();
		data.put("total", count);
		/** 分页查询 */
		List<Notice> notices = noticeMapper.findByPage(page, rows);
		data.put("rows", notices);
		return data;

	}

}
