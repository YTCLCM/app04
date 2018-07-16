package com.briup.app04.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app04.bean.Questionnaire;
import com.briup.app04.service.impl.QuestionnaireServiceImpl;
import com.briup.app04.util.MsgResponse;

import io.swagger.annotations.ApiOperation;
@RestController
@RequestMapping("/questionnaire")
public class QuestionnaireController {
	// 注入ICourseService的实例
	@Autowired
	private QuestionnaireServiceImpl questionnaireService;
	
	@ApiOperation(value = "插入多条数据")
	@PostMapping("insertQuestionnaire")
	public MsgResponse inserts(@RequestBody List<Questionnaire> list) {
		try {	
			questionnaireService.inserts(list);
			return MsgResponse.success("插入成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "插入单条数据")
	@GetMapping("insertQuestionnaire")
	public MsgResponse insert(Questionnaire questionnaire) {
		try {
			questionnaireService.insert(questionnaire);
			return MsgResponse.success("插入成功", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "按ID删除数据")
	@GetMapping("deleteQuestionnaire")
	public MsgResponse delete(long id) {
		try {
			questionnaireService.delete(id);
			return MsgResponse.success("删除成功", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "查找所有数据")
	@GetMapping("findAllQuestionnaire")
	public MsgResponse findAll() {
		try {
			List<Questionnaire> list = questionnaireService.findAll();
			return MsgResponse.success("查询成功", list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "按ID查找数据")
	@GetMapping("findByIdQuestionnaire")
	public MsgResponse findById(long id) {
		try {
			Questionnaire answer=questionnaireService.findById(id);
			return MsgResponse.success("查询成功", answer);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "更新数据")
	@GetMapping("updateQuestionnaire")
	public MsgResponse update(Questionnaire answer) {
		try {
			questionnaireService.update(answer);
			return MsgResponse.success("更新成功", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return MsgResponse.error(e.getMessage());
		}
	}
}
