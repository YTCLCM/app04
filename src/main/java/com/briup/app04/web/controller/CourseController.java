package com.briup.app04.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app04.bean.Course;
import com.briup.app04.service.impl.CourseServiceImpl;
import com.briup.app04.util.MsgResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description="课程相关的接口")
@RestController
@RequestMapping("/course")
public class CourseController {
	// 注入ICourseService的实例
	@Autowired
	private CourseServiceImpl courseService;
	
	@ApiOperation(value = "插入多条数据")
	@PostMapping("insertCourse")
	public MsgResponse inserts(@RequestBody List<Course> list) {
		try {	
			courseService.inserts(list);
			return MsgResponse.success("插入成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "插入单条数据")
	@GetMapping("insertCourse")
	public MsgResponse insert(Course course) {
		try {
			courseService.insert(course);
			return MsgResponse.success("插入成功", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "按ID删除数据")
	@GetMapping("deleteCourse")
	public MsgResponse delete(long id) {
		try {
			courseService.delete(id);
			return MsgResponse.success("删除成功", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "查找所有数据")
	@GetMapping("findAllCourse")
	public MsgResponse findAll() {
		try {
			List<Course> list = courseService.findAll();
			return MsgResponse.success("查询成功", list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "按ID查找数据")
	@GetMapping("findByIdCourse")
	public MsgResponse findById(long id) {
		try {
			Course course=courseService.findById(id);
			return MsgResponse.success("查询成功", course);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "更新数据")
	@GetMapping("updateCourse")
	public MsgResponse update(Course course) {
		try {
			courseService.update(course);
			return MsgResponse.success("更新成功", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return MsgResponse.error(e.getMessage());
		}
	}
}
