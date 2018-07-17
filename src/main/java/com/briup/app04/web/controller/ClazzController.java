package com.briup.app04.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app04.bean.Clazz;
import com.briup.app04.service.impl.ClazzServiceImpl;
import com.briup.app04.service.impl.GradeServiceImpl;
import com.briup.app04.service.impl.UserServiceImpl;
import com.briup.app04.util.MsgResponse;
import com.briup.app04.vm.ClazzVM;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description="班级相关接口")
@RestController
@RequestMapping("/clazz")
public class ClazzController {
	// 注入ICourseService的实例
	@Autowired
	private ClazzServiceImpl clazzService;
	@Autowired
	private GradeServiceImpl gradeService;
	@Autowired
	private UserServiceImpl userService;
	
	
	@PostMapping("insertclazz")
	public MsgResponse inserts(@RequestBody List<Clazz> list) {
		try {	
			clazzService.inserts(list);
			return MsgResponse.success("插入成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "插入单条数据")
	@GetMapping("insertclazz")
	public MsgResponse insert(Clazz clazz) {
		try {
			clazzService.insert(clazz);
			return MsgResponse.success("插入成功", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "按ID删除数据")
	@GetMapping("deleteclazz")
	public MsgResponse delete(long id) {
		try {
			clazzService.delete(id);
			return MsgResponse.success("删除成功", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "查找所有数据")
	@GetMapping("findAllclazz")
	public MsgResponse findAll() {
		try {
			List<Clazz> list = clazzService.findAll();
			return MsgResponse.success("查询成功", list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "按ID查找数据")
	@GetMapping("findByIdclazz")
	public MsgResponse findById(long id) {
		try {
			Clazz clazz=clazzService.findById(id);
			return MsgResponse.success("查询成功", clazz);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "更新数据")
	@GetMapping("updateclazz")
	public MsgResponse update(Clazz clazz) {
		try {
			clazzService.update(clazz);
			return MsgResponse.success("更新成功", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@ApiOperation(value = "查找所有数据")
	@GetMapping("findAllclazzVM")
	public MsgResponse findAllClazzVM() {
		try {
			List<ClazzVM> list = clazzService.findAllClazzVM();
			return MsgResponse.success("查询成功", list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@ApiOperation(value = "添加课程管理数据")
	@GetMapping("insertclazzVM")
	public MsgResponse insertVM(long id,String name,String description,String grade_name,String user_name) {
		try {		
			
			Clazz clazz =new Clazz();
			clazz.setId(id);
			clazz.setName(name);
			clazz.setDescription(description);
			clazz.setGrade_id(gradeService.findByName(grade_name).getId());
			clazz.setUser_id(userService.findByName(user_name).getId());			
			clazzService.insert(clazz);
			return MsgResponse.success("插入成功", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return MsgResponse.error(e.getMessage());
		}
	}
}
