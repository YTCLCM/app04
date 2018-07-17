package com.briup.app04.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app04.bean.QQ;
import com.briup.app04.service.impl.QQServiceImpl;
import com.briup.app04.util.MsgResponse;

import io.swagger.annotations.ApiOperation;
import springfox.documentation.annotations.ApiIgnore;

@ApiIgnore
@RestController
@RequestMapping("/qq")
public class QQController {
	// 注入ICourseService的实例
	@Autowired
	private QQServiceImpl qqService;
	
	@ApiOperation(value = "插入多条数据")
	@PostMapping("insertQQ")
	public MsgResponse inserts(@RequestBody List<QQ> list) {
		try {	
			qqService.inserts(list);
			return MsgResponse.success("插入成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "插入单条数据")
	@GetMapping("insertQQ")
	public MsgResponse insert(QQ answer) {
		try {
			qqService.insert(answer);
			return MsgResponse.success("插入成功", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "按ID删除数据")
	@GetMapping("deleteQQ")
	public MsgResponse delete(long id) {
		try {
			qqService.delete(id);
			return MsgResponse.success("删除成功", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "查找所有数据")
	@GetMapping("findAllQQ")
	public MsgResponse findAll() {
		try {
			List<QQ> list = qqService.findAll();
			return MsgResponse.success("查询成功", list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "按ID查找数据")
	@GetMapping("findByIdQQ")
	public MsgResponse findById(long id) {
		try {
			QQ qq=qqService.findById(id);
			return MsgResponse.success("查询成功", qq);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "更新数据")
	@GetMapping("updateQQ")
	public MsgResponse update(QQ answer) {
		try {
			qqService.update(answer);
			return MsgResponse.success("更新成功", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return MsgResponse.error(e.getMessage());
		}
	}
}
