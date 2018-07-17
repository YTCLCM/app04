package com.briup.app04.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app04.bean.User;
import com.briup.app04.service.impl.UserServiceImpl;
import com.briup.app04.util.MsgResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description="用户相关接口")
@RestController
@RequestMapping("/user")
public class UserController {
	// 注入ICourseService的实例
	@Autowired
	private UserServiceImpl userService;
	
	@ApiOperation(value = "插入多条数据")
	@PostMapping("insertUser")
	public MsgResponse inserts(@RequestBody List<User> list) {
		try {	
			userService.inserts(list);
			return MsgResponse.success("插入成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "插入单条数据")
	@GetMapping("insertUser")
	public MsgResponse insert(User answer) {
		try {
			userService.insert(answer);
			return MsgResponse.success("插入成功", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "按ID删除数据")
	@GetMapping("deleteUser")
	public MsgResponse delete(long id) {
		try {
			userService.delete(id);
			return MsgResponse.success("删除成功", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "查找所有数据")
	@GetMapping("findAllUser")
	public MsgResponse findAll() {
		try {
			List<User> list = userService.findAll();
			return MsgResponse.success("查询成功", list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "按ID查找数据")
	@GetMapping("findByIdUser")
	public MsgResponse findById(long id) {
		try {
			User user=userService.findById(id);
			return MsgResponse.success("查询成功", user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "更新数据")
	@GetMapping("updateUser")
	public MsgResponse update(User answer) {
		try {
			userService.update(answer);
			return MsgResponse.success("更新成功", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return MsgResponse.error(e.getMessage());
		}
	}
}
