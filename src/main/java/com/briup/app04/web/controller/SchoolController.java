package com.briup.app04.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app04.bean.School;
import com.briup.app04.service.impl.SchoolServiceImpl;
import com.briup.app04.util.MsgResponse;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/school")
public class SchoolController {
	@Autowired
	private SchoolServiceImpl schoolService;
	
	@ApiOperation(value = "插入多条数据")
	@PostMapping("insertSchool")
	public MsgResponse inserts(@RequestBody List<School> list) {
		try {	
			schoolService.inserts(list);
			return MsgResponse.success("插入成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "插入单条数据")
	@GetMapping("insertSchool")
	public MsgResponse insert(School school) {
		try {
			schoolService.insert(school);
			return MsgResponse.success("插入成功", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "按ID删除数据")
	@GetMapping("deleteSchool")
	public MsgResponse delete(long id) {
		try {
			schoolService.delete(id);
			return MsgResponse.success("删除成功", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "查找所有数据")
	@GetMapping("findAllSchool")
	public MsgResponse findAll() {
		try {
			List<School> list = schoolService.findAll();
			return MsgResponse.success("查询成功", list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "按ID查找数据")
	@GetMapping("findByIdSchool")
	public MsgResponse findById(long id) {
		try {
			School school=schoolService.findById(id);
			return MsgResponse.success("查询成功", school);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "更新数据")
	@GetMapping("updateSchool")
	public MsgResponse update(School school) {
		try {
			schoolService.update(school);
			return MsgResponse.success("更新成功", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return MsgResponse.error(e.getMessage());
		}
	}
}
