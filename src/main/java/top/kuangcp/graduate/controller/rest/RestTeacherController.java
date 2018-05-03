package top.kuangcp.graduate.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.kuangcp.graduate.service.crud.CrudTeacherService;

/**
 * Created by https://github.com/kuangcp
 *
 * @author kuangcp
 * @date 18-5-1  下午11:43
 */
@RestController
@RequestMapping("/rest/teacher")
public class RestTeacherController {

    private final CrudTeacherService teacherService;

    @Autowired
    public RestTeacherController(CrudTeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping(value = "/{teacherId}", produces = "application/json;charset=UTF-8")
    public String getOne(@PathVariable("teacherId") Long teacherId){
        return teacherService.getOne(teacherId);
    }
    @GetMapping(value = "/refer/{teacherId}", produces = "application/json;charset=UTF-8")
    public String getOneWithRefer(@PathVariable("teacherId") Long teacherId){
        return teacherService.getOneWithRefer(teacherId);
    }
}