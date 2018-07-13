package com.briup.app04.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app04.bean.Student;
import com.briup.app04.service.impl.StudentServiceImpl;
import com.briup.app04.util.MsgResponse;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentServiceImpl studentService;
	
	/**
	 * 查找数据
	 * @return
	 */
	@ApiOperation(value = "查找数据")
	@GetMapping("findAllStudent")
	public MsgResponse findAllStudent(){
		List<Student> list=null;
		try {
			list=studentService.findAll();
			return MsgResponse.success("查询成功", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	/**
	 * 按ID查找数据
	 * @param id
	 * @return Student
	 */
	@ApiOperation(value = "按ID查找数据")
	@GetMapping("findByIdStudent")
	public MsgResponse findStudentById(long id){
		try {
			return MsgResponse.success("查找成功", studentService.findById(id));
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}	
	}
	@ApiOperation(value = "更新数据")
	@GetMapping("updateStudent")
	public MsgResponse updateStudent(Student student){
		try{
			studentService.update(student);
			return MsgResponse.success("更新成功", null);
		}catch(Exception e){
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@ApiOperation(value = "插入单条数据")
	@GetMapping("insertStudent")
	public MsgResponse insertStudent(Student student){
		try {
			studentService.insert(student);
			return MsgResponse.success("插入成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@ApiOperation(value = "按ID删除数据")
	@GetMapping("deleteStudent")
	public MsgResponse deleteStudent(long id){
		try {
			studentService.delete(id);
			return MsgResponse.success("删除成功", null);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
}
