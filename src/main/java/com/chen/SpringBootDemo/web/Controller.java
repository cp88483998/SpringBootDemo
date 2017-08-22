package com.chen.SpringBootDemo.web;
/*
 * web包需放到SpringBootDemo包下，不然会报404
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @RestController的意思就是controller里面的方法都以json格式输出，不用再写什么jackjson配置的了！
 */
@RestController
public class Controller {

	@RequestMapping("/hello")
	public String index(){
		return "Hello World!";
	}
}
