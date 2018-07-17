package com.briup.app04.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app04.bean.Grade;
import com.briup.app04.service.impl.GradeServiceImpl;
import com.briup.app04.util.MsgResponse;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/grade")
public class GradeController {
	// 注入ICourseService的实例
	@Autowired
	private GradeServiceImpl gradeService;
	
	@ApiOperation(value = "插入多条数据")
	@PostMapping("insertGrade")
	public MsgResponse inserts(@RequestBody List<Grade> list) {
		try {	
			gradeService.inserts(list);
			return MsgResponse.success("插入成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "插入单条数据")
	@GetMapping("insertGrade")
	public MsgResponse insert(Grade grade) {
		try {
			gradeService.insert(grade);
			return MsgResponse.success("插入成功", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "按ID删除数据")
	@GetMapping("deleteGrade")
	public MsgResponse delete(long id) {
		try {
			gradeService.delete(id);
			return MsgResponse.success("删除成功", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "查找所有数据")
	@GetMapping("findAllGrade")
	public MsgResponse findAll() {
		try {
			List<Grade> list = gradeService.findAll();
			return MsgResponse.success("查询成功", list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "按ID查找数据")
	@GetMapping("findByIdGrade")
	public MsgResponse findById(long id) {
		try {
			Grade grade=gradeService.findById(id);
			return MsgResponse.success("查询成功", grade);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "更新数据")
	@GetMapping("updateGrade")
	public MsgResponse update(Grade grade) {
		try {
			gradeService.update(grade);
			return MsgResponse.success("更新成功", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return MsgResponse.error(e.getMessage());
		}
	}
}
