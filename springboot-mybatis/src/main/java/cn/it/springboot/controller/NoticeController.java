package cn.it.springboot.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.it.springboot.domain.Notice;
import cn.it.springboot.service.NoticeService;

@Controller
public class NoticeController {

	@Resource
	private NoticeService noticeService;
	@GetMapping("/fillAllNotice")
	@ResponseBody
	public List<Notice> fillAllNotice() {
		return noticeService.findAll();
	}
	
	@GetMapping("/show")
	public String show(){
		return "/html/notice.html";
		
	}
	/** 分页查询公告 */
	@PostMapping("/findByPage")
	@ResponseBody
	public Map<String,Object> findByPage(@RequestParam(value="page",
							defaultValue="1",required=false)Integer page,
							@RequestParam(value="rows",
							defaultValue="15",required=false)Integer rows){
		return noticeService.findByPage((page - 1) * rows, rows);
	}

}
