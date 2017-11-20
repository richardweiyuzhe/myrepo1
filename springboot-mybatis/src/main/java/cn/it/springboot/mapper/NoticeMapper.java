package cn.it.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.it.springboot.domain.Notice;

@Mapper
public interface NoticeMapper {

	/** 查询所有公告 */
	@Select("select * from notice")//没有sql配置文件时，sql语句可以用这种注解的方式写
	public List<Notice> findAll();
	
	/** 统计查询 */
	public Long count();
	/** 分页查询公告 ，在sql配置文件传两个独立的参数时需要使用以下注解*/
	public List<Notice> findByPage(@Param("page")Integer page,@Param("rows")Integer rows);

}
