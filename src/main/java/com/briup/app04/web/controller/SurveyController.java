package com.briup.app04.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app04.bean.Survey;
import com.briup.app04.service.impl.SurveyServiceImpl;
import com.briup.app04.util.MsgResponse;
import com.briup.app04.vm.SurveyVM;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description="课调相关的接口")
@RestController
@RequestMapping("/survey")
public class SurveyController {
	// 注入ICourseService的实例
	@Autowired
	private SurveyServiceImpl surveyService;
	
	@ApiOperation(value = "插入多条数据")
	@PostMapping("insertSurvey")
	public MsgResponse inserts(@RequestBody List<Survey> list) {
		try {	
			surveyService.inserts(list);
			return MsgResponse.success("插入成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "插入单条数据")
	@GetMapping("insertSurvey")
	public MsgResponse insert(Survey answer) {
		try {
			surveyService.insert(answer);
			return MsgResponse.success("插入成功", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "按ID删除数据")
	@GetMapping("deleteSurvey")
	public MsgResponse delete(long id) {
		try {
			surveyService.delete(id);
			return MsgResponse.success("删除成功", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "查找所有数据")
	@GetMapping("findAllSurvey")
	public MsgResponse findAll() {
		try {
			List<Survey> list = surveyService.findAll();
			return MsgResponse.success("查询成功", list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "按ID查找数据")
	@GetMapping("findByIdSurvey")
	public MsgResponse findById(long id) {
		try {
			Survey answer=surveyService.findById(id);
			return MsgResponse.success("查询成功", answer);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "更新数据")
	@GetMapping("updateSurvey")
	public MsgResponse update(Survey answer) {
		try {
			surveyService.update(answer);
			return MsgResponse.success("更新成功", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@ApiOperation(value = "查找所有的课调管理")
	@GetMapping("findAllSurveyVM")
	public MsgResponse findAllSurveyVM() {
		try {
			List<SurveyVM> list = surveyService.findAllSurveyVM();
			return MsgResponse.success("查询成功", list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
}
