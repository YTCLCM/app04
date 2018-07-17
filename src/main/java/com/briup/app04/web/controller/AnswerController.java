package com.briup.app04.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app04.bean.Answer;
import com.briup.app04.service.IAnswerService;
import com.briup.app04.util.MsgResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description="答卷相关的接口")
@RestController
@RequestMapping("/Answer")
public class AnswerController {
	// 注入ICourseService的实例
	@Autowired
	private IAnswerService answerService;
	
	@ApiOperation(value = "插入多条数据")
	@PostMapping("insertAnswer")
	public MsgResponse inserts(@RequestBody List<Answer> list) {
		try {	
			answerService.inserts(list);
			return MsgResponse.success("插入成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "插入单条数据")
	@GetMapping("insertAnswer")
	public MsgResponse insert(Answer answer) {
		try {
			answerService.insert(answer);
			return MsgResponse.success("插入成功", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "按ID删除数据")
	@GetMapping("deleteAnswer")
	public MsgResponse delete(long id) {
		try {
			answerService.delete(id);
			return MsgResponse.success("删除成功", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "查找所有数据")
	@GetMapping("findAllAnswer")
	public MsgResponse findAll() {
		try {
			List<Answer> list = answerService.findAll();
			return MsgResponse.success("查询成功", list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "按ID查找数据")
	@GetMapping("findByIdAnswer")
	public MsgResponse findById(long id) {
		try {
			Answer answer=answerService.findById(id);
			return MsgResponse.success("查询成功", answer);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "更新数据")
	@GetMapping("updateAnswer")
	public MsgResponse update(Answer answer) {
		try {
			answerService.update(answer);
			return MsgResponse.success("更新成功", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return MsgResponse.error(e.getMessage());
		}
	}
}
